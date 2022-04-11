package com.lojaLivros;

public abstract class Livro{
	
	private String titulo;
	private final String autor;
	private Colecao colecao;
	private int numPag;
	private double valor;
	
	protected Livro(Colecao colecao, String titulo, String autor, int numPag, double valor) {
		this.colecao = colecao;
		this.titulo = titulo;
		this.autor = autor;
		this.numPag = numPag;
		this.valor = valor;
	}
	
	protected double exibirValor() {
		return valor;
	}
	
	protected double exibirValorDesconto(double desconto) {
		return valor -=  valor * (desconto/100);
		
	}
	
	protected String exibirTituloColecao() {
		return colecao.exibirTitulo();
	}
	
	public void apresentarLivro() {
		System.out.println("Título: "+this.titulo);
		System.out.println("Número de páginas: "+this.numPag);
		System.out.println("Valor: "+this.valor);
		System.out.println("Autor: "+this.autor);
		System.out.println("");
	}
}
