package com.escudo7.food.di.notificacao;

import com.escudo7.food.di.modelo.Cliente;

public interface Notificador {

	void notificar(Cliente cliente, String mensagem);

}