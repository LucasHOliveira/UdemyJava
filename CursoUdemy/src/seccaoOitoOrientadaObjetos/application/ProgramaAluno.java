package seccaoOitoOrientadaObjetos.application;

import java.util.Locale;
import java.util.Scanner;

import seccaoOitoOrientadaObjetos.entities.CalculoNota;

public class ProgramaAluno {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		CalculoNota aluno = new CalculoNota();
		
		System.out.println("Digite o nome do aluno e a nota1, nota2 e nota3");
		aluno.nome = sc.nextLine();
		aluno.nota1 = sc.nextDouble();
		aluno.nota2 = sc.nextDouble();
		aluno.nota3 = sc.nextDouble();
		
		System.out.printf("Nota final: %.2f%n", aluno.notaFinal());
		
		if (aluno.notaFinal() < 60.0) {
			System.out.println("Não passou");
			System.out.printf("Faltando %.2f Pontos%n", aluno.validaPonto());
		} else {
			System.out.println("Passou");
		}
		
		sc.close();

	}

}
