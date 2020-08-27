package com.cursojava.aula17.labs;

import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int num;
		int fatorial = 1;
		
		System.out.println("Informe um número: ");
		num = scan.nextInt();
		
		System.out.println(num + "! = ");
		for(int i=num; i>0; i--) {
			fatorial *= i;
			System.out.println(i);
		}
		
		System.out.println("Resultado: " + fatorial);
		scan.close();

	}

}
