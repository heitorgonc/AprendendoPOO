package com.lojaLivros.servicos;

import com.lojaLivros.Interfaces.VendaInterface;
import com.lojaLivros.modelos.CaixaLoja;
import com.lojaLivros.modelos.Promocao;

public abstract class ControlaCaixa {
	
	public static void vendaCaixa(CaixaLoja caixa, VendaInterface produto) {
		caixa.vender(produto);
		System.out.println("Venda bem sucedida");
		produto.apresentar();
		System.out.println("Valor da venda: "+produto.exibirValor());
		caixa.mostrarSaldo();
	}
	
	public static void vendaCaixa(CaixaLoja caixa, VendaInterface produto, Promocao promocao) {
		if(caixa.venderPromocao(produto, promocao)) {
			System.out.println("Venda promoção bem sucedida");
			produto.apresentar();
			System.out.println("Valor da venda com desconto: "+promocao.valorDesconto(produto));
			caixa.mostrarSaldo();
			return;
		}
		System.out.println("Erro venda promoção");
		return;
	}
	
	public static CaixaLoja criarCaixa(double saldo) {
		try {
			CaixaLoja caixa = new CaixaLoja(saldo);
			return caixa;
		}catch(IllegalArgumentException e) {
			CaixaLoja caixa = null;
			System.out.println("Erro: "+e.getMessage());
			return caixa;
		}
	}
	
	public static CaixaLoja criarCaixa() {
		try {
			CaixaLoja caixa = new CaixaLoja();
			return caixa;
		}catch(IllegalArgumentException e) {
			CaixaLoja caixa = null;
			System.out.println("Erro: "+e.getMessage());
			return caixa;
		}
	}
	
}
