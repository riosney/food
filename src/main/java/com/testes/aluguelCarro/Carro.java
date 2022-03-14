package com.testes.aluguelCarro;

import java.time.Year;

public class Carro {
	
	private String modelo;
	private double valorDiaria;
	private Year anoFricacao;
	
	public Carro(String modelo, double valorDiaria, Year anoFricacao) {
		this.modelo = modelo;
		this.valorDiaria = valorDiaria;
		this.anoFricacao = anoFricacao;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public double getValorDiaria() {
		return valorDiaria;
	}

	public void setValorDiaria(double valorDiaria) {
		this.valorDiaria = valorDiaria;
	}

	public Year getAnoFricacao() {
		return anoFricacao;
	}

	public void setAnoFricacao(Year anoFricacao) {
		this.anoFricacao = anoFricacao;
	}	

}
