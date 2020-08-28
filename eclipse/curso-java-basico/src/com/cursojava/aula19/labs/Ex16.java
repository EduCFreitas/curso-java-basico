package com.cursojava.aula19.labs;

import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int[] vetorA = new int[10];
		int somaMenor15 = 0;
		int qtdIgual15 = 0;
		double somaMaior15 = 0;
		int qtdMaior15 = 0;
		double mediaMaior15;
		
		for(int i=0; i<vetorA.length; i++) {
			System.out.println("Informe o valor da posição " + i);
			vetorA[i] = scan.nextInt();
			if(vetorA[i]<15){
				somaMenor15 += vetorA[i];
			}
			else if(vetorA[i]==15){
				qtdIgual15++;
			}else {
				somaMaior15 += vetorA[i];
				qtdMaior15++;
			}
		}
		
		mediaMaior15 = somaMaior15/qtdMaior15;
		
		System.out.println("Vetor A: ");
		for(int i=0; i<vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		System.out.println("\nSoma dos elementos inferiores a 15: " + somaMenor15);
		System.out.println("Quantidade dos elementos iguais a 15: " + qtdIgual15);
		System.out.println("Média dos elementos maiores que 15: " + mediaMaior15);
		scan.close();


	}

}
