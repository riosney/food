package com.testes.junit;

public class Fibonacci {
	
	// F(n) = F(n -1) + F(n - 2)
	// 1, 1, 2, 3, 5, 8...
	public long calcular(long posicao) {
		if(posicao <= 1) {
			return posicao;
		}
		return calcular(posicao - 1) + calcular(posicao - 2);
	}

}
