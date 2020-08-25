package com.cursojava.aula15.labs;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		double valorHora;
		double qtdHoras;
		double salarioBruto;
		double irPorc;
		double irValor;
		double sindicatoPorc = 3;
		double sindicatoValor;
		double inssPorc = 10;
		double inssValor;
		double fgtsPorc = 11;
		double fgtsValor;
		double totalDescontos;
		double salarioLiquido;
		
		System.out.println("Informe o valor da hora trabalhada: ");
		valorHora = scan.nextDouble();
		System.out.println("Informe a quantidade de horas trabalhadas:");
		qtdHoras = scan.nextDouble();
		
		salarioBruto = valorHora * qtdHoras;
		fgtsValor = salarioBruto * (fgtsPorc/100);
		sindicatoValor = salarioBruto * (sindicatoPorc/100);
		inssValor = salarioBruto * (inssPorc/100);
		if(salarioBruto<=900) {
			irPorc = 0;
		}else if(salarioBruto<=1500) {
			irPorc = 5;
		}else if(salarioBruto<=2500) {
			irPorc = 10;
		}else {
			irPorc = 20;
		}
		irValor = salarioBruto * (irPorc/100);
		totalDescontos = sindicatoValor + irValor + inssValor;
		salarioLiquido = salarioBruto - totalDescontos;
		
		System.out.println("Salário bruto (" + qtdHoras + " * " + valorHora +") : R$" + salarioBruto);
		System.out.println("(-) IR (" + irPorc +"%) : R$" + irValor);
		System.out.println("(-) INSS (" + inssPorc +"%) : R$" + inssValor);
		System.out.println("(-) Sindicato (" + sindicatoPorc + "%) : R$" + sindicatoValor);
		System.out.println("FGTS (" + fgtsPorc + "%) : R$" + fgtsValor);
		System.out.println("Total de descontos: R$" + totalDescontos);
		System.out.println("Salário Líquido: R$" + salarioLiquido);
		scan.close();

	}

}
