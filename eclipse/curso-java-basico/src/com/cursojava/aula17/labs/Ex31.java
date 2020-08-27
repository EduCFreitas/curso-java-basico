package com.cursojava.aula17.labs;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex31 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		DecimalFormat format = new DecimalFormat("###,###.##");
		double salarioInicial;
		double salarioAtual = 0;
		double aumento = 0;
		int anoInicio = 1995;
		int anoAtual = 2020;
		
		System.out.println("Informe o salário do funcionário: ");
		salarioInicial = scan.nextDouble();
		
		for(int i=anoInicio; i<=anoAtual; i++) {
			if(i==anoInicio) {
				salarioAtual = salarioInicial;
			}else if(i==1996) {
				aumento = 1.5;
			}else if(i>=1997){
				aumento*=2;
			}
			if(i>anoInicio) {
				salarioAtual += salarioAtual*aumento/100;
			}
			//System.out.println(i + " " + aumento);
		}
		
		System.out.println("Salário atual: R$" + format.format(salarioAtual));
		scan.close();

	}

}
