package com.escudo7.food.di.service;

import org.springframework.stereotype.Component;

import com.escudo7.food.di.modelo.Cliente;
import com.escudo7.food.di.notificacao.NotificadorEmail;

@Component
public class AtivacaoClienteService {
	
	private NotificadorEmail notificador;
	
	public void ativar(Cliente cliente) {
		cliente.ativar();

		notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");
	}

}
