package com.cursojava.aula15.labs;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int num1;
		int num2;
		
		System.out.println("Informe dois n�meros inteiros, separados por espa�o:");
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		
		if(num1 > num2) {
			System.out.println("O maior n�mero � " + num1);
		}else if(num1 < num2) {
			System.out.println("O maior n�mero � " + num2);
		}else {
			System.out.println("Os dois n�meros s�o iguais");
		}
		scan.close();

	}

}
