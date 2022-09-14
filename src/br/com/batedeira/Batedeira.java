package br.com.batedeira;

public class Batedeira {

	private String marca;
	private String cor;
	private boolean estado;
	
	

	public Batedeira(String marca, String cor, boolean estado) {
		super();
		this.marca = marca;
		this.cor = cor;
		this.estado = estado;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	
	public void status() {
		System.out.println(">>>> SOBRE A BATEDEIRA <<<< ");
		System.out.println("Marca: " + this.getMarca());
		System.out.println("Cor " + this.getCor());
		System.out.println("Se encontra em bom estado? " + this.isEstado());
	}
	
}
