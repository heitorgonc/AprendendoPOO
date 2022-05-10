package com.lojaLivros.servicos;

import com.lojaLivros.interfaces.ColecionavelInterface;
import com.lojaLivros.moldes.Colecao;
import com.lojaLivros.moldes.Livro;

public abstract class ControlaColecao {
	
	public static void adicionarLivro(ColecionavelInterface novoLivro, Colecao colecao){
		if(novoLivro.exibirColecao() == colecao){
			Livro[] listaLivros = colecao.exibirLivros();
			for(int i=0; listaLivros.length > i; i++) {
				if(listaLivros[i] == null) {
					listaLivros[i] = (Livro) novoLivro;
					System.out.println("Livro adicionado com sucesso!");
					return;
				}
			}
		}
		throw new IllegalArgumentException("Esse livro n�o pertence a essa cole��o");
	}
	
	public static void apresentarColecao(Colecao colecao) {
		System.out.println("T�tulo da Cole��o: "+colecao.exibirTitulo());
		System.out.println("Tamanho m�ximo da cole��o: "+colecao.exibirLivros().length);
		Livro[] listaLivros = colecao.exibirLivros();
		for(int i=0; listaLivros.length > i; i++) {
			ControlaLivro.apresentarLivro(listaLivros[i]);
		}
		return;
	}

}
