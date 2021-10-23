package com.escudo7.food.domain.model.repository;

import java.util.List;

import com.escudo7.food.domain.model.Estado;

public interface EstadoRepository {
	
	List<Estado> listar();
	Estado buscar(Long id);
	Estado salvar(Estado estado);
	void remover(Estado estado);

}
