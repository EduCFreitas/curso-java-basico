package com.cursojava.aula13.labs;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe o valor do raio em cm:");
		float raio = scan.nextFloat();
		System.out.println("A circunferência é de " + (2 * raio * Math.PI)+"cm");
		scan.close();
		
	}

}
