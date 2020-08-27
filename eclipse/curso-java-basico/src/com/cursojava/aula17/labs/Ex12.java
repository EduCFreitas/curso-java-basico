package com.cursojava.aula17.labs;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int num;
		
		System.out.println("Informe o número:");
		num = scan.nextInt();
		System.out.println("Tabuada de "+ num +":");
		
		for(int i=0; i<=10; i++) {
			System.out.println(num + " x " + i + " = " + (num*i));
		}
		scan.close();

	}

}
