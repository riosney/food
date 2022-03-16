package com.testes.dataJava8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Year;
import java.time.format.DateTimeFormatter;

public class NovoAluguel {
	
	public static void main(String[] args) {
		Cliente cliente = new Cliente("Mariazinha da Silva", LocalDate.of(2005, Month.JANUARY, 15));
		Carro gol = new Carro("Gol", 90.0, Year.of(2012));
		
		LocalDateTime dataEHoraDaRetirada = LocalDateTime.of(LocalDate.now()
				, LocalTime.of(LocalTime.now().getHour(), 0));
		
		LocalDateTime dataEHoraPrevistaParaDevolucao = 
				LocalDateTime.now().plusDays(3).plusHours(2);
		
		Aluguel aluguel = new Aluguel(cliente, gol, dataEHoraDaRetirada, dataEHoraPrevistaParaDevolucao);
		
		imprimirRecibo(aluguel);
	}

	private static void imprimirRecibo(Aluguel aluguel) {
		System.out.println("--- RECIBO ---");
		System.out.println("Carro: " + aluguel.getCarro().getModelo());
		System.out.println("Cliente: " + aluguel.getCliente().getNome());
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		System.out.println("Data e hora retirada: " + aluguel.getDataEHoraDaRetirada().format(formatter));
		System.out.println("Data e hora prevista para devolução: " + aluguel.getDataEHoraPrevistaParaDevolucao().format(formatter));
	}
	
}
