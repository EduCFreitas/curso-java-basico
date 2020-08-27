package com.cursojava.aula17.labs;

public class Ex24 {

	public static void main(String[] args) {
		
		double preco = 0.18;
		int qtd = 50;
		double total;
		
		System.out.println("Preço do pão: R$");
		System.out.println("Panificadora Pão de Ontem - Tabela de preços: ");
		
		for(int i=1; i<=qtd; i++) {
			total = preco*i;
			System.out.println(i + " - R$" + total);
		}

	}

}
