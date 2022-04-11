package com.lojaLivros.manga;

import com.lojaLivros.Livro;
import com.lojaLivros.LivroInterface;

public class Volume extends Livro implements LivroInterface{
	
	public Volume(Manga manga, String titulo, String autor, int numPag, double valor) {
		super(manga, titulo,autor, numPag, valor);
	}
	
	public double venderLivroDesconto(double desconto) {
		return this.exibirValorDesconto(desconto);
	}
}
