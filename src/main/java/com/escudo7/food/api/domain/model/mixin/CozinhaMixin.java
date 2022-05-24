package com.escudo7.food.api.domain.model.mixin;

import java.util.List;

import com.escudo7.food.domain.model.Restaurante;
import com.fasterxml.jackson.annotation.JsonIgnore;

public abstract class CozinhaMixin {
	
	@JsonIgnore
	private List<Restaurante> restaurantes;

}
