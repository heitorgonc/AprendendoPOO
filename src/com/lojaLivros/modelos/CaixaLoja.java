package com.lojaLivros.modelos;

import com.lojaLivros.Interfaces.VendaInterface;
import com.lojaLivros.servicos.ControlaPromocao;

public class CaixaLoja {
	
private float saldo;
	
	public CaixaLoja() {
		saldo = 0;
	}
	
	public CaixaLoja(double saldo) {
		if(saldo <= 0) {
			throw new IllegalArgumentException("O caixa não pode iniciar com sldo nulo ou negativo");
		}
		this.saldo = (float)saldo;
	}
	
	public void mostrarSaldo() {
		System.out.println("Saldo atual da loja: "+saldo);
		return;
	}
	
	public void vender(VendaInterface produto) {
		saldo += produto.exibirValor();
		return;
	}
	
	public boolean venderPromocao(VendaInterface produto, Promocao promocao) {
		if(ControlaPromocao.verificaPromocaoAtiva(promocao)) {
			saldo += promocao.valorDesconto(produto);
			return true;
		}
		return false;
	}

}
