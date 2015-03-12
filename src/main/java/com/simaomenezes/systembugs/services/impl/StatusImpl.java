package com.simaomenezes.systembugs.services.impl;

import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.simaomenezes.systembugs.models.Status;
import com.simaomenezes.systembugs.services.StatusService;

public class StatusImpl implements StatusService{
	
	private EntityManager manager;
	
	@Inject
	public StatusImpl(EntityManager manager) {
		this.manager = manager;
	}

	@Override
	public void save(Status status) {
		manager.persist(status);
	}

	@Override
	public void edit(Status status) {
		manager.merge(status);
	}

	@Override
	public void delete(Status status) {
		manager.remove(status);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Status> listAll() {
		String jpql = "from Status order by name";
		Query query = manager.createQuery(jpql);
		return query.getResultList();
	}

}
