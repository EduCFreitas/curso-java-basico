package com.cursojava.aula17.labs;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String nome;
		String senha;
		
		System.out.println("Informe nome de usuário: ");
		nome = scan.next();
		System.out.println("Informe senha: ");
		senha = scan.next();
		
		while(nome.contentEquals(senha)) {
			System.out.println("\nNome e senha iguais!");
			System.out.println("Informe nome de usuário: ");
			nome = scan.next();
			System.out.println("Informe senha: ");
			senha = scan.next();
		}
		
		System.out.println("\nCadastrado com sucesso");
		scan.close();

	}

}
