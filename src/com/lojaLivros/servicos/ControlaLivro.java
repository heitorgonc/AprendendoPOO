package com.lojaLivros.servicos;

import com.lojaLivros.modelos.Volume;

public abstract class ControlaLivro {
	
	public static Volume criarVolume(String titulo, String autor, int numPag, float valor) {
		try {
			Volume volume = new Volume(titulo, autor, numPag, valor);
			return volume;
		}catch(IllegalArgumentException e) {
			Volume volume = null;
			System.out.println("Não foi possivel criar esse volume " + e.getMessage());
			return volume;
			
		}
	}
}
