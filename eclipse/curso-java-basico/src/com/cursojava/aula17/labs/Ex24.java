package com.cursojava.aula17.labs;

public class Ex24 {

	public static void main(String[] args) {
		
		double preco = 0.18;
		int qtd = 50;
		double total;
		
		System.out.println("Pre�o do p�o: R$");
		System.out.println("Panificadora P�o de Ontem - Tabela de pre�os: ");
		
		for(int i=1; i<=qtd; i++) {
			total = preco*i;
			System.out.println(i + " - R$" + total);
		}

	}

}
