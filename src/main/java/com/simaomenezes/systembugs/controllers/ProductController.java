package com.simaomenezes.systembugs.controllers;

import javax.inject.Inject;

import com.simaomenezes.systembugs.models.Products;
import com.simaomenezes.systembugs.services.ProductsService;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Result;

@Controller
public class ProductController {
	
	private Result result;
	private ProductsService productsService;
	
	@Inject
	public ProductController(Result result, ProductsService productsService) {
		this.result = result;
		this.productsService = productsService;
	}
	
	public ProductController() {}
	
	@Get("/produtos")
	public void index(){
		result.include("mensagem", "Products listagem ok");
		result.include("produtos", productsService.listAll());
	}
	
	public void form(){}
	
	public void salvar(Products products){
		productsService.save(products);
		result.redirectTo(this).index();
	} 
	
	

}
