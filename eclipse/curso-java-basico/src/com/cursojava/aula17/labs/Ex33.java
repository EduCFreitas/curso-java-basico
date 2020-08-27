package com.cursojava.aula17.labs;

import java.util.Scanner;

public class Ex33 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int n;
		double numerador;
		double soma = 0;
		
		System.out.println("Informe o valor de n: ");
		n = scan.nextInt();
		
		System.out.print("s = ");
		for(int i=1, j=1; i<=n; i++, j+=2) {
			if(i!=n) {
				System.out.print(i + "/" + j + " + ");
			}else {
				System.out.print(i + "/" + j + " = ");
			}
			numerador = i;
			soma += numerador/j;
		}
		System.out.print(soma);
		scan.close();

	}

}
