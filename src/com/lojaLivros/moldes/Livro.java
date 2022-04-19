package com.lojaLivros.moldes;

public abstract class Livro{
	
	private String titulo;
	private final String autor;
	private String numPag;
	private final float valor;
	
	public Livro(String titulo, String autor, String numPag, float valor) {
		this.titulo = titulo;
		this.autor = autor;
		this.numPag = numPag;
		this.valor = valor;
	}
	
	public float exibirValor() {
		return valor;
	}
	
	public String exibirAutor() {
		return autor;
	}
	
	public String exibirTitulo() {
		return titulo;
	}
	
	public String exibirNumPag() {
		return numPag;
	}
}
