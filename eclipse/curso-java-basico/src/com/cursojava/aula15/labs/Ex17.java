package com.cursojava.aula15.labs;

import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int ano;
		
		System.out.println("Informe o ano: ");
		ano = scan.nextInt();
		if(((ano%4)==0 && (ano%100)!=0) || (ano%400)==0) {
			System.out.println("O ano é bissexto");
		}else {
			System.out.println("O ano não é bissexto");
		}

		scan.close();
	}

}
