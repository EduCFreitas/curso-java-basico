package com.cursojava.aula19.labs;

import java.util.Scanner;

public class Ex24 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int[] vetorA = new int[10];
		boolean palindromo = true;
		
		for(int i=0; i<vetorA.length; i++) {
			System.out.println("Informe um número para a posição " + i);
			vetorA[i] = scan.nextInt();
		}
		
		for(int i=0; i<(vetorA.length)/2; i++) {
			if(vetorA[i] != vetorA[vetorA.length - i - 1]) {
				palindromo = false;
				break;
			}
		}
		
		System.out.print("\nVetor A = ");
		for(int i=0; i<vetorA.length; i++) {
			System.out.print(vetorA[i] + " | ");
		}
		
		if(palindromo) {
			System.out.println("\nPalíndromo");
		}else {
			System.out.println("\nalíndromo");
		}
		scan.close();

	}

}
