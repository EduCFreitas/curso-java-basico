package com.cursojava.aula17.labs;

import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int n;
		int primeiro = 1;
		int segundo = 1;
		int proximo;
		
		System.out.println("Informe o enésimo termo da série de Fibonacci: ");
		n = scan.nextInt();
		
		switch(n) {
			case 0: System.out.println("0 não é um valor válido"); break;
			case 1: System.out.println(primeiro); break;
			case 2: {
				System.out.println(primeiro);
				System.out.println(segundo);
			}; break;
			default: {
				System.out.println(primeiro);
				System.out.println(segundo);
			
				for(int i=3; i<=n; i++) {
					proximo = primeiro+segundo;
					primeiro = segundo;
					segundo = proximo;
					System.out.println(proximo);
				}
			}
		}
		scan.close();

	}

}
