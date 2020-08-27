package com.cursojava.aula17.labs;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		double base;
		int expoente;
		double resultado;
		
		System.out.println("Informe a base: ");
		base = scan.nextDouble();
		System.out.println("Informe o expoente: ");
		expoente = scan.nextInt();
		resultado = base;
		
		for(int i=1; i<expoente; i++) {
			resultado*=base;
		}
		
		System.out.println("Resultado: " + resultado);
		scan.close();

	}

}
