package com.cursojava.aula19.labs;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int[] vetorA = new int[10];
		int qtdPares = 0;
		
		for(int i=0; i<vetorA.length; i++) {
			System.out.println("Informe o valor da posição " + i);
			vetorA[i] = scan.nextInt();
			if(vetorA[i]%2==0) {
				qtdPares++;
			}
		}
		
		System.out.println("Quantidade de elementos pares no vetor: " + qtdPares);
		scan.close();

	}

}
