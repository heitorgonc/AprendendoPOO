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
		throw new IllegalArgumentException("Esse livro não pertence a essa coleção");
	}
	
	public static void apresentarColecao(Colecao colecao) {
		System.out.println("Título da Coleção: "+colecao.exibirTitulo());
		System.out.println("Tamanho máximo da coleção: "+colecao.exibirLivros().length);
		Livro[] listaLivros = colecao.exibirLivros();
		for(int i=0; listaLivros.length > i; i++) {
			ControlaLivro.apresentarLivro(listaLivros[i]);
		}
		return;
	}

}
