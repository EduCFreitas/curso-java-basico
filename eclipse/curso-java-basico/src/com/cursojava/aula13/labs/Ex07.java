package com.cursojava.aula13.labs;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double lado1 = 0;
		double lado2 = 0;
		double area = 0;
		
		System.out.println("Informo os valores dos lados do quadrado, em cent�metros, separados por espa�o: ");
		lado1 = scan.nextDouble();
		lado2 = scan.nextDouble();
		area = lado1 * lado2;
		System.out.println("A �rea � de " + area + "cm^2");
		System.out.println("O dobro da �rea calculada � " + (area * 2) + "cm^2");
		scan.close();

	}

}
