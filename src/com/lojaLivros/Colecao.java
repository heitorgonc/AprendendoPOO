package com.lojaLivros;

public abstract class Colecao{
	
	private String titulo;
	private Livro[] listaLivros;
	private double valorTotal;
	
	public Colecao(String titulo,int tamanhoLista) {
		this.titulo = titulo;
		this.listaLivros = new Livro[tamanhoLista];
	}
	
	public double exibirValorTotal() {
		for(int i=0; i < listaLivros.length; i++) {
			if(listaLivros[i] == null) {
				return valorTotal;
			}
			valorTotal = valorTotal + listaLivros[i].exibirValor();
		}
		return valorTotal;
	}
	
	public String exibirTitulo() {
		return titulo;
	}
	
	public void adicionarLivro(Livro novoLivro){
		if(novoLivro.exibirTituloColecao() == this.titulo) {
			for(int i=0; this.listaLivros.length > i ; i++) {
				if(listaLivros[i] == null) {
					listaLivros[i] = novoLivro;
					return;
				}
			}
		}
		System.out.println("Esse livro não pertence a essa coleção");
		return;
	}
	
	public void apresentarColecao() {
		System.out.println("Título da Coleção: "+titulo);
		System.out.println("Número de volumes previstos: "+listaLivros.length);
		System.out.println("");
		this.listarLivros();
		return;
	}
	
	private void listarLivros() {
		for(int i=0; i < listaLivros.length; i++) {
			if(listaLivros[i] == null) {
				return;
			}
			listaLivros[i].apresentarLivro();
		}
		return;
	}
	
	public double exibirValorTotalDesconto(double desconto) {
		for(int i=0; i < listaLivros.length; i++) {
			if(listaLivros[i] == null) {
				return valorTotal;
			}
			valorTotal = valorTotal + listaLivros[i].exibirValorDesconto(desconto);
		}
		return valorTotal;
	}
	
}
