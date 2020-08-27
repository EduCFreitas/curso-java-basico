package com.cursojava.aula17.labs;

import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int num;
		boolean primo = true;
		
		System.out.println("Informe um número:");
		num = scan.nextInt();
		
		for(int i=2; i<num; i++) {
			if(num%i==0) {
				System.out.println("Não é um número primo | Divisível por " + i);
				primo = false;
			}
		}
		
		if(primo) {
			System.out.println("É um número primo");
		}
		scan.close();
		

	}

}
