package com.cursojava.aula15.labs;

import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int numero;
		
		System.out.println("Informe um n�mero inteiro: ");
		numero = scan.nextInt();
		if(numero%2==0) {
			System.out.println("N�mero par");
		}else {
			System.out.println("N�mero �mpar");
		}
		
		scan.close();

	}

}
