package seccaoOitoOrientadaObjetos.entities;

public class Produto {
	
	private String nome;
	private double preco;
	private int qtd;
	
	public Produto(String nome, double preco, int qtd) {
		this.nome = nome;
		this.preco = preco;
		this.qtd = qtd;
	}
	
	public Produto(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double totalValorEstoque() {
		return preco * qtd;
	}
	
	public void addProdutos(int qtd) {
		this.qtd += qtd; 
	}
	
	public void removeProdutos(int qtd) {
		this.qtd -= qtd;
	}
	
	public String toString() {
		return nome
			+ ", $ "
			+ String.format("%.2f", preco)
			+ ", "
			+ qtd
			+ " unidade, total: $ "
			+ String.format("%.2f", totalValorEstoque());
	}

}
