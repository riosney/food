package com.escudo7.food.api.domain.model.mixin;

import java.util.List;

import com.escudo7.food.domain.model.Restaurante;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

public abstract class CozinhaMixin {
	
	@JsonIgnoreProperties(value = "nome", allowGetters = true)
	private List<Restaurante> restaurantes;

}
