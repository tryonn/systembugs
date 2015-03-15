package com.simaomenezes.systembugs.services.impl;

import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.google.common.hash.Hashing;
import com.simaomenezes.systembugs.models.Accounts;
import com.simaomenezes.systembugs.services.AccountsService;

public class AccountsImpl implements AccountsService{
	
	private EntityManager manager;
	
	@Inject
	public AccountsImpl(EntityManager manager) {
		this.manager = manager;
	}

	@SuppressWarnings("deprecation")
	@Override
	public void save(Accounts accounts) {
		String senha = Hashing.sha512().hashString(accounts.getPassword()).toString();
		accounts.setPassword(senha);
		manager.persist(accounts);
	}

	@Override
	public void edit(Accounts accounts) {
		manager.merge(accounts);
	}

	@Override
	public void delete(Accounts accounts) {
		manager.detach(accounts);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Accounts> listAll() {
		String pjql = "from Accounts order by name";
		Query query = manager.createQuery(pjql);
		return query.getResultList();
	}
}
