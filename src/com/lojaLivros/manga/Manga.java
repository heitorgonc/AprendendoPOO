package com.lojaLivros.manga;

import com.lojaLivros.Colecao;
import com.lojaLivros.LivroInterface;

public class Manga  extends Colecao implements LivroInterface{
	
	public Manga(String nome, int tamanhoLista) {
		super(nome, tamanhoLista);
	}
	
	public double venderLivroDesconto(double desconto) {
		return this.exibirValorTotalDesconto(desconto);
	}
	
}
