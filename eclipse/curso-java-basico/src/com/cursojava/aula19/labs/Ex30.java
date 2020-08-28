package com.cursojava.aula19.labs;

import java.util.Scanner;

public class Ex30 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int[] vetorA = new int[20];
		int[] vetorB = new int[vetorA.length];
		int[] impares = new int[vetorA.length];
		int posPares = 0;
		int posImpares = 0;
		
		for(int i=0; i<vetorA.length; i++) {
			System.out.println("Informe um valor para a posição " + i);
			vetorA[i] = scan.nextInt();
			
			if(vetorA[i]%2==0) {
				vetorB[posPares] = vetorA[i];
				posPares++;
			}else {
				impares[posImpares] = vetorA[i];
				posImpares++;
			}
		}
		
		System.out.print("\nVetor A = ");
		for(int i=0; i<vetorA.length; i++) {
			System.out.print(vetorA[i] + " | ");
		}
		System.out.print("\nVetor pares = ");
		for(int i=0; i<posPares; i++) {
			System.out.print(vetorB[i] + " | ");
		}
		System.out.print("\nVetor ímpares = ");
		for(int i=0; i<posImpares; i++) {
			System.out.print(impares[i] + " | ");
		}
		scan.close();
	}

}
