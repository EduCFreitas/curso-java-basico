package com.cursojava.aula17.labs;

import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int qtdIdades;
		int idade;
		int soma = 0;
		double media;
		
		System.out.println("Informe a quantidade de idades: ");
		qtdIdades = scan.nextInt();
		for(int i=1; i<=qtdIdades; i++) {
			System.out.println("Informe a idade da pessoa " + i);
			idade = scan.nextInt();
			soma += idade;
		}
		
		media = soma/qtdIdades;
		System.out.println("Média de idade: " + media);
		
		if(media>=0 && media<=25) {
			System.out.println("Jovem");
		}else if(media<=60) {
			System.out.println("Adulta");
		}else {
			System.out.println("Idosa");
		}
		scan.close();

	}

}
