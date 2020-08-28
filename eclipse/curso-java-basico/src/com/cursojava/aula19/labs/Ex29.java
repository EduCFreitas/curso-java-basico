package com.cursojava.aula19.labs;

import java.util.Scanner;

public class Ex29 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int[] vetorA = new int[10];
		int[] vetorB = new int[vetorA.length];
		int[] vetorC = new int[vetorA.length + vetorB.length];
		
		for(int i=0; i<vetorA.length; i++) {
			System.out.println("Vetor A: Informe um valor para a posição " + i);
			vetorA[i] = scan.nextInt();
		}
		for(int i=0; i<vetorB.length; i++) {
			System.out.println("Vetor B: Informe um valor para a posição " + i);
			vetorB[i] = scan.nextInt();
		}
		for(int i=0; i<vetorC.length; i++) {
			if(i<(vetorC.length/2)) {
				vetorC[i] = vetorA[i];
			}else {
				vetorC[i] = vetorB[i - vetorB.length];
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
		System.out.print("\nVetor C = ");
		for(int i=0; i<vetorC.length; i++) {
			System.out.print(vetorC[i] + " | ");
		}
		scan.close();
	}

}
