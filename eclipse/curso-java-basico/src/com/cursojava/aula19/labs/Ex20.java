package com.cursojava.aula19.labs;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		DecimalFormat dc = new DecimalFormat("###,###.##");
		double[] vetorA = new double[20];
		double cotacao;
		
		System.out.println("Informe a cotação do dólar: ");
		cotacao = scan.nextDouble();
		
		System.out.println("Vetor A = ");
		for(int i=0; i<vetorA.length; i++) {
			vetorA[i] = cotacao * (i+1);
			System.out.print(dc.format(vetorA[i]) + " | ");
		}
		scan.close();

	}

}
