package com.lojaLivros.hq;

import com.lojaLivros.Livro;
import com.lojaLivros.LivroInterface;

public class Hq extends Livro implements LivroInterface{
	
	public Hq(String titulo, String autor, int numPag, double value) {
		super(null, titulo, autor, numPag,value);
	}
	
	public double venderLivroDesconto(double desconto) {
		return this.exibirValorDesconto(desconto);
	}
	
}
