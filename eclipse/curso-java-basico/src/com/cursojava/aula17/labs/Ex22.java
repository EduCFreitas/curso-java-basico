package com.cursojava.aula17.labs;

import java.util.Scanner;

public class Ex22 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int qtdCds;
		double valor;
		double soma = 0;
		double media;
		
		System.out.println("Informe a quantidade de CD's na cole��o: ");
		qtdCds = scan.nextInt();
		
		for(int i=1; i<=qtdCds; i++) {
			System.out.println("Informe o valor do CD " + i);
			valor = scan.nextDouble();
			soma+=valor;
		}
		media = soma/qtdCds;
		
		System.out.println("O valor m�dio de cada CD �: R$" + media);
		scan.close();

	}

}
