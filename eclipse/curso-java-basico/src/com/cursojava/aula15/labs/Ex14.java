package com.cursojava.aula15.labs;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		double nota1;
		double nota2;
		double media;
		String conceito;
		String situacao = "";
		
		System.out.println("Informe as duas notas, separadas por espaço: ");
		nota1 = scan.nextDouble();
		nota2 = scan.nextDouble();
		media = (nota1+nota2)/2;
		
		if(media<=4) {
			conceito = "E";
		}else if(media<=6) {
			conceito = "D";
		}else if(media<=7.5) {
			conceito = "C";
		}else if(media<=9) {
			conceito = "B";
		}else {
			conceito = "A";
		}
		
		switch(conceito) {
		case "A":
		case "B":
		case "C": situacao = "APROVADO"; break;
		case "D":
		case "E": situacao = "REPROVADO"; break;
		default: System.out.println("Erro no processamento!!!");
		}
		
		System.out.println("\nNota 1: " + nota1);
		System.out.println("Nota 2: " + nota2);
		System.out.println("Média: " + media);
		System.out.println("Conceito: " + conceito);
		System.out.println("Situação: " + situacao);
		scan.close();
	}

}
