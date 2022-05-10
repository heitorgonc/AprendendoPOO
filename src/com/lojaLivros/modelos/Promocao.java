package com.lojaLivros.modelos;

import java.util.Date;

public class Promocao {
	
	private Date dtaInicial;
	private Date dtaFinal;
	
	public Promocao(Date dtaInicial, Date dtaFinal){
		if(dtaFinal.before(dtaInicial)) {
			throw new IllegalArgumentException("A data Final da promo��o n�o pode ser anterior a inicial");
		}
		this.dtaInicial = dtaInicial;
		this.dtaFinal = dtaFinal;
	}
	
	public void exibirPromocao(){
		System.out.println("Em promo��o");
		System.out.println("Iniciou em: "+dtaInicial+" finaliza em: "+dtaFinal);
	}
	
	public Date exibirDataFinal() {
		return dtaFinal;
	}

}
