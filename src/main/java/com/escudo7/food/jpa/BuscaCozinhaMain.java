package com.escudo7.food.jpa;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import com.escudo7.food.Escudo7foodApiApplication;
import com.escudo7.food.domain.model.Cozinha;
import com.escudo7.food.domain.repository.CozinhaRepository;

public class BuscaCozinhaMain {
	
	public static void main(String[] args) {
		ApplicationContext applicationContext = new SpringApplicationBuilder(Escudo7foodApiApplication.class)
				.web(WebApplicationType.NONE)
				.run(args);
		
		CozinhaRepository cozinhas = applicationContext.getBean(CozinhaRepository.class);
		
		Cozinha cozinha = cozinhas.buscar(1L);
		
		System.out.println(cozinha.getNome());
		
	}	

}
