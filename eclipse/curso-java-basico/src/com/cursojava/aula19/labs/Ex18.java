package com.cursojava.aula19.labs;

import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int[] idades = new int[10];
		int maiorIdade = Integer.MIN_VALUE;
		int menorIdade = Integer.MAX_VALUE;
		int posMaior = 0;
		int posMenor = 0;
		
		for(int i=0; i<idades.length; i++) {
			System.out.println("Informe a idade da pessoa " + (i+1));
			idades[i] = scan.nextInt();
			if(idades[i]>maiorIdade){
				maiorIdade = idades[i];
				posMaior = i;
			}else {
				menorIdade = idades[i];
				posMenor = i;
			}
		}
		
		System.out.println("Vetor A: ");
		for(int i=0; i<idades.length; i++) {
			System.out.print(idades[i] + " ");
		}
		System.out.println("\nMenor idade: " + menorIdade + " | Posição: " + posMenor);
		System.out.println("\nMaior idade: " + maiorIdade + " | Posição: " + posMaior);
		scan.close();

	}

}
