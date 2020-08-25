package com.cursojava.aula13.labs;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		double grausCelsius = 0;
		double grausFahrenheit = 0;
		
		System.out.println("Informe a temperatura em Celsius");
		grausCelsius = scan.nextDouble();
		grausFahrenheit = (grausCelsius * (9. / 5.)) + 32;
		System.out.println("A temperatura em graus Fahrenheit é " + grausFahrenheit +"°F");
		scan.close();
	}
}
