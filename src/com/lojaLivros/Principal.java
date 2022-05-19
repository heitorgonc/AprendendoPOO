package com.lojaLivros;

import java.util.Date;

import com.lojaLivros.modelos.CaixaLoja;
import com.lojaLivros.modelos.Colecao;
import com.lojaLivros.modelos.Promocao;
import com.lojaLivros.modelos.Volume;
import com.lojaLivros.servicos.ControlaColecao;
import com.lojaLivros.servicos.ControlaData;
import com.lojaLivros.servicos.ControlaLivro;
import com.lojaLivros.servicos.ControlaPromocao;
import com.lojaLivros.servicos.ControlaCaixa;

public class Principal {

	public static void main(String[] args) {
		
		Date dataInicial = ControlaData.StringParaData("09/05/2021");
		Date dataFinal = ControlaData.StringParaData("10/08/2021");
		Promocao promo1 = ControlaPromocao.criarPromocao(dataInicial, dataFinal, 50);
		Volume naruto = ControlaLivro.criarVolume("O fim e começo", "Heitor", 10, 4);
		Volume boruto = ControlaLivro.criarVolume("O começo e o fim", "Heitor", 10, 4);
		CaixaLoja caixa1 = ControlaCaixa.criarCaixa();
		ControlaCaixa.vendaCaixa(caixa1, boruto, promo1);
		Colecao colecao1 = ControlaColecao.criarColecao(2);
		ControlaColecao.adicionarLivro(colecao1, naruto);
		
		
	}

}
