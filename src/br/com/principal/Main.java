package br.com.principal;

import br.com.caneta.Caneta;

public class Main {

	public static void main(String[] args) {
		
		Caneta c1 = new Caneta();
		c1.setModelo("Bic");
		c1.setPonta(0.5f);
		c1.status();
		System.out.println("Tenho uma caneta " + c1.getModelo() + " de ponta " + c1.getPonta());
	}

}
