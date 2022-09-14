package br.com.principal;

import br.com.batedeira.Batedeira;
import br.com.caneta.Caneta;

public class Main {

	public static void main(String[] args) {
		
		Caneta c1 = new Caneta("Bic", "Preta", 04.f, true);
		Caneta c2 = new Caneta("Nic", "Azul", 0.8f, true);
		Batedeira b1 = new Batedeira("Phillips", "Vermelho", true);
		c1.status();
		c2.status();
		b1.status();
	}

	
	
}
