package com.cursojava.aula17.labs;

public class Ex23 {

	public static void main(String[] args) {
		
		double preco = 1.99;
		int qtd = 50;
		double total;
		
		System.out.println("Lojas Quase Dois - Tabela de preços: ");
		
		for(int i=1; i<=qtd; i++) {
			total = preco*i;
			System.out.println(i + " - R$" + total);
		}

	}

}
