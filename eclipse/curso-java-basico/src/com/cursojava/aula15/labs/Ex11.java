package com.cursojava.aula15.labs;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		double salarioAtual;
		double porcAumento;
		double valorAumento;
		double salarioFinal;
		
		System.out.println("Informe seu salário atual: ");
		salarioAtual = scan.nextDouble();
		
		if(salarioAtual<=280) {
			porcAumento = 20;
		}else if(salarioAtual<=700) {
			porcAumento = 15;
		}else if(salarioAtual<=1500) {
			porcAumento = 10;
		}else {
			porcAumento = 5;
		}
		
		valorAumento = salarioAtual * (porcAumento/100);
		salarioFinal = salarioAtual + valorAumento;
		
		System.out.println("\nSalário anterior ao aumento: R$" + salarioAtual);
		System.out.println("Percentual de aumento aplicado: " + porcAumento);
		System.out.println("Valor do aumento: R$" + valorAumento);
		System.out.println("Novo salário: R$" + salarioFinal);
		scan.close();
	}
}
