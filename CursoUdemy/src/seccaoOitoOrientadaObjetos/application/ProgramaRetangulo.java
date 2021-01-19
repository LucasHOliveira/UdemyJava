package seccaoOitoOrientadaObjetos.application;

import java.util.Locale;
import java.util.Scanner;

import seccaoOitoOrientadaObjetos.entities.Retangulo;

public class ProgramaRetangulo {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Retangulo ret;
		ret = new Retangulo();
		
		System.out.println("Digite a largura e a altura do retangulo: ");
		ret.width = sc.nextDouble();
		ret.height = sc.nextDouble();
		
		double area = ret.Area();
		double peri = ret.Perimeter();
		double diag = ret.Diagonal();
				
		System.out.printf("Area: %.2f%n", area);
		System.out.printf("Perimetro: %.2f%n", peri);
		System.out.printf("Perimetro: %.2f%n", diag);
		
		sc.close();

	}

}
