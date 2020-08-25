package com.cursojava.aula15.labs;

import java.util.Scanner;

public class Ex23 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String tipoCarne;
		double qtdCarne;
		double precoCarne = 0;
		double desconto = 0;
		double precoTotal;
		String tipoPgto;
		double valorDesconto;
		double valorPagar;
		
		System.out.println("Informe o tipo de carne:\nF - Filé duplo\nA - Alcatra\nP - Pichanha");
		tipoCarne = scan.next();
		System.out.println("Informe a quantidade de carne (kg): ");
		qtdCarne = scan.nextDouble();
		System.out.println("Informe o tipo de pagamento:\nC para cartão do mercado");
		tipoPgto = scan.next();
		
		if(tipoCarne.equalsIgnoreCase("f")) {
			if(qtdCarne>5) {
				precoCarne = 5.8;
			}else {
				precoCarne = 4.9;
			}
			tipoCarne = "Filé Duplo";
		} else if(tipoCarne.equalsIgnoreCase("a")) {
			if(qtdCarne>5) {
				precoCarne = 6.8;
			}else {
				precoCarne = 5.9;
			}
			tipoCarne = "Alcatra";
		}else if(tipoCarne.equalsIgnoreCase("p")) {
			if(qtdCarne>5) {
				precoCarne = 7.8;
			}else {
				precoCarne = 6.9;
			}
			tipoCarne = "Picanha";
		}
		
		precoTotal = qtdCarne * precoCarne;
		
		if(tipoPgto.equalsIgnoreCase("c")) {
			desconto = 5./100;
			tipoPgto = "Cartão Mercado";
		}else {
			tipoPgto = "A vista";
		}
		
		valorDesconto = desconto * precoTotal;
		valorPagar = precoTotal - valorDesconto;
		
		System.out.println("\nTipo de carne: " + tipoCarne);
		System.out.println("Quantidade: " + tipoCarne + "kg");
		System.out.println("Valor total: R$" + precoTotal);
		System.out.println("Tipo de pagamento: " + tipoPgto);
		System.out.println("Valor do desconto: R$" + valorDesconto);
		System.out.println("Valor a pagar: R$" + valorPagar);
		scan.close();
		
	}

}
