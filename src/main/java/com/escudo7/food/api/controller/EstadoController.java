package com.escudo7.food.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.escudo7.food.domain.model.Estado;
import com.escudo7.food.domain.repository.EstadoRepository;

@RestController
@RequestMapping("/estados")
public class EstadoController {
	
	@Autowired
	private EstadoRepository estadoRepository;
	
	public List<Estado> listar(){
		return estadoRepository.listar();
	}

}
