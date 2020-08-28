package com.cursojava.aula19.labs;

import java.util.Scanner;

public class Ex27 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int[] vetorA = new int[10];
		char[] vetorB = new char[vetorA.length];
		
		for(int i=0; i<vetorA.length; i++) {
			System.out.println("Vetor A: Informe um valor para a posição " + i);
			vetorA[i] = scan.nextInt();
			
			if(vetorA[i]<7) {
				vetorB[i] = 'a';
			}else if(vetorA[i]==7) {
				vetorB[i] = 'b';
			}else if(vetorA[i]>7 && vetorA[i]<10) {
				vetorB[i] = 'c';
			}else if(vetorA[i]==10) {
				vetorB[i] = 'd';
			}else {
				vetorB[i] = 'e';
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
