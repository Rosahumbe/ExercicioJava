package br.com.generation.collection;

public class Estoque {
	
/*1- Crie uma hierarquia de classes conforme abaixo com os seguintes atributos e
comportamentos (observe a tabela), utilize os seus conhecimentos e distribua as
características de forma que tudo o que for comum a todos os animais fique na classe
Animal:
*/
	
	private String nome;
	private int preco;
	private int quantidade;
	public Estoque(String nome, int preco, int quantidade) {
	
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getPreco() {
		return preco;
	}
	public void setPreco(int preco) {
		this.preco = preco;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	@Override
	public String toString() {
		return "Nome: " + nome + "  | preco: " + preco +" | quantidade:" + quantidade;
	}
	
	

}
