package br.com.caelum.contas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OlaMundoController {

	@RequestMapping("/OlaMundoSpring")
	public String executar(){
		
		System.out.println("Tudo certo at� agora");
		
		return "ok";
	}
	
	@RequestMapping("/testandoMetodo")
	public String executar2(){
		
		System.out.println("Testando outro m�dodo");
		
		return "ok";
	}

}
