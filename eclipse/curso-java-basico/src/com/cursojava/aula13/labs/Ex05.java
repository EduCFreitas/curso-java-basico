package com.cursojava.aula13.labs;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe valor em metros para ser convertido em centímetros: ");
		float metro = scan.nextFloat();
		System.out.println(metro+ "m = "+(metro*100) + "cm");
		scan.close();

	}

}
