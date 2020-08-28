package com.cursojava.aula19.labs;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int[] vetorA = new int[10];
		int somaImpares = 0;
		int qtdImpares = 0;
		double mediaImpares;
		
		for(int i=0; i<vetorA.length; i++) {
			System.out.println("Informe o valor da posição " + i);
			vetorA[i] = scan.nextInt();
			if(vetorA[i]%2!=0){
				qtdImpares++;
				somaImpares += vetorA[i];
			}
		}
		
		mediaImpares = somaImpares/qtdImpares;
		
		System.out.println("Vetor A: ");
		for(int i=0; i<vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		System.out.println("\nMédia dos elementos ímpares " + mediaImpares);
		scan.close();

	}

}
