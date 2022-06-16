package br.com.generation.laco.repeticao;

import java.util.Scanner;

public class ExercioLacoRepeticao02 {

	public static void main(String[] args) {
//2- Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)
		
		int par=0;
		int impar=0;
		int numero=0;
		
		for(int i  = 0; i <10; i++) {
		int contador = i+1;
		System.out.println("Informe o  " +contador +"º numero");
		Scanner leia = new Scanner(System.in); 
		numero= leia.nextInt();
		
		if(numero%2==0) {
		par= par+1;
		}else 
		{
		impar=impar+1;
		}
		}
		
		System.out.println("A quantidade de numero impares foram de: " +impar);
		
		System.out.println("A quantidade de numero pares foram de: " +par);

	}

}
