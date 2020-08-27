package com.cursojava.aula17.labs;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int num;
		int qtdPares = 0;
		int qtdImpares = 0;
		
		for(int i=0; i<10; i++) {
			System.out.println("Informe um número: ");
			num = scan.nextInt();
			
			if(num%2==0) {
				qtdPares++;
			}else {
				qtdImpares++;
			}
		}
		
		System.out.println("Quantidade de números pares: " + qtdPares);
		System.out.println("Quantidade de números ímpares: " + qtdImpares);
		scan.close();
	}

}
