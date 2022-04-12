package com.lojaLivros.modelos;

public abstract class Livro{
	
	private String titulo;
	private final String autor;
	private Colecao colecao;
	private int numPag;
	private float valor;
	
	public Livro(Colecao colecao, String titulo, String autor, int numPag, String valor) {
		this.colecao = colecao;
		this.titulo = titulo;
		this.autor = autor;
		this.numPag = numPag;
		this.valor = Float.parseFloat(valor);
	}
	
	public Livro(String titulo, String autor, int numPag, String valor) {
		this.titulo = titulo;
		this.autor = autor;
		this.numPag = numPag;
		this.valor = Float.parseFloat(valor);
	}
	
	public float exibirValorDesconto(double desconto) {
		return (float) (valor -  (valor*desconto)); 
	}
	
	public String exibirTituloColecao() {
		return colecao.exibirTitulo();
	}
	
	public void apresentarLivro() {
		System.out.println("Título: "+titulo);
		System.out.println("Número de páginas: "+numPag);
		System.out.println("Valor: "+valor);
		System.out.println("Autor: "+autor);
	}
}
