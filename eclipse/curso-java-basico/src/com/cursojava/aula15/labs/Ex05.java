package com.cursojava.aula15.labs;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		double nota1;
		double nota2;
		double media;
		
		System.out.println("Informe as duas notas, separadas por espaço:");
		nota1 = scan.nextDouble();
		nota2 = scan.nextDouble();
		media = (nota1 + nota2)/2;
		System.out.println("Média: " + media);
		if(media==10) {
			System.out.println("Aprovado com distinção");
		}else if(media>=7) {
			System.out.println("Aprovado");
		}else {
			System.out.println("Reprovado");
		}
		
		scan.close();
	}
}
