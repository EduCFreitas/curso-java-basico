package com.cursojava.aula15.labs;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		double num1;
		double num2;
		double num3;
		double maior;
		double menor;
		
		System.out.println("Informe tr�s n�meros, separados por espa�o: ");
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
		
		if(num1<num2 && num1<num3) {
			menor = num1;
		}else if(num2<num3 && num2<num1) {
			menor = num2;
		}else{
			menor = num3;
		}
		
		System.out.println("Maior: " + maior);
		System.out.println("Menor: " + menor);
		scan.close();

	}

}
