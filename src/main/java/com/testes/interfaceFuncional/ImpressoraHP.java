package com.testes.interfaceFuncional;

public class ImpressoraHP implements Impressora {

	@Override
	public void imprimir(Compra c) {
		System.out.println("Enviando o comando para a impressora HP " + c);
	}

}
