package com.cursojava.aula13.labs;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		double grausFahrenheit = 0;
		double grausCelsius = 0;
		
		System.out.println("Informe a temperatura em Fahrenheit");
		grausFahrenheit = scan.nextDouble();
		grausCelsius = 5. * (grausFahrenheit - 32.) / 9.;
		System.out.println("A temperatura em graus Celsius é " + grausCelsius +"°C");
		scan.close();
	}

}
