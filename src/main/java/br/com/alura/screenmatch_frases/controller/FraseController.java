package br.com.alura.screenmatch_frases.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.alura.screenmatch_frases.dto.FraseDTO;
import br.com.alura.screenmatch_frases.service.FraseService;

@RestController
@RequestMapping("/series")
public class FraseController {
	
	@Autowired
	private FraseService service;
	
	@GetMapping("/frases")
	public FraseDTO obterFrase() {
		return service.obterFrase();
	}
}
