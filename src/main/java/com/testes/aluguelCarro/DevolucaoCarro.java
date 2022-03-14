package com.testes.aluguelCarro;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Year;

public class DevolucaoCarro {

	public static void main(String[] args) {
		Aluguel aluguel = recuperarAluguel();
		
		// A cada hora atraso, é cobrado 10% do valor do carro em multa
		LocalDateTime dataEHoraRealDaDevolucao = LocalDateTime.of(LocalDate.now().plusDays(5), LocalTime.now());		
	}
	
	private static Aluguel recuperarAluguel() {
		Cliente cliente = new Cliente("Mariazinha da Silva", LocalDate.of(2005, Month.JANUARY, 15));
		Carro gol = new Carro("Gol", 90.0, Year.of(2012));
		
		LocalDateTime dataEHoraDaRetirada = LocalDateTime.of(LocalDate.now()
				, LocalTime.of(LocalTime.now().getHour(), 0));
		
		LocalDateTime dataEHoraPrevistaParaDevolucao = 
				LocalDateTime.now().plusDays(3).plusHours(2);
		
		Aluguel aluguel = new Aluguel(cliente, gol, dataEHoraDaRetirada, dataEHoraPrevistaParaDevolucao);
		return aluguel;
	}

}
