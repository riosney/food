package com.testes.interfaceFuncional;

public class Teste {

	public static void main(String[] args) {
		Impressora i = (c) ->{
			System.out.println("Simulando a impressão: " + c);
		};		
		
		Compra compra = new Compra("Luva", 2.5);
		i.imprimir(compra);
	}

}
