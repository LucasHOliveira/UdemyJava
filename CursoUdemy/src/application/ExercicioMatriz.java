package application;

import java.util.Scanner;

public class ExercicioMatriz {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o tamanho da matriz desejada: ");
		int n = sc.nextInt();

		int[][] mat = new int[n][n];
		
		for (int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				mat[i][i] = sc.nextInt();
			}
		}
		
		for (int i=0; i<n; i++) {
			System.out.println(mat[i][i] + " ");
		}
		
		System.out.println();
		
		int negativos = 0;
		for(int i=0; i<n; i++) {
			for(int j=0; j<n;j++) {
				if (mat[i][j] < 0) {
					negativos++;
				}
			}
		}
		
		System.out.println(negativos);
		
		sc.close();

	}

}
