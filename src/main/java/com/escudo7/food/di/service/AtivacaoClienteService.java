package com.escudo7.food.di.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.escudo7.food.di.modelo.Cliente;
import com.escudo7.food.di.notificacao.Notificador;

@Component
public class AtivacaoClienteService {
	
	@Autowired
	private Notificador notificador;	

	public void ativar(Cliente cliente) {
		cliente.ativar();
		
		notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");			
		
	}
}
