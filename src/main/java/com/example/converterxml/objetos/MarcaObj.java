package com.example.converterxml.objetos;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "marca")
public class MarcaObj {
	
	private String apresentacao;
	
	private String natureza;
	
	private String nome;
		
	@XmlAttribute (name = "apresentacao")
	public String getApresentacao() {
		return apresentacao;
	}

	public void setApresentacao(String apresentacao) {
		this.apresentacao = apresentacao;
	}
	
	@XmlAttribute (name = "natureza")
	public String getNatureza() {
		return natureza;
	}
	
	public void setNatureza(String natureza) {
		this.natureza = natureza;
	}

	@XmlElement(name = "nome")
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}	
}
