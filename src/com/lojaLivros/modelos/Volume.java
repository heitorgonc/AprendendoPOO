package com.lojaLivros.modelos;

import com.lojaLivros.interfaces.ColecionavelInterface;
import com.lojaLivros.moldes.Livro;

public class Volume extends Livro implements ColecionavelInterface{
	
	private Manga manga;
	
	public Volume(String titulo, String autor, String numPag, double valor, Manga manga) {
		super(titulo, autor, numPag, (float)valor);
		this.manga = manga;
	}
	
	public String exibirTituloColecao() {
		return manga.exibirTitulo();
	}
}
