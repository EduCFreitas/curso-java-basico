package com.cursojava.aula17.labs;

import java.util.Scanner;

public class Ex19 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int qtdNotas;
		double soma = 0;
		double media = 0;
		
		System.out.println("Informe o número de notas: ");
		qtdNotas = scan.nextInt();
		for(int i=1; i<=qtdNotas; i++) {
			System.out.println("Informe a nota " + i);
			soma += scan.nextDouble();
		}
		media = soma/qtdNotas;
		
		System.out.println("A média das notas é: " + media);
		scan.close();

	}

}
