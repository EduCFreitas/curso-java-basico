package com.cursojava.aula15.labs;

import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		double a;
		double b;
		double c;
		double delta;
		double raiz1;
		double raiz2;
		
		System.out.println("ax^2 + bx + c =");
		System.out.println("Informe o valor de 'a': ");
		a = scan.nextDouble();
		
		if(a!=0) {
			System.out.println("Informe o valor de 'b': ");
			b = scan.nextDouble();
			System.out.println("Informe o valor de 'c': ");
			c = scan.nextDouble();
			delta = b*b - 4.*a*c;
			if(delta>=0) {
				if(delta==0) {
					raiz1 = (-b + Math.sqrt(delta)) / (2.*a);
					System.out.println("A raiz é: " + raiz1);
				}else {
					raiz1 = (-b + Math.sqrt(delta)) / (2.*a);
					raiz2 = (-b - Math.sqrt(delta)) / (2.*a);
					System.out.println("As raizes são: " + raiz1 + "; " + raiz2);
				}
				
			}else {
				System.out.println("A equação não possui raízes reais");
			}
			
		}else {
			System.out.println("a = 0 não constitui uma equação de segundo grau");
		}
		scan.close();
	}
}
