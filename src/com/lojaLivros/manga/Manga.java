package com.lojaLivros.manga;

import com.lojaLivros.modelos.Colecao;
import com.lojaLivros.modelos.LivroInterface;

public class Manga  extends Colecao implements LivroInterface{
	
	public Manga(String nome, int tamanhoLista) {
		super(nome, tamanhoLista);
	}
	
	public float venderLivroDesconto(double desconto) {
		this.apresentarColecao();
		final float resultado = this.exibirValorTotalDesconto(desconto);
		System.out.println("Valor do manga com desconto: "+resultado);
		return resultado;
	}
	
}
