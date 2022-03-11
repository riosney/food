package com.testes.lambda;

import java.util.List;

public class ExemploLambda {
	
	public static void main(String[] args) {
		List<Fatura> faturasVencidas = new FaturaDAO().buscarFaturasVencidas();
		
		EnviadorEmail enviadorEmail = new EnviadorEmail();
		
		/*for(Fatura f : faturasVencidas) {
			enviadorEmail.enviar(f.getEmailDevedor(), f.resumo());
		}*/
		
		faturasVencidas.forEach(f -> enviadorEmail.enviar(f.getEmailDevedor(), f.resumo()));
	}

}
