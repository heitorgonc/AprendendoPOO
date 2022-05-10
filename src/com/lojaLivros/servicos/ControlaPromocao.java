package com.lojaLivros.servicos;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.lojaLivros.exceptions.PromoExistenteException;
import com.lojaLivros.modelos.Promocao;
import com.lojaLivros.moldes.Livro;

public abstract class ControlaPromocao {
	
	public static boolean verificaPromocaoAtiva(Livro livro) {
		Date dtaAtual = new Date();
		Date dtaFinal = livro.exibirPromocao().exibirDataFinal();
		if(dtaAtual.after(dtaFinal)) {
			System.out.println("Inativa");
			livro.removerPromocao();
			return false;
		}
		System.out.println("Ativa");
		return true;
	}
	
	public static void ativarPromocao(Livro livro, Promocao promocao) {
		try {
			livro.adicionarPromocao(promocao);
		}catch(PromoExistenteException e) {
			System.out.print(e.getMessage());
		}
		
	}
	
	public static Date converterParaData(String data) {
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			Date dta = sdf.parse(data);
			return dta;
		}catch(ParseException e) {
			System.out.println("Não é possível converter  este valor para data ");
			System.out.println(e.getMessage());
		}
		return new Date();
	}

}
