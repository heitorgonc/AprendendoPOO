package com.lojaLivros.modelos;

public abstract class Colecao{
	
	private String titulo;
	private Livro[] listaLivros;
	private float valorTotal;
	
	public Colecao(String titulo,int tamanhoLista) {
		this.titulo = titulo;
		this.listaLivros = new Livro[tamanhoLista];
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
	
	public void adicionarLivro(Livro novoLivro){
		if(novoLivro.exibirTituloColecao() == this.titulo) {
			for(int i=0; listaLivros.length > i ; i++) {
				if(listaLivros[i] == null) {
					listaLivros[i] = novoLivro;
					System.out.println("Livro adicionado com sucesso!");
					return;
				}
			}
		}
		System.out.println("Esse livro não pertence a essa coleção");
		return;
	}
	
	public void apresentarColecao() {
		System.out.println("Título da Coleção: "+titulo);
		System.out.println("Tamanho máximo da coleção: "+listaLivros.length);
		this.listarLivros();
		return;
	}
	
	public float exibirValorTotalDesconto(double desconto) {
		for(int i=0; i < listaLivros.length; i++) {
			if(listaLivros[i] != null) {
				valorTotal += listaLivros[i].exibirValorDesconto(desconto);
			}
		}
		return valorTotal;
	}
	
	public String exibirTitulo() {
		return titulo;
	}
	
}
