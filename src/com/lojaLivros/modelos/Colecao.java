package com.lojaLivros.modelos;

import com.lojaLivros.Interfaces.VendaInterface;
import com.lojaLivros.exceptions.TamMaxColecaoException;
import com.lojaLivros.moldes.Livro;

public class Colecao implements VendaInterface{
	
	private Livro[] listaLivros;
	
	public Colecao(int tamanhoLista) {
		if(tamanhoLista <= 1) {
			throw new IllegalArgumentException("Uma coleção não pode ter apenas um livro ou menos");
		}
		listaLivros = new Livro[tamanhoLista];
	}
	
	public float exibirValor() {
		float valor = 0;
		for(int i=0; i < listaLivros.length; i++) {
			if(listaLivros[i] != null) {
				valor += listaLivros[i].exibirValor();
			}
		}
		return valor;
	}
	
	public void adicionarLivro(Livro novoLivro) throws TamMaxColecaoException{
		for(int i=0; listaLivros.length > i; i++) {
			if(listaLivros[i] == null) {
				listaLivros[i] = novoLivro;
				System.out.println("Livro adicionado com sucesso!");
				return;
			}
		}
		throw new TamMaxColecaoException("Essa coleção já atingiu seu tamanho máximo");
	}
	
	public void apresentar() {
		System.out.println("Tamanho máximo da coleção: "+ listaLivros.length);
		for(int i=0; listaLivros.length > i; i++) {
			if(listaLivros[i] ==null) {
				return;
			}
			System.out.println("Livro "+(i+1));
			listaLivros[i].apresentar();
		}
		return;
	}
	
}
