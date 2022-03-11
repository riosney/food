package com.testes.interfaceFuncional;

public class Compra {
	
	private String produto;
	private double valor;
	
	public Compra(String produto, double valor) {
		super();
		this.produto = produto;
		this.valor = valor;
	}
	
	@Override
	public String toString() {
		return "Produto: " + produto + ". Valor R$ " + valor;
	}

}
