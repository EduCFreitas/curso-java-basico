package com.cursojava.aula19.labs;

import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int[] vetorA = new int[10];
		double qtdPares = 0;
		double qtdImpares = 0;
		double pctgPares;
		double pctgImpares;
		
		for(int i=0; i<vetorA.length; i++) {
			System.out.println("Informe o valor da posição " + i);
			vetorA[i] = scan.nextInt();
			if(vetorA[i]%2!=0){
				qtdImpares++;
			}
			else {
				qtdPares++;
			}
		}
		
		pctgPares = 100*qtdPares/vetorA.length;
		pctgImpares = 100*qtdImpares/vetorA.length;
		
		System.out.println("Vetor A: ");
		for(int i=0; i<vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		System.out.println("\nPorcantagem de pares " + pctgPares + "%");
		System.out.println("Porcantagem de ímpares " + pctgImpares + "%");
		scan.close();

	}

}
