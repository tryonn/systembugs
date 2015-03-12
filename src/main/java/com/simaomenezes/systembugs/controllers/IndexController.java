package com.simaomenezes.systembugs.controllers;

import javax.inject.Inject;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Result;


@Controller
public class IndexController {
	
	@Inject private Result result;
	
	public void index(){
		result.include("mensagem", "Ol� pessoal. Deus � bom.");
	}
}
