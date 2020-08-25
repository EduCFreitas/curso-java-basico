package com.cursojava.aula15.labs;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		double valor;
		
		System.out.println("Informe um valor qualquer");
		valor = scan.nextDouble();
		
		if(valor > 0) {
			System.out.println("O valor informado é positivo");
		}else if(valor < 0) {
			System.out.println("O valor informado é negativo");
		}else {
			System.out.println("O valor informado é zero");
		}
		scan.close();

	}

}
