package com.cursojava.aula13.labs;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		double valorHora = 0;
		double horasTrabalhadas = 0;
		double salario = 0;
		
		System.out.println("Qual o valor recebido por hora trabalhada? ");
		valorHora = scan.nextDouble();
		System.out.println("\nQual a quantidade de horas trabalhadas no mês? ");
		horasTrabalhadas = scan.nextDouble();
		salario = valorHora * horasTrabalhadas;
		System.out.println("\nValor a ser recebido: R$" + salario);
		scan.close();

	}

}
