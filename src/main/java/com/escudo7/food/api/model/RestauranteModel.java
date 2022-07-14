package com.escudo7.food.api.model;

import java.math.BigDecimal;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class RestauranteModel {
	
	private Long id;
	private String nome;
	private BigDecimal frete;
	private CozinhaModel cozinha;
	
	// outra forma de mostrar o atributo com ModelMapper
	/*
	 * Origem: cozinha,nome
	 * Destinho: nome,cozinha
	 */
	private String nomeCozinha;
	private Long IdCozinha;

}
