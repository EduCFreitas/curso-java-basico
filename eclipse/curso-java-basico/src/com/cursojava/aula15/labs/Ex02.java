package com.cursojava.aula15.labs;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		double valor;
		
		System.out.println("Informe um valor qualquer");
		valor = scan.nextDouble();
		
		if(valor > 0) {
			System.out.println("O valor informado � positivo");
		}else if(valor < 0) {
			System.out.println("O valor informado � negativo");
		}else {
			System.out.println("O valor informado � zero");
		}
		scan.close();

	}

}
