package com.escudo7.food.domain.exeption;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class EntidadeNaoEncontradaException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;
	
	public EntidadeNaoEncontradaException(String mensagem) {
		super(mensagem);
	}

}
