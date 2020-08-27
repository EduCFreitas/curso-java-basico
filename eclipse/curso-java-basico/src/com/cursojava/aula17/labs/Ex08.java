package com.cursojava.aula17.labs;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		double num;
		double soma = 0;
		double media;
		
		for(int i=0; i<5; i++) {
			System.out.println("Digite um número: ");
			num = scan.nextDouble();
			soma += num;
		}
		
		media = soma/5;
		
		System.out.println("Soma: " + soma);
		System.out.println("Media: " + media);
		scan.close();

	}

}
