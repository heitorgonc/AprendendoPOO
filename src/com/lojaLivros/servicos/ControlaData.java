package com.lojaLivros.servicos;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class ControlaData {
	
	public static Date StringParaData(String dta) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		try {
			Date data = sdf.parse(dta);
			return data;
		}catch(ParseException e) {
			System.out.println("Não é possível converter  este valor para data ");
			System.out.println(e.getMessage());
		}
		return new Date();
	}
	
}
