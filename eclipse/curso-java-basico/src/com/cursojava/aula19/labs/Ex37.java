package com.cursojava.aula19.labs;

import java.util.Scanner;

public class Ex37 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int[] vetorA = new int[15];
		int[] vetorB = new int[vetorA.length];
		
		for(int i=0; i<vetorA.length; i++) {
			System.out.println("Informe um valor para a posi��o " + i);
			vetorA[i] = scan.nextInt();
			vetorB[i] = 1;
			for(int j=1; j<=vetorA[i]; j++) {
				vetorB[i] *= j;
			}
		}
		
		System.out.print("\nVetor A = ");
		for(int i=0; i<vetorA.length; i++) {
			System.out.print(vetorA[i] + " | ");
		}
		System.out.print("\nVetor B = ");
		for(int i=0; i<vetorB.length; i++) {
			System.out.print(vetorB[i] + " | ");
		}
		scan.close();

	}

}
