package com.cursojava.aula17.labs;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		double nota;
		
		System.out.println("Informe uma nota entre 0 e 10: ");
		nota = scan.nextDouble();
		
		while(nota<0 || nota>10) {
			System.out.println("Nota inv�lida!\nInsira uma nota v�lida:");
			nota = scan.nextDouble();
		}
		
		System.out.println("Nota " + nota);
		scan.close();

	}

}
