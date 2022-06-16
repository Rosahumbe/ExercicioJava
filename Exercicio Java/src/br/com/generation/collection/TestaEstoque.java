package br.com.generation.collection;

import java.util.ArrayList;

public class TestaEstoque {

	public static void main(String[] args) {
		
		ArrayList<Estoque> listaEstoque = new ArrayList<>();
		
		//Armazenas Dados
		Estoque produto1 = new Estoque("Celular Iplhone 13", 13000, 8);
		Estoque produto2 = new Estoque("Celular Iplhone 13", 13000, 8);
		
		listaEstoque.add(produto1);
		listaEstoque.add(produto2);
		
		//remover Dados
		listaEstoque.remove(0);
		
		//Atualizar Dados
		listaEstoque.set(0, new Estoque("cefé com leite e pão na chapa", 4,2));
		
		//Apresentar Dados
		for (Estoque i: listaEstoque) {
			System.out.println(i);
			
		}
		

	}

}
