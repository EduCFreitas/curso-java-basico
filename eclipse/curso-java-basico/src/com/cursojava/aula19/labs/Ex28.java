package com.cursojava.aula19.labs;

import java.util.Scanner;

public class Ex28 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int[] vetorA = new int[10];
		int[] vetorB = new int[vetorA.length];
		
		for(int i=0; i<vetorA.length; i++) {
			System.out.println("Vetor A: Informe um valor para a posição " + i);
			vetorA[i] = scan.nextInt();
			vetorB[vetorA.length - i - 1] = vetorA[i];
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
