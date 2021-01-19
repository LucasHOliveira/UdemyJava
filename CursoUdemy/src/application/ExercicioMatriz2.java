package application;

import java.util.Scanner;

public class ExercicioMatriz2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a quantidade de linhas desejada na matriz: ");
		int line = sc.nextInt();
		System.out.print("Digite a quantidade de colunas desejada na matriz: ");
		int column = sc.nextInt();

		int[][] mat = new int[line][column];
		
		for (int i=0; i<mat.length; i++) {
			for(int j=0; j<mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.println();
		System.out.print("Digite o número que deseja pesquisar: ");
		int num = sc.nextInt();
		
		for (int i=0; i<mat.length; i++) {
			for (int j=0; j<mat[i].length; j++) {
				if(mat[i][j] == num) {
					System.out.println("Posicao: " + i + "," + j + ";");
					if (j > 0) {
						System.out.println("Esquerda: " + mat[i][j-1]);
					}
					if (i > 0) {
						System.out.println("Em cima: " + mat[i-1][j]);
					}
					if (j < mat[i].length-1) {
						System.out.println("Direita: " + mat[i][j+1]);
					}
					if (i < mat.length-1) {
						System.out.println("Embaixo: " + mat[i+1][j]);
					}
				}
			}
		}
				
		sc.close();

	}

}
