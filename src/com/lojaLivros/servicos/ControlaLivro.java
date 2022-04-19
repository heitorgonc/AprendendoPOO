package com.lojaLivros.servicos;

import com.lojaLivros.moldes.Livro;

public abstract class ControlaLivro {
	
	public static void apresentarLivro(Livro livro) {
		System.out.println("T�tulo: "+livro.exibirTitulo());
		System.out.println("N�mero de p�ginas: "+livro.exibirNumPag());
		System.out.println("Valor: "+livro.exibirValor());
		System.out.println("Autor: "+livro.exibirAutor());
	}

}
