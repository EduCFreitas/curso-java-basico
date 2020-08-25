package com.cursojava.aula13.labs;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe dois números separados por espaço");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		System.out.println("A soma é: " + (num1+num2));
		scan.close();

	}

}
