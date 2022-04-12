package com.lojaLivros.manga;

import com.lojaLivros.modelos.Livro;
import com.lojaLivros.modelos.LivroInterface;

public class Volume extends Livro implements LivroInterface{
	
	public Volume(Manga manga, String titulo, String autor, int numPag, String valor) {
		super(manga, titulo,autor, numPag, valor);
	}
	
	public float venderLivroDesconto(double desconto) {
		this.apresentarLivro();
		final float resultado = this.exibirValorDesconto(desconto);
		System.out.println("Valor do volume com desconto: "+resultado);
		return resultado;
	}
}
