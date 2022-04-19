package com.lojaLivros.modelos;

import com.lojaLivros.moldes.Livro;

public class Hq extends Livro{
	
	public Hq(String titulo, String autor, String numPag, double valor) {
		super(titulo, autor, numPag, (float)valor);
	}
	
}
