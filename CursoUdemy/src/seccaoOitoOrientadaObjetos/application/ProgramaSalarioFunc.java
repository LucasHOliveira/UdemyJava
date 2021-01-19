package seccaoOitoOrientadaObjetos.application;

import java.util.Locale;
import java.util.Scanner;

import seccaoOitoOrientadaObjetos.entities.Funcionario;

public class ProgramaSalarioFunc {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		Funcionario funcionario;
		funcionario = new Funcionario();
		
		System.out.println("Digite o nome do funcionario, salario e taxa: ");
		funcionario.nome = sc.nextLine();
		funcionario.salarioBruto = sc.nextDouble();
		funcionario.tax = sc.nextDouble();

		System.out.println("Funcionario: " + funcionario);
		
		System.out.println("Qual a porcentagem de aumento? ");
		double porc = sc.nextDouble();
		funcionario.aumentoSalario(porc);
		
		System.out.println("Atualização funcionario: " + funcionario);
		
		sc.close();

	}

}
