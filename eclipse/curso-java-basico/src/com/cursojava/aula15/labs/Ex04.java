package com.cursojava.aula15.labs;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String letra;
		
		System.out.println("Digite uma letra: ");
		letra = scan.next();
		
		/*if(letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") || letra.equalsIgnoreCase("i") || letra.equalsIgnoreCase("o") || letra.equalsIgnoreCase("u")) {
			System.out.println("É vogal");
		}else {
			System.out.println("É consoante");
		}*/
		
		if(letra.length() > 1) {
			System.out.println("ERRO: Não é uma letra válida");
		}else {
			switch(letra) {
			case "a":
			case "A":
			case "e":
			case "E":
			case "i":
			case "I":
			case "o":
			case "O":
			case "u":
			case "U": System.out.println("Vogal"); break;
			default: System.out.println("Consoante");
			}
		}
		
		scan.close();

	}

}
