package com.cursojava.aula20;

import java.util.Scanner;

public class MatrizIrregular {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int numEntrevistados;
		int qtdFilhos;
		String[][] nomesFilhos;
		
		System.out.println("Informe o número de pessoas que serão entrevistadas: ");
		numEntrevistados = scan.nextInt();
		nomesFilhos = new String[numEntrevistados][];
		
		for(int i=0; i<nomesFilhos.length; i++) {
			System.out.println("\nInforme a quantidade de filhos: ");
			qtdFilhos = scan.nextInt();
			nomesFilhos[i] = new String[qtdFilhos];
			
			for(int j=0; j<nomesFilhos[i].length; j++) {
				System.out.println("Informe o nome do " + (j+1) + "° filho: ");
				nomesFilhos[i][j] = scan.next();
			}
		}
		
		for(int i=0; i<nomesFilhos.length; i++) {
			System.out.println("\nPessoa " + i + " tem " + nomesFilhos[i].length + " filhos:");
			for(int j=0; j<nomesFilhos[i].length; j++) {
				System.out.println(nomesFilhos[i][j]);
			}
		}

	}

}
