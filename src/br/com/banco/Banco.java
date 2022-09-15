package br.com.banco;

public class Banco {

	private int numConta;
	private double saldo;
	private String tipo;
	private String dono;
	private boolean status;
	
	public void estadoAtual() {
		System.out.println("===============================");
		System.out.println("Conta: " + this.getNumConta());
		System.out.println("Tipo: " + this.getTipo());
		System.out.println("Dono: " + this.getDono());
		System.out.println("Saldo: " + this.getSaldo());
		System.out.println("Status: " + this.isStatus());
	}
	
	public Banco() {
		this.setSaldo(0);
		this.setStatus(false);
	}
	public int getNumConta() {
		return numConta;
	}
	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getDono() {
		return dono;
	}
	public void setDono(String dono) {
		this.dono = dono;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	
	public void abrirConta(String tipo) {
		this.setTipo(tipo);
		this.setStatus(true);
		if (tipo == "CC") {
			this.setSaldo(50);;
		} else if (tipo == "CP"){
			this.setSaldo(150);
		}
	}
	
	public void fecharConta() {
		if (this.getSaldo() > 0) {
			System.out.println("Impossível realizar esta ação. A conta ainda possui saldo.");
		} else if(this.getSaldo() < 0 ) {
			System.out.println("Impossível realizar esta ação. A conta ponssui débito.");
		} else {
			this.setStatus(false);
			System.out.println("Conta fechada com sucesso.");
		}
	}
	
	public void depositar(double valor) {
		if (this.isStatus()) {
			this.setSaldo(this.getSaldo()+ valor);
			System.out.println("Depósito realizado com sucesso.");
		} else {
			System.out.println("Impossível realizar esta ação");
		}
	}
	
	public void sacar(double valor) {
		if (this.isStatus()) {
			if(this.getSaldo() >=valor) {
				this.setSaldo(this.getSaldo()- valor);
				System.out.println("Saque realizado com sucesso");
			} else {
				System.out.println("Saldo insuficiente para saque.");
			}
		} else {
			System.out.println("Impossível sacar de uma conta fechada");
		}
	}
	
	public void pagarMensalidade() {
		int valor = 0;
	
		if (this.getTipo()== "CC") {
			valor = 12;
		} else if (this.getTipo() == "CP") {
			valor = 20;
		}
		if (this.isStatus()) {
			this.setSaldo(this.getSaldo() - valor);
			System.out.println("Mensalidade paga com sucesso");
		} else {
			System.out.println("Impossível pagar em uma conta fechada");
		}
		
	}
	
}

