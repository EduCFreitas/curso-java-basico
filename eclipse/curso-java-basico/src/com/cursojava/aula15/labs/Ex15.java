package com.cursojava.aula15.labs;

import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		double lado1;
		double lado2;
		double lado3;
		String tipo;
		
		System.out.println("Informe a medida dos tr�s lados do tri�ngulo, separados por espa�o");
		lado1 = scan.nextDouble();
		lado2 = scan.nextDouble();
		lado3 = scan.nextDouble();
		
		if(!((lado1+lado2>lado3) || (lado2+lado3>lado1) || (lado3+lado1>lado2))) {
			System.out.println("N�o � um tri�ngulo");
		}else {
			if(lado1==lado2 && lado2==lado3) {
				tipo = "Equil�tero";
			}else if(lado1==lado2 || lado2==lado3 || lado3==lado1) {
				tipo = "Is�sceles";
			}else {
				tipo = "Escaleno";
			}
			System.out.println("Tipo do tri�ngulo: " + tipo);
		}
		scan.close();
		
		

	}

}
