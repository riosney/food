package com.escudo7.food.api.assembler;

import org.springframework.stereotype.Component;

import com.escudo7.food.api.model.input.RestauranteInput;
import com.escudo7.food.domain.model.Cozinha;
import com.escudo7.food.domain.model.Restaurante;

@Component
public class RestauranteInputDisassembler {
	
	public Restaurante toDomainObject(RestauranteInput restauranteInput) {
        Restaurante restaurante = new Restaurante();
        restaurante.setNome(restauranteInput.getNome());
        restaurante.setTaxaFrete(restauranteInput.getTaxaFrete());
        
        Cozinha cozinha = new Cozinha();
        cozinha.setId(restauranteInput.getCozinha().getId());
        
        restaurante.setCozinha(cozinha);
        
        return restaurante;
    }

}
