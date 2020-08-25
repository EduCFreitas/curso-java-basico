package com.cursojava.aula15.labs;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		double num1;
		double num2;
		double num3;
		
		System.out.println("Informe três números, separados por espaço: ");
		num1 = scan.nextDouble();
		num2 = scan.nextDouble();
		num3 = scan.nextDouble();
		
		if(num1>=num2 && num2>=num3) {
			System.out.println("Ordem decrescente: " + num1 + " -> " + num2 + " -> " + num3);
		}else if(num1>=num3 && num3>=num2){
			System.out.println("Ordem decrescente: " + num1 + " -> " + num3 + " -> " + num2);
		}else if(num2>=num1 && num1>=num3){
			System.out.println("Ordem decrescente: " + num2 + " -> " + num1 + " -> " + num3);
		}else if(num2>=num3 && num3>=num1){
			System.out.println("Ordem decrescente: " + num2 + " -> " + num3 + " -> " + num1);
		}else if(num3>=num1 && num1>=num2){
			System.out.println("Ordem decrescente: " + num3 + " -> " + num1 + " -> " + num2);
		}else {
			System.out.println("Ordem decrescente: " + num3 + " -> " + num2 + " -> " + num1);
		}
		
		scan.close();
	}

}
