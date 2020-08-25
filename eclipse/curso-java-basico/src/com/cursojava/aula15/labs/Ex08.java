package com.cursojava.aula15.labs;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		double preco1;
		double preco2;
		double preco3;
		
		System.out.println("Informe o valor dos três produtos, separados por espaços: ");
		preco1 = scan.nextDouble();
		preco2 = scan.nextDouble();
		preco3 = scan.nextDouble();
		
		if(preco1<preco2 && preco1<preco3) {
			System.out.println("Compre o produto 1");
		}else if(preco2<preco3 && preco2<preco1) {
			System.out.println("Compre o produto 2");
		}else{
			System.out.println("Compre o produto 3");
		}
		
		scan.close();
		
	}
}
