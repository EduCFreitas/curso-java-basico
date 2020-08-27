package com.cursojava.aula17.labs;

import java.util.Scanner;

public class Ex30 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int num;
		int inicio;
		int fim;
		boolean valido = true;
		
		do {
			System.out.println("Informe o número para tabuada:");
			num = scan.nextInt();
			System.out.println("Informe o início da tabuada:");
			inicio = scan.nextInt();
			System.out.println("Informe o fim da tabuada:");
			fim = scan.nextInt();
			
			if(fim<inicio) {
				System.out.println("Informa valor inicial menor que valor final!!!");
				valido = false;
			}else {
				valido = true;
			}
		}while(!valido);
		
		System.out.println("\nTabuada de "+ num +":");
		System.out.println("Começar por "+ inicio);
		System.out.println("Terminar em "+ fim);
		System.out.println();
		for(int i=inicio; i<=fim; i++) {
			System.out.println(num + " x " + i + " = " + (num*i));
		}
		
		scan.close();
	}

}
