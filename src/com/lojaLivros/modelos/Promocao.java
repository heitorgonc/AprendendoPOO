package com.lojaLivros.modelos;

import java.util.Date;

import com.lojaLivros.Interfaces.VendaInterface;

public class Promocao {
	
	private Date dtaInicial;
	private Date dtaFinal;
	private float desconto;
	
	public Promocao(Date dtaInicial, Date dtaFinal, double desconto){
		Date dtaAtual = new Date();
		if(dtaFinal.before(dtaInicial)) {
			throw new IllegalArgumentException("A data final da promoção não pode ser anterior a inicial");
		}
		if(desconto < 2) {
			throw new IllegalArgumentException("O desconto da promoção não pode ser menor que 2%");
		}
		if(dtaAtual.after(dtaFinal)) {
			throw new IllegalArgumentException("A promoção não pode ser criada com uma data final anterior a atual");
		}
		this.dtaInicial = dtaInicial;
		this.dtaFinal = dtaFinal;
		this.desconto = (float)desconto;
	}
	
	public void apresentar(){
		System.out.println("Iniciou em: "+dtaInicial+" finaliza em: "+dtaFinal);
		System.out.println("Desconto de: "+desconto+"%");
	}
	
	public Date exibirDataFinal() {
		return dtaFinal;
	}
	
	public float valorDesconto(VendaInterface produto) {
		return produto.exibirValor() * (desconto/100); 
	}

}
