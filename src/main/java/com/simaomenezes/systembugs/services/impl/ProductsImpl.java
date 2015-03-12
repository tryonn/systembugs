package com.simaomenezes.systembugs.services.impl;

import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.simaomenezes.systembugs.models.Products;
import com.simaomenezes.systembugs.services.ProductsService;

public class ProductsImpl implements ProductsService{
	
	private EntityManager manager;
	
	@Inject
	public ProductsImpl(EntityManager manager) {
		this.manager = manager;
	}

	@Override
	public void save(Products products) {
		manager.persist(products);
	}

	@Override
	public void edit(Products products) {
		manager.merge(products);
	}

	@Override
	public void delete(Products products) {
		manager.remove(products);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Products> listAll() {
		String jpql = "from Products order by name";
		Query query = manager.createQuery(jpql);
		return query.getResultList();
	}

}
