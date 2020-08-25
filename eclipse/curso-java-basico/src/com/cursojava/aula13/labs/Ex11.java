package com.cursojava.aula13.labs;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int inteiro1 = 0;
		int inteiro2 = 0;
		double real = 0;
		double resultado1 = 0;
		double resultado2 = 0;
		double resultado3 = 0;
		
		System.out.println("Informe dois números inteiros e um número real, separados por espaço");
		inteiro1 = scan.nextInt();
		inteiro2 = scan.nextInt();
		real = scan.nextDouble();
		resultado1 = (inteiro1 * 2) * (inteiro2 / 2);
		resultado2 = (inteiro1 * 3) + real;
		resultado3 = Math.pow(real, 3);
		
		System.out.println("Resultado 1: " + resultado1);
		System.out.println("Resultado 2: " + resultado2);
		System.out.println("Resultado 3: " + resultado3);
		scan.close();

	}

}
