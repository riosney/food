package com.escudo7.food;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.escudo7.food.di.notificacao.Notificador;
import com.escudo7.food.di.service.AtivacaoClienteService;

@Configuration
public class ServiceConfig {

	@Bean
	public AtivacaoClienteService ativacaoClienteService(Notificador notificador) {
		return new AtivacaoClienteService(notificador);
	}
	
}
