package com.simaomenezes.systembugs.controllers;

import javax.inject.Inject;

import com.simaomenezes.systembugs.models.Accounts;
import com.simaomenezes.systembugs.services.AccountsService;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Result;

@Controller
public class AccountsController {
	
	private Result result;
	private AccountsService accountsService;
	
	@Inject
	public AccountsController(Result result, AccountsService accountsService) {
		this.result = result;
		this.accountsService = accountsService;
	}
	
	public AccountsController() {}
	
	@Get("/usuarios")
	public void index(){
		result.include("mensagem", "Lista de Accounts");
		result.include("accounts", accountsService.listAll());
	}
	
	public void form(){}
	
	public void salvar(Accounts accounts){
		accountsService.save(accounts);
		result.redirectTo(this).index();
	}
}