package com.testes.stream;

import java.util.List;

public class Teste {

	public static void main(String[] args) {
		List<Fatura> faturas = new FaturaDAO().buscarTodasFaturas();
		
		/*for (Fatura f : faturas) {
			if (f.getValor() > 250.0) {
				System.out.println("Alerta: Fatura acima de R$250.0 -> " + f);
			}
		}*/
		
		faturas.stream()
				.filter(Fatura::estaEmRisco)
				.forEach(System.out::println);
		
	}
	
}
