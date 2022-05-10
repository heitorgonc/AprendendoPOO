package com.lojaLivros;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.lojaLivros.modelos.Hq;
import com.lojaLivros.modelos.Manga;
import com.lojaLivros.modelos.Promocao;
import com.lojaLivros.modelos.Volume;
import com.lojaLivros.servicos.ControlaColecao;
import com.lojaLivros.servicos.ControlaPromocao;
import com.lojaLivros.servicos.ControlaSaldo;

public class Principal {

	public static void main(String[] args) {
		
			Date dataAtual = new Date();
			Date dataFinal = ControlaPromocao.converterParaData("ghg");
			Promocao promo1 = new Promocao(dataFinal, dataAtual);
		
	}

}
