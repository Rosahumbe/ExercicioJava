package br.com.generation.vetoresmatriz;

import java.util.Scanner;

public class Exercicio1 {
	
	public static void main (String [] args) {
		
		double [] vetor = new double [5];
		double maior = 0;
		
		Scanner entrada = new Scanner(System.in);
		
		//Recebe
		for(int i=0; i < vetor.length; i++) {
			System.out.println("Digite um numero: ");
			vetor[i] = entrada.nextDouble();
			if(vetor[i] > maior) {
				maior = vetor [i];
				
				}
			}
			
		//Mostrar
			for(int i=0; i < vetor.length; i++) {
				System.out.println(vetor[i]);
				
		}
			System.out.println("o maior numero foi o " + maior);
	}

}
