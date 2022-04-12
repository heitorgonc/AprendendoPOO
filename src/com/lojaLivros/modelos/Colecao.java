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
		System.out.println("Esse livro n�o pertence a essa cole��o");
		return;
	}
	
	public void apresentarColecao() {
		System.out.println("T�tulo da Cole��o: "+titulo);
		System.out.println("Tamanho m�ximo da cole��o: "+listaLivros.length);
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
