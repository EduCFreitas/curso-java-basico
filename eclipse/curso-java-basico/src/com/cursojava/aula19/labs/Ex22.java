package com.cursojava.aula19.labs;

import java.util.Scanner;

public class Ex22 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int[] vetorA = new int[10];
		double qtd0 = 0;
		double qtd1 = 0;
		double pctg0;
		double pctg1;
		
		for(int i=0; i<vetorA.length; i++) {
			vetorA[i] = (int) Math.round(Math.random()*1);
			
			if(vetorA[i]==0) {
				qtd0++;
			}else {
				qtd1++;
			}
		}
		pctg0 = qtd0*100/vetorA.length;
		pctg1 = qtd1*100/vetorA.length;
		
		System.out.println("\nPorcentagem de 0: " + pctg0 + "%");
		System.out.println("Porcentagem de 1: " + pctg1 + "%");
		scan.close();

	}

}
