package com.lojaLivros.servicos;

import com.lojaLivros.abstratos.Livro;

public class ControlaLivro {
	
	public void apresentarLivro(Livro livro) {
		System.out.println("T�tulo: "+livro.exibirTitulo());
		System.out.println("N�mero de p�ginas: "+livro.exibirNumPag());
		System.out.println("Valor: "+livro.exibirValor());
		System.out.println("Autor: "+livro.exibirAutor());
	}

}
