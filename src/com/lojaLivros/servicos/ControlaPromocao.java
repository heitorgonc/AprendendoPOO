package com.lojaLivros.servicos;

import java.util.Date;
import com.lojaLivros.modelos.Promocao;

public abstract class ControlaPromocao {
	
	public static boolean verificaPromocaoAtiva(Promocao promocao) {
		Date dtaAtual = new Date();
		Date dtaFinal = promocao.exibirDataFinal();
		if(dtaAtual.after(dtaFinal)) {
			System.out.println("Promoção Inativa");
			promocao = null;
			return false;
		}
		System.out.println("Promoção Ativa");
		return true;
	}
	
	public static Promocao criarPromocao(Date dtaInicial, Date dtaFinal, double desconto) {
		try {
			Promocao promocao = new Promocao(dtaInicial,dtaFinal,desconto);
			return promocao;
		}catch(IllegalArgumentException e) {
			Promocao promocao = null;
			System.out.println("Erro: "+e.getMessage());
			return promocao;
		}
	}

}
