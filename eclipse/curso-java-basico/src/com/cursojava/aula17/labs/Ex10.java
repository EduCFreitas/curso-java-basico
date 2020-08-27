package com.cursojava.aula17.labs;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int num1;
		int num2;
		
		System.out.println("Digite o primeiro número: ");
		num1 = scan.nextInt();
		System.out.println("Digite o segundo número: ");
		num2 = scan.nextInt();
		
		for(int i=num1; i<=num2; i++) {
			System.out.println(i);
		}
		scan.close();

	}

}
