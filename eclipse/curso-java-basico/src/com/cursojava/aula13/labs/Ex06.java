package com.cursojava.aula13.labs;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe o valor do raio em cm:");
		float raio = scan.nextFloat();
		System.out.println("A circunfer�ncia � de " + (Math.PI * Math.pow(raio, 2))+"cm");
		scan.close();
		
	}

}
