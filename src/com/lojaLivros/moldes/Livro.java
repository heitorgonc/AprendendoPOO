package com.lojaLivros.moldes;

import com.lojaLivros.Interfaces.VendaInterface;

public abstract class Livro implements VendaInterface{
	
	private String titulo;
	private final String autor;
	private int numPag;
	private final float valor;
	
	public Livro(String titulo, String autor, int numPag, float valor) {
		if(titulo == "" || titulo == null) {
			throw new IllegalArgumentException("O livro precisa ter um titulo");
		}
		if(autor == "" || autor == null) {
			throw new IllegalArgumentException("O livro precisa de um autor");
		}
		if(numPag <= 4) {
			throw new IllegalArgumentException("O livro precisa ter um número de páginas superior a 4");
		}
		if(valor <= 0) {
			throw new IllegalArgumentException("O valor do livro não pode ser nulo ou negativo");
		}
		this.titulo = titulo;
		this.autor = autor;
		this.numPag = numPag;
		this.valor = valor;
	}
	
	public float exibirValor() {
		return valor;
	}
	
	public void apresentar() {
		System.out.println("Título: "+ titulo);
		System.out.println("Número de páginas: "+numPag);
		System.out.println("Valor: "+valor);
		System.out.println("Autor: "+autor);
	}
}
