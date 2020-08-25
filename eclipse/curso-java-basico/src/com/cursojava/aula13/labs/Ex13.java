package com.cursojava.aula13.labs;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		double valorHora = 0;
		double horasTrabalhadas = 0;
		double salarioBruto = 0;
		double valorIR = 0;
		double valorINSS = 0;
		double valorSindicato = 0;
		double valorDescontos = 0;
		double salarioLiquido = 0;
		
		System.out.println("Qual o valor recebido por hora trabalhada? ");
		valorHora = scan.nextDouble();
		System.out.println("\nQual a quantidade de horas trabalhadas no mês? ");
		horasTrabalhadas = scan.nextDouble();
		salarioBruto = valorHora * horasTrabalhadas;
		valorIR = salarioBruto * 0.11;
		valorINSS = salarioBruto * 0.08;
		valorSindicato = salarioBruto * 0.05;
		valorDescontos = valorIR + valorINSS + valorSindicato;
		salarioLiquido = salarioBruto - valorDescontos;
		
		System.out.println("\nSalário bruto: R$" + salarioBruto);
		System.out.println("IR (11%): R$" + valorIR);
		System.out.println("INSS (8%): R$" + valorINSS);
		System.out.println("Sindicato (5%): R$" + valorSindicato);
		System.out.println("Salário líquido: R$" + salarioLiquido);
		scan.close();

	}

}
