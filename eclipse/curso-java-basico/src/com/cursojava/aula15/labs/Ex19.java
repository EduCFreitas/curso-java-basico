package com.cursojava.aula15.labs;

import java.util.Scanner;

public class Ex19 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String operacao;
		double num1;
		double num2;
		double resultado = 0;
		boolean valida = true;
		
		System.out.println("Informe dois n�meros, separados por espa�o: ");
		num1 = scan.nextDouble();
		num2 = scan.nextDouble();
		System.out.println("Informe a opera��o desejada:\n+ -> Adi��o\n- -> Subtra��o\n* -> Multiplica��o\n/ -> Divis�o");
		operacao = scan.next();
		switch(operacao) {
			case "+": resultado = num1+num2; break;
			case "-": resultado = num1-num2; break;
			case "*": resultado = num1*num2; break;
			case "/":
				if(num2==0) {
					System.out.println("Imposs�vel dividir por 0"); valida = false; break;
				}else {
					resultado = num1/num2; break;
				}
			default: System.out.println("Opera��o inv�lida!");  valida = false; 
		}
		
		if(valida) {
			System.out.println("Resultado: " + resultado);
			
			if(resultado%2==0) {
				System.out.println("Resultado � par");
			}else {
				System.out.println("Resultado � �mpar");
			}
			
			if(resultado==0) {
				System.out.println("Resultado � 0");
			}else if(resultado>=0) {
				System.out.println("Resultado � positivo");
			}else {
				System.out.println("Resultado � negativo");
			}
		}
		
		scan.close();
		
	}

}
