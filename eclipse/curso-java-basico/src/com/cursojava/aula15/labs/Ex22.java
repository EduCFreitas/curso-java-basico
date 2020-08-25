package com.cursojava.aula15.labs;

import java.util.Scanner;

public class Ex22 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		double pesoMorango;
		double precoMorango;
		double pesoMaca;
		double precoMaca;
		double desconto = 0;
		double valorMorango;
		double valorMaca;
		double pesoTotal;
		double valorTotal;
		
		System.out.println("Quantidade (kg) de morangos: ");
		pesoMorango = scan.nextDouble();
		if(pesoMorango>5) {
			precoMorango = 2.2;
		}else {
			precoMorango = 2.5;
		}
		
		System.out.println("Quantidade (kg) de maçãs: ");
		pesoMaca = scan.nextDouble();
		if(pesoMaca>5) {
			precoMaca = 1.5;
		}else {
			precoMaca = 1.8;
		}
		
		valorMorango = pesoMorango*precoMorango;
		valorMaca = pesoMaca*precoMaca;
		valorTotal = valorMorango + valorMaca;
		pesoTotal = pesoMorango + pesoMaca;
		
		if(pesoTotal>8 || valorTotal>25) {
			desconto = 10;
			valorTotal -= valorTotal*desconto/100;
		}
		
		System.out.println("Valor a ser pago: R$" + valorTotal);
		scan.close();

	}

}
