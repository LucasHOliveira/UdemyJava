package seccaoOitoOrientadaObjetos.application;

import java.util.Locale;
import java.util.Scanner;

import seccaoOitoOrientadaObjetos.entities.Produto;

public class ProgramaProduto {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com as informações do produto");
		System.out.println("Nome: ");
		String nome = sc.nextLine();
		System.out.println("Preço: ");
		double preco = sc.nextDouble();
		System.out.println("Quantidade: ");
		int qtd = sc.nextInt();

		Produto produto = new Produto(nome, preco, qtd);
		
		System.out.println();
		System.out.println("Dados do produto: " + produto);
		
		System.out.println("Entre com a quantidade de produtos para ser adicionado no estoque: ");
		qtd = sc.nextInt();
		produto.addProdutos(qtd);
		
		System.out.println();
		System.out.println("Dados atualizados: " + produto);
		
		System.out.println("Entre com a quantidade de produtos para remover do estoque: ");
		qtd = sc.nextInt();
		produto.removeProdutos(qtd);
		
		System.out.println();
		System.out.println("Dados atualizados: " + produto);
		
		sc.close();

	}

}
