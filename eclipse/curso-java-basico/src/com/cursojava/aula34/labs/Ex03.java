package com.cursojava.aula34.labs;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int num;
		
		do {
			System.out.println("Informe um n�mero positivo");
			num = scan.nextInt();
			if(num<0) {
				System.out.println("N�mero inv�lido. Tente novamente");
			}
		}while(num<0);
		
		System.out.println(Calculadora.fatorial(num));
		scan.close();

	}

}
