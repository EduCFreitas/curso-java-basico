package com.cursojava.aula20.labs;

import java.util.Random;

public class Ex02 {

	public static void main(String[] args) {
		int[][] numerosAleatorios = new int[10][10];
		Random numeroRandom = new Random();
		int maiorLinha5 = Integer.MIN_VALUE;
		int menorLinha5 = Integer.MAX_VALUE;
		int maiorLinha7 = Integer.MIN_VALUE;
		int menorLinha7 = Integer.MAX_VALUE;

		for(int i=0; i<numerosAleatorios.length; i++) {
			for(int j=0; j<numerosAleatorios[i].length; j++) {
				numerosAleatorios[i][j] = numeroRandom.nextInt(100);
				System.out.print(numerosAleatorios[i][j] + " | ");
				if(i==5) {
					if(numerosAleatorios[i][j]>maiorLinha5) {
						maiorLinha5 = numerosAleatorios[i][j];
					}
					if(numerosAleatorios[i][j]<menorLinha5) {
						menorLinha5 = numerosAleatorios[i][j];
					}
				}else if(i==7) {
					if(numerosAleatorios[i][j]>maiorLinha7) {
						maiorLinha7 = numerosAleatorios[i][j];
					}
					if(numerosAleatorios[i][j]<menorLinha7) {
						menorLinha7 = numerosAleatorios[i][j];
					}
				}
			}
			System.out.println();
		}
		
		System.out.println("\nMaior número da linha 5: " + maiorLinha5);
		System.out.println("Menor número da linha 5: " + menorLinha5);
		System.out.println("Maior número da linha 7: " + maiorLinha7);
		System.out.println("Menor número da linha 7: " + menorLinha7);
	}

}
