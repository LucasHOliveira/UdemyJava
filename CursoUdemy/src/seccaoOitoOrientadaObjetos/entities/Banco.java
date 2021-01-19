package seccaoOitoOrientadaObjetos.entities;

public class Banco {
	
	private int numconta;
	private String nome;
	private double saldo;
	private double taxa = 5.0;
	
	public Banco(int numconta, String nome) {
		this.numconta = numconta;
		this.nome = nome;		
	}

	public Banco(int numconta, String nome, double depositoInicial) {
		this.numconta = numconta;
		this.nome = nome;
		depositDinheiro(depositoInicial);
	}

	public int getNumconta() {
		return numconta;
	}

	public String getNome() {
		return nome;
	}
	
	public double getSaldo() {
		return saldo;
	}	
	
	public void depositDinheiro(double amount) {
		this.saldo += amount;
	}
	
	public void sacarDinheiro(double amount) {
		this.saldo -= amount + taxa;
	}
	
	public String toString() {
		return "Conta "
				+ numconta
				+ ", Titular: "
				+ nome
				+ ", saldo: $ "
				+ String.format("%.2f", saldo);
	}
}
