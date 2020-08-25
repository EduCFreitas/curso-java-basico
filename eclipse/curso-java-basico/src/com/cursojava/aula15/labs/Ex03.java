package com.cursojava.aula15.labs;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String sexo;
		
		System.out.println("Informe o sexo:\nM - Masculino\nF - Feminino");
		sexo = scan.next();
		if(sexo.equalsIgnoreCase("m")) {
			System.out.println("Sexo masculino");
		}else if(sexo.equalsIgnoreCase("f")) {
			System.out.println("Sexo feminino");
		}else {
			System.out.println("Sexo inválido");
		}
		
		scan.close();
	}
}
