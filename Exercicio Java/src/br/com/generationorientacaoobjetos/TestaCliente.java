package br.com.generationorientacaoobjetos;

public class TestaCliente {

	public static void main(String[] args) {
		
		//criar objeto
		
		cliente pessoa = new cliente("Andreia", 27, "sp");
		
		System.out.println(pessoa.getNome());

		pessoa.comprar();
		pessoa.pedirDesconto();
	}

}
