package com.escudo7.food;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.escudo7.food.di.notificacao.NotificadorEmail;

@Configuration
public class NotificacaoConfig {
	
	@Bean
	public NotificadorEmail notificadorEmail() {
		NotificadorEmail notificador = new NotificadorEmail("smtp.escudo7.com");
		notificador.setCaixaAlta(true);
		
		return notificador;
	}

}
