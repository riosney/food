package com.escudo7.food.jpa;

import java.util.List;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import com.escudo7.food.Escudo7foodApiApplication;
import com.escudo7.food.domain.model.Cozinha;
import com.escudo7.food.domain.repository.CozinhaRepository;

public class ConsultaCozinhaMain {
	
	public static void main(String[] args) {
		ApplicationContext applicationContext = new SpringApplicationBuilder(Escudo7foodApiApplication.class)
				.web(WebApplicationType.NONE)
				.run(args);
		
		CozinhaRepository cozinhas = applicationContext.getBean(CozinhaRepository.class);
		
		List<Cozinha> todasCozinhas = cozinhas.listar();
		
		for (Cozinha cozinha : todasCozinhas) {
			System.out.println(cozinha.getNome());
		}
	}	

}
