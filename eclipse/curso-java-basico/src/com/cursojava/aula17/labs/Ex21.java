package com.cursojava.aula17.labs;

import java.util.Scanner;

public class Ex21 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int qtdTurmas;
		int qtdAlunos;
		int soma = 0;
		double media;
		boolean invalido = true;
		
		System.out.println("Informe a quantidade de turmas");
		qtdTurmas = scan.nextInt();
		for(int i=1; i<=qtdTurmas; i++) {
			
			do {
				System.out.println("Informe n�mero de alunos da turma " + i);
				qtdAlunos = scan.nextInt();
				if(qtdAlunos<=40){
					invalido = false;
				}else {
					System.out.println("N�mero de alunos inv�lido! Digite novamente");
					invalido = true;
				}
			}while(invalido);
			
			soma += qtdAlunos;
		}
		
		invalido = true;
		media = soma/qtdTurmas;
		
		System.out.println("M�dia: " + media);
		scan.close();

	}

}
