package com.lojaLivros.hq;

import com.lojaLivros.modelos.Livro;
import com.lojaLivros.modelos.LivroInterface;

public class Hq extends Livro implements LivroInterface{
	
	public Hq(String titulo, String autor, int numPag, String value) {
		super(titulo, autor, numPag,value);
	}
	
	public float venderLivroDesconto(double desconto) {
		this.apresentarLivro();
		final float resultado = this.exibirValorDesconto(desconto);
		System.out.println("Valor da HQ com desconto: "+resultado);
		return resultado;
	}
	
}
