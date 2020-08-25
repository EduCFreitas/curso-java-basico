package com.cursojava.aula13.labs;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		double altura = 0;
		double pesoIdeal = 0;
		
		System.out.println("Informa a sua altura: ");
		altura = scan.nextDouble();
		pesoIdeal = (72.7 * altura) - 58;
		System.out.println("Seu peso ideal é " + pesoIdeal +"kg");
		scan.close();

	}

}
