package com.testes.lambda;

import java.util.List;

public class ExemploReferenciaMetodo {

	public static void main(String[] args) {
		List<Fatura> faturasVencidas = new FaturaDAO().buscarFaturasVencidas();
		
		// Referência a métodos
		faturasVencidas.forEach(Fatura::atualizarStatus);
	}

}
