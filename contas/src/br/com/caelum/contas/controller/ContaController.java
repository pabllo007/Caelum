package br.com.caelum.contas.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.caelum.contas.dao.ContaDAO;
import br.com.caelum.contas.modelo.Conta;

@Controller
public class ContaController {

	@RequestMapping("/form")
	public String executa(Conta conta){
		
		System.out.println("Acessando a p�gina do formul�rio");
		return "conta/formulario";
	}
	
	
	@RequestMapping("/adicionaConta")
	public String adiciona(Conta conta){
		ContaDAO dao = new ContaDAO();
		System.err.println("Cadastrando a conta: " + conta.getDescricao());
		dao.adiciona(conta);
		
		System.out.println("Conta adicionada com suscesso!");
		return "conta/conta-adicionada";
	}

	@RequestMapping("/lista")
	public ModelAndView lista(){
		
		ContaDAO dao = new ContaDAO();
		List<Conta> contas = dao.lista();
		
		ModelAndView mv = new ModelAndView("conta/lista");
		mv.addObject("todasContas",contas);
		return mv;
	}
}
