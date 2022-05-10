package com.lojaLivros.moldes;

import java.util.Date;

import com.lojaLivros.exceptions.PromoExistenteException;
import com.lojaLivros.modelos.Promocao;

public abstract class Livro{
	
	private String titulo;
	private final String autor;
	private int numPag;
	private final float valor;
	private Promocao promocao;
	
	public Livro(String titulo, String autor, int numPag, float valor) {
		if(titulo == "") {
			throw new IllegalArgumentException("O livro precisa ter um titulo");
		}
		if(autor == "") {
			throw new IllegalArgumentException("O livro precisa de um autor");
		}
		if(numPag <= 4) {
			throw new IllegalArgumentException("O livro precisa ter um número de páginas superior a 4");
		}
		if(valor <= 0) {
			throw new IllegalArgumentException("O valor do livro não pode ser nulo ou negativo");
		}
		this.titulo = titulo;
		this.autor = autor;
		this.numPag = numPag;
		this.valor = valor;
		promocao = null;
	}
	
	public float exibirValor() {
		return valor;
	}
	
	public String exibirAutor() {
		return autor;
	}
	
	public String exibirTitulo() {
		return titulo;
	}
	
	public float exibirNumPag() {
		return numPag;
	}
	
	public Promocao exibirPromocao() {
		return promocao;
	}
	
	public void adicionarPromocao(Promocao promocao) throws PromoExistenteException{
		if(this.promocao == null) {
			Date dataAtual = new Date();
			Date finalPromo = promocao.exibirDataFinal();
			if(dataAtual.before(finalPromo)) {
				this.promocao = promocao;
				return;
			}
			throw new IllegalArgumentException("Essa promoção já está finalizada");
		}
		throw new PromoExistenteException("Esse livro já está em promoção");
	}
	
	public void removerPromocao() {
		promocao = null;
	}
}
