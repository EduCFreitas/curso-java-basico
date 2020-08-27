package com.cursojava.aula17.labs;

import java.util.Scanner;

public class Ex26 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int num;
		int fatorial = 1;
		
		System.out.println("Informe um número: ");
		num = scan.nextInt();
		
		System.out.println("Fatorial de " + num);
		System.out.print(num + "! = ");
		for(int i=num; i>0; i--) {
			fatorial *= i;
			if(i!=1) {
				System.out.print(i + " . ");
			}else {
				System.out.print(i);
			}
			
		}
		
		System.out.print(" = " + fatorial);
		scan.close();

	}

}
