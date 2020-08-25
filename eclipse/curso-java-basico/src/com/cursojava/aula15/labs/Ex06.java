package com.cursojava.aula15.labs;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		double num1;
		double num2;
		double num3;
		double maior;
		
		System.out.println("Informe três números, separados por espaço: ");
		num1 = scan.nextDouble();
		num2 = scan.nextDouble();
		num3 = scan.nextDouble();
		
		if(num1>num2 && num1>num3) {
			maior = num1;
		}else if(num2>num3 && num2>num1) {
			maior = num2;
		}else{
			maior = num3;
		}
		
		System.out.println("Maior: " + maior);
		scan.close();
	}

}
