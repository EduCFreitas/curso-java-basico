package com.cursojava.aula15.labs;

import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		double lado1;
		double lado2;
		double lado3;
		String tipo;
		
		System.out.println("Informe a medida dos três lados do triângulo, separados por espaço");
		lado1 = scan.nextDouble();
		lado2 = scan.nextDouble();
		lado3 = scan.nextDouble();
		
		if(!((lado1+lado2>lado3) || (lado2+lado3>lado1) || (lado3+lado1>lado2))) {
			System.out.println("Não é um triângulo");
		}else {
			if(lado1==lado2 && lado2==lado3) {
				tipo = "Equilátero";
			}else if(lado1==lado2 || lado2==lado3 || lado3==lado1) {
				tipo = "Isósceles";
			}else {
				tipo = "Escaleno";
			}
			System.out.println("Tipo do triângulo: " + tipo);
		}
		scan.close();
		
		

	}

}
