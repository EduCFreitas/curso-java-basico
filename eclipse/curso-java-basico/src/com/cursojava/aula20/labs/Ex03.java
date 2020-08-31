package com.cursojava.aula20.labs;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int[][] matrizM = new int[3][3];
		int qtdPares = 0;
		int qtdImpares = 0;
		
		for(int i=0; i<matrizM.length; i++) {
			for(int j=0; j<matrizM[i].length; j++) {
				System.out.println("Informe valor para linha " + i + " coluna " + j);
				matrizM[i][j] = scan.nextInt();
				if(matrizM[i][j] % 2 ==0) {
					qtdPares++;
				}else {
					qtdImpares++;
				}
			}
		}
		
		for(int i=0; i<matrizM.length; i++) {
			for(int j=0; j<matrizM[i].length; j++) {
				System.out.print(matrizM[i][j] + " | ");
			}
			System.out.println();
		}
	
		System.out.println("\nQuantidade de pares: " + qtdPares);
		System.out.println("Quantidade de ímpares: " + qtdImpares);
		scan.close();

	}

}
