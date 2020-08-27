package com.cursojava.aula17.labs;

import java.util.Scanner;

public class Ex34 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int n;
		double soma = 0;
		
		System.out.println("Informe o valor de n: ");
		n = scan.nextInt();
		
		System.out.print("H = ");
		for(int i=1; i<=n; i++) {
			if(i!=n) {
				System.out.print("1/" + i + " + ");
			}else {
				System.out.print("1/" + i + " = ");
			}
			soma += 1./i;
		}
		System.out.print(soma);
		scan.close();

	}

}
