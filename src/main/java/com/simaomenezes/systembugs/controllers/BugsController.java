package com.simaomenezes.systembugs.controllers;

import javax.inject.Inject;

import com.simaomenezes.systembugs.models.Bugs;
import com.simaomenezes.systembugs.services.AccountsService;
import com.simaomenezes.systembugs.services.BugsService;
import com.simaomenezes.systembugs.services.ProductsService;
import com.simaomenezes.systembugs.services.StatusService;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Result;

@Controller
public class BugsController {
	private Result result;
	private AccountsService accountsService;
	private ProductsService productsService;
	private StatusService statusService;
	private BugsService bugsService;
	
	@Inject
	public BugsController(Result result, AccountsService accountsService, ProductsService productsService, StatusService statusService, BugsService bugsService) {
		this.result = result;
		this.accountsService = accountsService;
		this.productsService = productsService;
		this.statusService = statusService;
		this.bugsService = bugsService;
	}
	
	public BugsController() {
	}
	
	
	@Get
	public void index(){
		result.include("bugs", bugsService.listAll());
	}
	
	public void form(){
		result.include("status", statusService.listAll());
		result.include("products", productsService.listAll());
		result.include("accounts", accountsService.listAll());
		
	}
	
	@Post
	public void salvar(Bugs bugs){
		bugsService.save(bugs);
		result.redirectTo(this).index();
	}
	
	
	
	
	
	

}
