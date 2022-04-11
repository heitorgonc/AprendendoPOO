package com.lojaLivros.financeiro;

import com.lojaLivros.LivroInterface;

public class Estoque {
	
	private double saldo;
	
	public Estoque(double saldo) {
		this.saldo = saldo;
	}
	
	public double exibirSaldo(){
		return saldo;
	}
	
	public void venderDesconto(LivroInterface livro, double desconto) {
		saldo = saldo + livro.venderLivroDesconto(desconto);
	}

}
