package com.escudo7.food.api.model;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class CozinhaModel {
	
	private Long id;
	
	/*
	 * Origem: cozinha, nome
	 * Destino: cozinha, cozinha, nome
	 */
	private String nome;

}
