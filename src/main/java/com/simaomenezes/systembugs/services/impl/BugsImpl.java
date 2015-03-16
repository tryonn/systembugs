package com.simaomenezes.systembugs.services.impl;

import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.simaomenezes.systembugs.models.Bugs;
import com.simaomenezes.systembugs.services.BugsService;

public class BugsImpl implements BugsService{
	
	private EntityManager manager;

	@Inject
	public BugsImpl(EntityManager manager) {
		this.manager = manager;
	}
	
	@Override
	public void save(Bugs bugs) {
		manager.persist(bugs);
	}

	@Override
	public void edit(Bugs bugs) {
		manager.merge(bugs);
	}

	@Override
	public void delete(Bugs bugs) {
		manager.remove(bugs);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Bugs> listAll() {
		String jpql = "from Bugs order by id_product";
		Query query = manager.createQuery(jpql);
		return query.getResultList();
	}

}
