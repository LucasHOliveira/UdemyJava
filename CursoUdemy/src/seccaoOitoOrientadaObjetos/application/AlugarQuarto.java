package seccaoOitoOrientadaObjetos.application;

import java.util.Locale;
import java.util.Scanner;

import seccaoOitoOrientadaObjetos.entities.Pensionato;

public class AlugarQuarto {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Pensionato[] vect = new Pensionato[9];
		
		System.out.println("Digite quantos quarto ser�o alugados: ");
		int alug = sc.nextInt();
		
		for(int i=0; i<alug; i++) {
			sc.nextLine();
			String nome = sc.nextLine();
			String email = sc.nextLine();
			int quarto = sc.nextInt();
			
			vect[quarto] = new Pensionato(nome, email, quarto);
		}
		
		for(int i=0; i<vect.length; i++) {
			if (vect[i] !=null) {
				System.out.println(i + ": " + vect[i]);
			}
		}
		
		sc.close();
	}

}
