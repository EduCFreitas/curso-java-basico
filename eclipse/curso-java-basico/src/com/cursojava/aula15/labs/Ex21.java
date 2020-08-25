package com.cursojava.aula15.labs;

import java.util.Scanner;

public class Ex21 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		double litros;
		double desconto = 0;
		double preco = 0;
		double valorPago;
		String combustivel;
		boolean valido = true;
		
		System.out.println("Litros a serem abastecidos: ");
		litros = scan.nextDouble();
		System.out.println("Combustível a ser abastecido (A - Álcool; G - Gasolina): ");
		combustivel = scan.next();
		
		if(combustivel.equalsIgnoreCase("a")) {
			preco = 1.9;
			if(litros<=20) {
				desconto = 3;
			}else {
				desconto = 5;
			}
		}else if(combustivel.equalsIgnoreCase("g")) {
			preco = 2.5;
			if(litros<=20) {
				desconto = 4;
			}else {
				desconto = 6;
			}
		}else {
			valido = false;
			System.out.println("Combustível inválido!");
		}
		
		if(valido) {
			valorPago = preco*litros - (preco*litros*desconto/100);
			System.out.println("Valor a ser pago: R$" + valorPago);
		}
		
		scan.close();
	}

}
