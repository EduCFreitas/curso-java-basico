package com.cursojava.aula19.labs;

import java.util.Scanner;

public class Ex33 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int[] vetorA = new int[10];
		boolean primo = true;
		String msg = "";
		
		for(int i=0; i<vetorA.length; i++) {
			System.out.println("Informe um valor para a posição " + i);
			vetorA[i] = scan.nextInt();
		}
		
		for(int i=0; i<vetorA.length; i++) {
			for(int j=2; j<vetorA[i]; j++) {
				if(vetorA[i]%j==0) {
					primo = false;
					break;
				}else {
					primo = true;
				}
			}
			
			if(primo) {
				msg = "é primo";
			}else {
				msg = "não é primo";
			}
			System.out.println(vetorA[i] + " " + msg);
		}
		scan.close();

	}

}
