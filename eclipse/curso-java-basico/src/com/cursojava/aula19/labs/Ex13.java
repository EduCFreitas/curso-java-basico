package com.cursojava.aula19.labs;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int[] vetorA = new int[10];
		int soma = 0;
		
		for(int i=0; i<vetorA.length; i++) {
			System.out.println("Informe o valor da posi��o " + i);
			vetorA[i] = scan.nextInt();
			if(vetorA[i]%5==0){
				soma += vetorA[i];
			}
		}
		
		System.out.println("Vetor A: ");
		for(int i=0; i<vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		System.out.println("\nSoma dos elementos m�ltiplos de 5 " + soma);
		scan.close();

	}

}
