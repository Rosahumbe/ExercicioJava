package br.com.generationorientacaoobjetos;

public class cliente {
	//Crie uma classe cliente e apresente os atributos e métodos referentes
	//esta classe, em seguida crie um objeto cliente, defina as instancias deste
	//objeto e apresente as informações deste objeto no console.
	
	//Atributos
	private String nome;
	private int idade;
	private String estado;
	
	//metodos
	public void comprar() {
		System.out.println("cliente esta comprando");
	}
	public void pedirDesconto() {
		System.out.println("Me de um desconto?");
	}
	public cliente(String nome, int idade, String estado) {
	
		this.nome = nome;
		this.idade = idade;
		this.estado = estado;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	

}
