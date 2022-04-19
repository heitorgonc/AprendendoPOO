package com.lojaLivros;

import com.lojaLivros.modelos.Hq;
import com.lojaLivros.modelos.Manga;
import com.lojaLivros.modelos.Volume;
import com.lojaLivros.servicos.ControlaColecao;
import com.lojaLivros.servicos.ControlaSaldo;

public class Principal {

	public static void main(String[] args) {
		Manga mangaNaruto = new Manga("Naruto", 20);
		Volume naruto1 = new Volume("Naruto conhece a vila", "Kishimoto", "25", 15.5, mangaNaruto);
		Volume naruto2 = new Volume("Aprendendo jutsus", "Kishimoto", "23", 15, mangaNaruto);
		Manga mangaDBZ = new Manga("DBZ", 100);
		Volume dbz1 = new Volume("Sayajin vai a terra", "Toryama", "17", 15, mangaDBZ);
		Hq batman1 = new Hq("Batman surge das trevas", "Bob Kane","15",25);
		ControlaColecao.adicionarLivro(dbz1, mangaDBZ);
		ControlaColecao.adicionarLivro(naruto1, mangaNaruto);
		ControlaColecao.adicionarLivro(naruto2, mangaNaruto);
		ControlaSaldo controlaSaldo = new ControlaSaldo();
		//controlaSaldo.venderColecaoDesconto(mangaNaruto, 50);
		//controlaSaldo.venderColecaoDesconto(mangaDBZ, 50);
		controlaSaldo.venderLivro(batman1);
	}

}
