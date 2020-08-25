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
		
		System.out.println("Informe dois números, separados por espaço: ");
		num1 = scan.nextDouble();
		num2 = scan.nextDouble();
		System.out.println("Informe a operação desejada:\n+ -> Adição\n- -> Subtração\n* -> Multiplicação\n/ -> Divisão");
		operacao = scan.next();
		switch(operacao) {
			case "+": resultado = num1+num2; break;
			case "-": resultado = num1-num2; break;
			case "*": resultado = num1*num2; break;
			case "/":
				if(num2==0) {
					System.out.println("Impossível dividir por 0"); valida = false; break;
				}else {
					resultado = num1/num2; break;
				}
			default: System.out.println("Operação inválida!");  valida = false; 
		}
		
		if(valida) {
			System.out.println("Resultado: " + resultado);
			
			if(resultado%2==0) {
				System.out.println("Resultado é par");
			}else {
				System.out.println("Resultado é ímpar");
			}
			
			if(resultado==0) {
				System.out.println("Resultado é 0");
			}else if(resultado>=0) {
				System.out.println("Resultado é positivo");
			}else {
				System.out.println("Resultado é negativo");
			}
		}
		
		scan.close();
		
	}

}
