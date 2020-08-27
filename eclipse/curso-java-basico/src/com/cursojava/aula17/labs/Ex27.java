package com.cursojava.aula17.labs;

import java.util.Scanner;

public class Ex27 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int qtdTemp;
		double temp;
		double soma = 0;
		double media;
		double maior = Double.MIN_VALUE;
		double menor = Double.MAX_VALUE;
		
		System.out.println("Informe a quantidade de temperaturas a serem inseridas: ");
		qtdTemp = scan.nextInt();
		for(int i=1; i<=qtdTemp; i++) {
			System.out.println("Informe a temperatura " + i);
			temp = scan.nextDouble();
			soma+=temp;
			if(temp>maior) {
				maior = temp;
			}
			if(temp<menor) {
				menor = temp;
			}
		}
		media = soma/qtdTemp;
		
		System.out.println("Maior temperatura: " + maior);
		System.out.println("Menor temperatura: " + menor);
		System.out.println("Temperatura média: " + media);
		scan.close();

	}

}
