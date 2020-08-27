package com.cursojava.aula17.labs;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		double num;
		double maior = Double.MIN_VALUE; //Menor valor double existente
		
		for(int i=0; i<5; i++) {
			System.out.println("Informe um número:");
			num = scan.nextDouble();
			
			if(num>maior) {
				maior = num;
			}
		}
		
		System.out.println("Maior número: " + maior);
		scan.close();

	}

}
