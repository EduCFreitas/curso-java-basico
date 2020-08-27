package com.cursojava.aula17.labs;

import java.util.Scanner;

public class Ex29 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int num;
		boolean primo = true;
		
		System.out.println("Informe um número: ");
		num = scan.nextInt();
		for(int i=1; i<=num; i++) {
			
			for(int j=2; j<i; j++) {
				if(i%j==0) {
					primo = false;
				}
			}
			if(primo) {
				System.out.println(i);
			}
		}
		scan.close();

	}

}
