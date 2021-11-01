package com.escudo7.food.jpa;

import java.util.List;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import com.escudo7.food.Escudo7foodApiApplication;
import com.escudo7.food.domain.model.FormaPagamento;
import com.escudo7.food.domain.repository.FormaPagamentoRepository;

public class ConsultaPagamentoMain {
	
	public static void main(String[] args) {
		ApplicationContext applicationContext = new SpringApplicationBuilder(Escudo7foodApiApplication.class)
				.web(WebApplicationType.NONE)
				.run(args);
		
		FormaPagamentoRepository formaPagamentos = applicationContext.getBean(FormaPagamentoRepository.class);
		
		List<FormaPagamento> todasFormaPagamentos = formaPagamentos.listar();
		
		for (FormaPagamento formaPagamento : todasFormaPagamentos) {
			System.out.println(formaPagamento.getDescricao());
		}
	}	

}
