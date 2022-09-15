package br.com.principal;

import br.com.banco.Banco;
import br.com.batedeira.Batedeira;
import br.com.caneta.Caneta;

public class Main {

	public static void main(String[] args) {
		
		Caneta c1 = new Caneta("Bic", "Preta", 04.f, true);
		Caneta c2 = new Caneta("Nic", "Azul", 0.8f, true);
		Batedeira b1 = new Batedeira("Phillips", "Vermelho", true);
		Banco p1 = new Banco();
		Banco p2 = new Banco();
		
		/*c1.status();
		c2.status();
		b1.status();*/
		 p1.setStatus(false);
		 p1.abrirConta("CC");
		 p2.setStatus(true);
		 p1.setNumConta(1);
		 p2.setNumConta(2);
		 p1.setDono("Creuza");
		 p2.setDono("Raimunda");
		 p2.setTipo("CP");
		 p2.setSaldo(800);
		 p1.estadoAtual();
		 p2.estadoAtual();
		 p1.depositar(100);
		 p2.sacar(400);
		 p1.estadoAtual();
		 p2.estadoAtual();
		 
		
	}
	
}
