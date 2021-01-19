package seccaoOitoOrientadaObjetos.application;

import java.util.Locale;
import java.util.Scanner;

import seccaoOitoOrientadaObjetos.entities.Banco;

public class ProgramaCaixaEletronico {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Banco banco;		
		
		System.out.print("Entre com o número da conta: ");
		int numconta = sc.nextInt();
		System.out.print("Entre com o nome do titular:");
		sc.nextLine();
		String nome = sc.nextLine();
		System.out.print("Esse é um deposito inicial (y/n)? ");
		char response = sc.next().charAt(0);
		if (response == 'y') {
			System.out.print("Entre com o valor inicial: R$");
			double depositoInicial = sc.nextDouble();
			banco = new Banco(numconta, nome, depositoInicial);
		} else {
			banco = new Banco(numconta, nome);
		}
		
		System.out.println();
		System.out.println(banco);
		
		System.out.println();
		System.out.print("Digite a quantidade para deposito: $ ");
		double valorDeposito = sc.nextDouble();
		banco.depositDinheiro(valorDeposito);
		
		System.out.println("Alterações realizadas na conta");
		System.out.println(banco);
		
		System.out.println();
		System.out.print("Digite a quantidade que deseja sacar: $ ");
		double valorSaque = sc.nextDouble();
		banco.sacarDinheiro(valorSaque);
		
		System.out.println("Alterações realizadas na conta");
		System.out.println(banco);
		
		sc.close();
	}

}
