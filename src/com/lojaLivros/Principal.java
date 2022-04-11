package com.lojaLivros;

import com.lojaLivros.manga.Volume;
import com.lojaLivros.manga.Manga;
import com.lojaLivros.financeiro.Estoque;

public class Principal {

	public static void main(String[] args) {
		Manga mangaNaruto = new Manga("Naruto", 20);
		Volume volumeNaruto1 = new Volume(mangaNaruto, "Naruto conhece a vila","Kishimoto",23,13);
		Volume volumeNaruto2 = new Volume(mangaNaruto, "Aprendendo jutsus","Kishimoto",23,13);
		mangaNaruto.adicionarLivro(volumeNaruto1);
		mangaNaruto.adicionarLivro(volumeNaruto2);
		Manga mangaDBZ = new Manga("DBZ", 100);
		Volume volumeDbz1 = new Volume(mangaDBZ, "Sayajin vai a terra","Toryama",27,24);
		mangaDBZ.adicionarLivro(volumeDbz1);
		Estoque estoqueLoja = new Estoque(0);
		estoqueLoja.venderDesconto(volumeDbz1, 0);
		estoqueLoja.venderDesconto(mangaNaruto, 20);
		System.out.println(estoqueLoja.exibirSaldo());
		
	}

}
