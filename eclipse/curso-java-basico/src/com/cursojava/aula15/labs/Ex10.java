package com.cursojava.aula15.labs;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String turno;
		
		System.out.println("Informe o turno que você estuda:\nM - Matutino\nV - Vespertino\nN - Noturno");
		turno = scan.next();
		
		switch(turno) {
		case "m":
		case "M": System.out.println("Bom dia!"); break;
		case "v":
		case "V": System.out.println("Boa tarde!"); break;
		case "n":
		case "N": System.out.println("Boa noite!"); break;
		default: System.out.println("Valor inválido!");
		}
		
		scan.close();

	}

}
