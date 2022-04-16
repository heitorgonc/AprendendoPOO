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
		System.out.println("Esse livro n�o pertence a essa cole��o");
		return;
	}
	
	public void apresentarColecao(Colecao colecao) {
		System.out.println("T�tulo da Cole��o: "+colecao.exibirTitulo());
		System.out.println("Tamanho m�ximo da cole��o: "+colecao.exibirLivros().length);
		return;
	}

}
