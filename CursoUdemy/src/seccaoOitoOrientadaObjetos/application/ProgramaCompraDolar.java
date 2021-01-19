package seccaoOitoOrientadaObjetos.application;

import java.util.Locale;
import java.util.Scanner;

import seccaoOitoOrientadaObjetos.entities.ConversorMoeda;

/*
	Fazer um programa que receba a quantidade que a pessoa quer comprar de dolares e converter para real
	1� O valor atual do dolar
	2� Quantos dolares a pessoa de deve comprar
	3� Apresentar o valor em reais, levando em considera��o 6% de IOF
	
	U$ 3.10
	U$ 200.00
	R$ 657.20

*/
public class ProgramaCompraDolar {

	public static void main(String[] args) {


		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a cotacao do dolar hoje: U$ ");
		double v = sc.nextDouble();
		System.out.print("Digite quantos dolares quer comprar: U$ ");
		double qtd = sc.nextDouble();
		
		double total = ConversorMoeda.conversor(v, qtd);
		
		System.out.printf("Valor do cota��o utilizada U$ %.2f%n", v);
		System.out.printf("Quantidade de dolares desejado U$ %.2f%n", qtd);
		System.out.printf("Total em reais para compra R$ %.2f%n", total);
		
		sc.close();
	}

}
