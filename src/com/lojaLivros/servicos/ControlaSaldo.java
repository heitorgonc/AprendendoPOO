package com.lojaLivros.servicos;

import com.lojaLivros.abstratos.Colecao;
import com.lojaLivros.abstratos.Livro;

public class ControlaSaldo {
	
	private float saldo;
	
	public ControlaSaldo() {
		saldo = 0;
	}
	
	private void mostrarSaldo() {
		System.out.println("Saldo atual da loja: "+saldo);
		return;
	}
	
	public void venderLivro(Livro livro) {
		saldo += livro.exibirValor();
		System.out.println("Venda bem sucedida");
		System.out.println("Valor: "+livro.exibirValor());
		this.mostrarSaldo();
		return;
	}
	
	public void venderLivroDesconto(Livro livro, double porcentagem) {
		float desconto = livro.exibirValor() * ((float)porcentagem/100);
		float valorDesconto = livro.exibirValor() - desconto;
		saldo += valorDesconto;
		System.out.println("Venda bem sucedida");
		System.out.println("Valor com desconto: "+valorDesconto);
		this.mostrarSaldo();
		return;
	}
	
	public void venderColecao(Colecao colecao) {
		saldo += colecao.exibirValorTotal();
		System.out.println("Venda bem sucedida");
		System.out.println("Valor: "+colecao.exibirValorTotal());
		this.mostrarSaldo();
		return;
	}
	
	public void venderColecaoDesconto(Colecao colecao, double porcentagem) {
		float desconto = colecao.exibirValorTotal() * ((float)porcentagem/100);
		float valorTotalDesconto = colecao.exibirValorTotal() - desconto;
		saldo += valorTotalDesconto;
		System.out.println("Venda bem sucedida");
		System.out.println("Valor com desconto: "+valorTotalDesconto);
		this.mostrarSaldo();
		return;
	}

}
