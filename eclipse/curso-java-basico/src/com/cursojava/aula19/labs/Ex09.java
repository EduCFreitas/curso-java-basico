package com.cursojava.aula19.labs;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		DecimalFormat dc = new DecimalFormat("###,###.###");
		double[] vetorA = new double[10];
		double[] vetorB = new double[vetorA.length];
		double[] vetorC = new double[vetorB.length];
		
		for(int i=0; i<vetorA.length; i++) {
			System.out.println("Entre com o valor do vetor A da posição " + i);
			vetorA[i] = scan.nextInt();
		}
		
		for(int i=0; i<vetorB.length; i++) {
			System.out.println("Entre com o valor do vetor B da posição " + i);
			vetorB[i] = scan.nextInt();
			vetorC[i] = vetorA[i] / vetorB[i];
		}
		
		System.out.print("Vetor A = ");
		for(int i=0; i<vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		
		System.out.print("\nVetor B = ");
		for(int i=0; i<vetorB.length; i++) {
			System.out.print(vetorB[i] + " ");
		}
		
		System.out.print("\nVetor C = ");
		for(int i=0; i<vetorC.length; i++) {
			System.out.print(dc.format(vetorC[i]) + " ");
		}
		scan.close();


	}

}
