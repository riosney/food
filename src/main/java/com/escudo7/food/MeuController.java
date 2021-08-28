package com.escudo7.food;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.escudo7.food.di.modelo.Cliente;
import com.escudo7.food.di.service.AtivacaoClienteService;

@Controller
public class MeuController {
	
	private AtivacaoClienteService ativacaoClienteService;
	
	public MeuController(AtivacaoClienteService ativacaoClienteService) {
		this.ativacaoClienteService = ativacaoClienteService;
		
		System.out.println("MeuController: " + ativacaoClienteService);
	}

	@GetMapping("/hello")
	@ResponseBody
	public String hello() {
		Cliente maria = new Cliente("Maria", "maria@gmail.com", "9988775566");
		ativacaoClienteService.ativar(maria);
		
		return "hello";
	}

}
