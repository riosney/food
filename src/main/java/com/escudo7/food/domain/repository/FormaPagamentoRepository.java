package com.escudo7.food.domain.repository;

import java.util.List;

import com.escudo7.food.domain.model.FormaPagamento;

public interface FormaPagamentoRepository {
	
	List<FormaPagamento> listar();
	FormaPagamento buscar(Long id);
	FormaPagamento salvar(FormaPagamento formaPagamento);
	void remover(FormaPagamento formaPagamento);

}
