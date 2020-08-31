package com.cursojava.aula20.labs;

import java.util.Random;

public class Ex01 {

	public static void main(String[] args) {
		
		int[][] numerosAleatorios = new int[4][4];
		Random numeroRandom = new Random();
		int maior = Integer.MIN_VALUE;
		int linha = 0;
		int coluna = 0;
		
		for(int i=0; i<numerosAleatorios.length; i++) {
			for(int j=0; j<numerosAleatorios[i].length; j++) {
				numerosAleatorios[i][j] = numeroRandom.nextInt(100);
				System.out.print(numerosAleatorios[i][j] + " | ");
				if(numerosAleatorios[i][j]>maior) {
					maior = numerosAleatorios[i][j];
					linha = i;
					coluna = j;
				}
			}
			System.out.println();
		}
		
		System.out.println("\nMaior número: " + maior);
		System.out.println("Linha: " + linha);
		System.out.println("Coluna: " + coluna);
			

	}

}
