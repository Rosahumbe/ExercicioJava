package OperadoresLogicos;

import java.util.Scanner;

public class execicio01 {

	public static void main(String[] args) {
	
//1. Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e
//		dias e mostre-a expressa apenas em dias.
		// 1 ano tem 365 dias
		// 1 ano tem 12 meses
		// 1 mes tem 30 dias

		int anos,meses,dias, totalEmDias;
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite os anos:");
		anos = leitor.nextInt();
		System.out.println("Digite os meses:");
		meses = leitor.nextInt();
		System.out.println("Digite os dias:");
		dias = leitor.nextInt();
		
		totalEmDias = anos * 365 + meses * 30 + dias;
		System.out.println ("Idade em dias: " + totalEmDias);
		
		
	}

}
