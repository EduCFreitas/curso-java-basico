package com.cursojava.aula17.labs;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String nome;
		int idade;
		double salario;
		String sexo;
		String estadoCivil;
		
		System.out.println("Informe o nome:");
		nome = scan.next();
		while(nome.length()<3) {
			System.out.println("\nNome inv�lido!\nInforme um nome com mais de tr�s caracteres:");
			nome = scan.next();
		}
		
		System.out.println("Informe a idade:");
		idade = scan.nextInt();
		while(idade<0 || idade>150) {
			System.out.println("\nIdade inv�lida!\nInforme idade entre 0 e 150 anos:");
			idade = scan.nextInt();
		}
		
		System.out.println("Informe o sal�rio:");
		salario = scan.nextDouble();
		while(salario<=0) {
			System.out.println("\nSal�rio inv�lido!\nInforme sal�rio maior que 0:");
			salario = scan.nextDouble();
		}
		
		System.out.println("Informe o estado civil (F - Feminino | M - Masculino):");
		sexo = scan.next();
		while(!(sexo.equalsIgnoreCase("f") || sexo.equalsIgnoreCase("m"))) {
			System.out.println("\nSexo inv�lido!\nInforme 'F' ou 'M':");
			sexo = scan.next();
		}
		
		System.out.println("Informe o sexo (S - Solteiro | C - Casado | V - Vi�vo | D - Divorciado):");
		estadoCivil = scan.next();
		while(!(estadoCivil.equalsIgnoreCase("s") || estadoCivil.equalsIgnoreCase("c") || estadoCivil.equalsIgnoreCase("v") || estadoCivil.equalsIgnoreCase("d"))) {
			System.out.println("\nEstado civil inv�lido!\nInforme 'S', 'C', 'V' ou 'D':");
			estadoCivil = scan.next();
		}

		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Sal�rio: " + salario);
		System.out.println("Sexo: " + sexo);
		System.out.println("Estado civil: " + estadoCivil);
		scan.close();
	}

}
