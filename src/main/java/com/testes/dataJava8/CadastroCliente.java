package com.testes.dataJava8;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class CadastroCliente {

	public static void main(String[] args) {
		Cliente cliente = new Cliente("Mariazinha da Silva", LocalDate.of(2005, Month.JANUARY, 15));
		
		int idade = Period.between(cliente.getDataNascimento(), LocalDate.now()).getYears();
		
		if (idade >= 18) {
			System.out.printf("Pode ser cadastrado. Idade é: %d", idade);
		} else {
			System.err.printf("Idade é: %d. Então não pode ter carteira.", idade);
		}
	}

}
