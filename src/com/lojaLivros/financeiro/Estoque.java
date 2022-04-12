package com.lojaLivros.financeiro;

import com.lojaLivros.modelos.LivroInterface;

public class Estoque {
	
	private float saldo;
	
	public Estoque(String saldo) {
		this.saldo = Float.parseFloat(saldo);
	}
	
	public void venderDesconto(LivroInterface livro, double desconto) {
		saldo += livro.venderLivroDesconto(desconto);
		System.out.println("Saldo atual da loja: "+saldo);
	}

}
