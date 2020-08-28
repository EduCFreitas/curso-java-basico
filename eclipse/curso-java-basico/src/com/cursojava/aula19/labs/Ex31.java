package com.cursojava.aula19.labs;

import java.util.Scanner;

public class Ex31 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int[] vetorA = new int[20];
		int[] vetorB = new int[vetorA.length];
		int posPares = 0;
		int posImpares = vetorA.length/2;
		
		for(int i=0; i<vetorA.length; i++) {
			System.out.println("Informe um valor para a posição " + i);
			vetorA[i] = scan.nextInt();
			
			if(vetorA[i]%2==0) {
				vetorB[posPares] = vetorA[i];
				posPares++;
			}else {
				vetorB[posImpares] = vetorA[i];
				posImpares++;
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
