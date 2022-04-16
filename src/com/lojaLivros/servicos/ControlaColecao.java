package com.lojaLivros.servicos;

import com.lojaLivros.abstratos.Colecao;
import com.lojaLivros.abstratos.Livro;
import com.lojaLivros.interfaces.ColecionavelInterface;

public class ControlaColecao {
	
	public void adicionarLivro(ColecionavelInterface novoLivro, Colecao colecao){
		if(novoLivro.exibirTituloColecao() == colecao.exibirTitulo()) {
			Livro[] listaLivros = colecao.exibirLivros();
			for(int i=0; listaLivros.length > i ; i++) {
				if(listaLivros[i] == null) {
					listaLivros[i] = (Livro) novoLivro;
					System.out.println("Livro adicionado com sucesso!");
					return;
				}
			}
		}
		System.out.println("Esse livro não pertence a essa coleção");
		return;
	}
	
	public void apresentarColecao(Colecao colecao) {
		System.out.println("Título da Coleção: "+colecao.exibirTitulo());
		System.out.println("Tamanho máximo da coleção: "+colecao.exibirLivros().length);
		return;
	}

}
