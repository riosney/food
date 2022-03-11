package com.testes.lambda;

import java.util.ArrayList;
import java.util.List;

public class FaturaDAO {
	
	public List<Fatura> buscarFaturasVencidas(){
		List<Fatura> faturas = new ArrayList<>();
		faturas.add(new Fatura("joao@gmail.com", 350.0));
		faturas.add(new Fatura("joao@gmail.com", 150.0));
		faturas.add(new Fatura("joao@gmail.com", 290.0));
		
		return faturas;
	}

}
