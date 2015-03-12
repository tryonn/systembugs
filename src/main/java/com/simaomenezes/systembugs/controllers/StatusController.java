package com.simaomenezes.systembugs.controllers;

import javax.inject.Inject;

import com.simaomenezes.systembugs.models.Status;
import com.simaomenezes.systembugs.services.StatusService;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Result;

@Controller
public class StatusController {
	
	private Result result;
	private StatusService statusService;
	
	@Inject
	public StatusController(Result result, StatusService statusService) {
		this.result = result;
		this.statusService = statusService;
	}
	
	public StatusController() {
		// TODO Auto-generated constructor stub
	}
	
	@Get("/status")
	public void index(){
		result.include("mensagem", "Lista de Status");
		result.include("status", statusService.listAll());
	}
	
	public void form(){
	}
	
	@Post
	public void salvar(Status status){
		statusService.save(status);
		result.redirectTo(this).index();
		result.include("sucesso", status.getName() + " Salvo com sucesso");
	}
	
}
