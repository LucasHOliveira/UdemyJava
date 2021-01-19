package seccaoOitoOrientadaObjetos.entities;

public class Funcionario {

	public String nome;
	public double salarioBruto;
	public double tax;
	
	public double salarioLiquido() {
		return salarioBruto - tax;
	}
	
	public double aumentoSalario(double porc) {
		return salarioBruto += salarioBruto * porc / 100.00;
	}
	
	public String toString() {
		return nome + ", $ " + String.format("%.2f", salarioLiquido());
	}
}
