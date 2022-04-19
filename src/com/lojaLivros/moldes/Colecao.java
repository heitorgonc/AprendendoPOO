package com.lojaLivros.moldes;

public abstract class Colecao{
	
	private String titulo;
	private Livro[] listaLivros;
	
	public Colecao(String titulo,int tamanhoLista) {
		this.titulo = titulo;
		this.listaLivros = new Livro[tamanhoLista];
	}
	
	public String exibirTitulo() {
		return titulo;
	}
	
	public Livro[] exibirLivros() {
		return listaLivros;
	}
	
	public float exibirValorTotal() {
		float valor = 0;
		for(int i=0; i < listaLivros.length; i++) {
			if(listaLivros[i] != null) {
				valor += listaLivros[i].exibirValor();
			}
		}
		return valor;
	}
	
}
