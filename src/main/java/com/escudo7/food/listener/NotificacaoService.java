package com.escudo7.food.listener;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import com.escudo7.food.di.notificacao.NivelUrgencia;
import com.escudo7.food.di.notificacao.Notificador;
import com.escudo7.food.di.notificacao.TipoDoNotificador;
import com.escudo7.food.di.service.ClienteAtivadoEvent;

@Component
public class NotificacaoService {
	
	@TipoDoNotificador(NivelUrgencia.SEM_URGENCIA)
	@Autowired
	private Notificador notificador;
	
	@EventListener
	public void clienteAtivadoListener(ClienteAtivadoEvent event) {
		notificador.notificar(event.getCliente(), "Cadastro ativo");
	}

}
