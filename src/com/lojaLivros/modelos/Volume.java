package com.lojaLivros.modelos;

import com.lojaLivros.moldes.Livro;

public class Volume extends Livro{
	
	public Volume(String titulo, String autor, int numPag, double valor) {
		super(titulo, autor, numPag, (float)valor);
	}
	
}
