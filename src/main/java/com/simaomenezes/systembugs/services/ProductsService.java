package com.simaomenezes.systembugs.services;

import java.util.List;

import com.simaomenezes.systembugs.models.Products;

public interface ProductsService {
	
	void save(Products products);
	void edit(Products products);
	void delete(Products products);
	List<Products> listAll();

}
