package com.simaomenezes.systembugs.services.impl;

import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.hibernate.procedure.internal.Util.ResultClassesResolutionContext;

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

	@Override
	public Accounts verificaUserPassword(String name, String password) {
		String jpql = "from Accounts where name = " + name + " and password = "+ password;
		TypedQuery<Accounts> query = manager.createQuery(jpql, Accounts.class);
		
		return query.setParameter(name, name).setParameter(password, password).getSingleResult();
	}
}
