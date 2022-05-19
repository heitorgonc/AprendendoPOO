package com.lojaLivros.servicos;

import com.lojaLivros.exceptions.TamMaxColecaoException;
import com.lojaLivros.modelos.Colecao;
import com.lojaLivros.moldes.Livro;

public abstract class ControlaColecao {
	
	public static Colecao criarColecao(int tamanhoColecao) {
		try {
			Colecao colecao = new Colecao(tamanhoColecao);
			return colecao;
		}catch(IllegalArgumentException e) {
			Colecao colecao = null;
			System.out.println("Não foi possivel criar essa coleção "+e.getMessage());
			return colecao;
		}
	}
	
	public static void adicionarLivro(Colecao colecao, Livro livro) {
		try {
			colecao.adicionarLivro(livro);
		}catch(TamMaxColecaoException e) {
			System.out.println("Erro: "+e.getMessage());
		}
	}

}
