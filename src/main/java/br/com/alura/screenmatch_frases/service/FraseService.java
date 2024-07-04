package br.com.alura.screenmatch_frases.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.alura.screenmatch_frases.dto.FraseDTO;
import br.com.alura.screenmatch_frases.model.Frase;
import br.com.alura.screenmatch_frases.repository.FraseRepository;

@Service
public class FraseService {
	
	@Autowired
    private FraseRepository repository;

	public FraseDTO obterFrase() {
		Frase frase = repository.buscaFraseAleatoria();
		
		return new FraseDTO(frase.getTitulo(), frase.getFrase(), frase.getPersonagem(), frase.getPoster());
	}
}
