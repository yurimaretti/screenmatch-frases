package br.com.alura.screenmatch_frases.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "frases")
public class Frase {
	
	//Atributos
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String titulo;
	
	private String frase;
	
	private String personagem;
	
	private String poster;
	
	//Construtores
	
	public Frase() {

	}
	
	//Métodos	
	
//	public Long getId() {
//		return id;
//	}
//	
//	public void setId(Long id) {
//		this.id = id;
//	}
//	
	public String getTitulo() {
		return titulo;
	}
//	
//	public void setTitulo(String titulo) {
//		this.titulo = titulo;
//	}
//	
	public String getPersonagem() {
		return personagem;
	}
//	
//	public void setPersonagem(String personagem) {
//		this.personagem = personagem;
//	}
//	
	public String getPoster() {
		return poster;
	}
//	
//	public void setPoster(String poster) {
//		this.poster = poster;
//	}
//
	public String getFrase() {
		return frase;
	}
//
//	public void setFrase(String frase) {
//		this.frase = frase;
//	}
}
