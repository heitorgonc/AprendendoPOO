package com.lojaLivros;

import com.lojaLivros.manga.Volume;
import com.lojaLivros.manga.Manga;
import com.lojaLivros.financeiro.Estoque;
import com.lojaLivros.hq.Hq;

public class Principal {

	public static void main(String[] args) {
		Manga mangaNaruto = new Manga("Naruto", 20);
		Volume naruto1 = new Volume(mangaNaruto, "Naruto conhece a vila","Kishimoto",25,"15.20");
		Volume naruto2 = new Volume(mangaNaruto, "Aprendendo jutsus","Kishimoto",23,"15.20");
		mangaNaruto.adicionarLivro(naruto1);
		mangaNaruto.adicionarLivro(naruto2);
		Manga mangaDBZ = new Manga("DBZ", 100);
		Volume dbz1 = new Volume(mangaDBZ, "Sayajin vai a terra","Toryama",17,"15.33");
		mangaDBZ.adicionarLivro(dbz1);
		Hq batman1 = new Hq("Batman surge", "Bob Kane",15,"15");
		Estoque estoqueLoja = new Estoque("0");
		estoqueLoja.venderDesconto(batman1, 0.1);
		estoqueLoja.venderDesconto(dbz1, 0);
		estoqueLoja.venderDesconto(mangaNaruto, 0.2);
		
	}

}
