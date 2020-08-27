package com.cursojava.aula17.labs;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		double popA;
		double popB;
		double taxaA;
		double taxaB;
		int cont = 0;
		boolean valido = false;
		
		do {
			System.out.println("Informe a popula��o do pa�s A:");
			popA = scan.nextDouble();
			if(popA>0) {
				valido = true;
			}else {
				System.out.println("Popula��o A precisa ser maior que 0");
			}
		}while(!valido);
		
		valido = false;
		do {
			System.out.println("Informe a popula��o do pa�s B:");
			popB = scan.nextDouble();
			if(popB>0) {
				valido = true;
			}else {
				System.out.println("Popula��o B precisa ser maior que 0");
			}
		}while(!valido);
		
		valido = false;
		do {
			System.out.println("Informe a taxa de crescimento do pa�s A:");
			taxaA = scan.nextDouble();
			if(taxaA>0) {
				valido = true;
			}else {
				System.out.println("Taxa de crescimento A precisa ser maior que 0");
			}
		}while(!valido);
		
		valido = false;
		do {
			System.out.println("Informe a taxa de crescimento do pa�s B:");
			taxaB = scan.nextDouble();
			if(taxaB>0) {
				valido = true;
			}else {
				System.out.println("Taxa de crescimento B precisa ser maior que 0");
			}
		}while(!valido);
		
		while (popA<popB) {
			popA += (popA/100)*taxaA;
			popB += (popB/100)*taxaB;
			cont++;
		}
		
		System.out.println("Popula��o A: " + popA);
		System.out.println("Popula��o B: " + popB);
		System.out.println("Quantidade de anos: " + cont);
		scan.close();


	}

}
