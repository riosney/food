package com.escudo7.food.jpa;

import java.util.List;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import com.escudo7.food.Escudo7foodApiApplication;
import com.escudo7.food.domain.model.Cidade;
import com.escudo7.food.domain.model.repository.CidadeRepository;

public class ConsultaCidadeMain {
	
	public static void main(String[] args) {
		ApplicationContext applicationContext = new SpringApplicationBuilder(Escudo7foodApiApplication.class)
				.web(WebApplicationType.NONE)
				.run(args);
		
		CidadeRepository cidadeRepository = applicationContext.getBean(CidadeRepository.class);
		
		List<Cidade> todasCidades = cidadeRepository.listar();
		
		for (Cidade cidade : todasCidades) {
			System.out.printf("%s - %s\n", cidade.getNome(), cidade.getEstado().getNome());
		}
	}	

}
