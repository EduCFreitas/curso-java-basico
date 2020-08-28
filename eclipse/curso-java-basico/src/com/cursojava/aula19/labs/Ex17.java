package com.cursojava.aula19.labs;

import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int[] idades = new int[10];
		int qtdMaior35 = 0;
		
		for(int i=0; i<idades.length; i++) {
			System.out.println("Informe a idade da pessoa " + (i+1));
			idades[i] = scan.nextInt();
			if(idades[i]>35){
				qtdMaior35++;
			}
		}
		
		System.out.println("Vetor A: ");
		for(int i=0; i<idades.length; i++) {
			System.out.print(idades[i] + " ");
		}
		System.out.println("\nQuantidade de pessoas com idade superior a 35 anos: " + qtdMaior35);
		scan.close();

	}

}
