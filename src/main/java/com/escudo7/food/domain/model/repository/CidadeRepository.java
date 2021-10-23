package com.escudo7.food.domain.model.repository;

import java.util.List;

import com.escudo7.food.domain.model.Cidade;

public interface CidadeRepository {
	
	List<Cidade> listar();
	Cidade buscar(Long id);
	Cidade salvar(Cidade cidade);
	void remover(Cidade cidade);

}
