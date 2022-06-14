package com.escudo7.food.core.jackson;

import org.springframework.stereotype.Component;

import com.escudo7.food.api.domain.model.mixin.CidadeMixin;
import com.escudo7.food.api.domain.model.mixin.CozinhaMixin;
import com.escudo7.food.domain.model.Cidade;
import com.escudo7.food.domain.model.Cozinha;
import com.fasterxml.jackson.databind.module.SimpleModule;

@Component
public class JacksonMixinModule extends SimpleModule {

	private static final long serialVersionUID = 1L;
	
	public JacksonMixinModule() {
		setMixInAnnotation(Cozinha.class, CozinhaMixin.class);
		setMixInAnnotation(Cidade.class, CidadeMixin.class);
	}

}
