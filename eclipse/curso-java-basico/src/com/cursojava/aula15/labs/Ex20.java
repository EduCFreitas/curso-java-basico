package com.cursojava.aula15.labs;

import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String resposta;
		String veredito = "";
		int contador = 0;
		
		System.out.println("Telefonou para a v�tima? ('s' para sim)");
		resposta = scan.next();
		if(resposta.equalsIgnoreCase("s")) {
			contador++;
		}
		System.out.println("Esteve no local do crime? ('s' para sim)");
		resposta = scan.next();
		if(resposta.equalsIgnoreCase("s")) {
			contador++;
		}
		System.out.println("Mora perto da v�tima? ('s' para sim)");
		resposta = scan.next();
		if(resposta.equalsIgnoreCase("s")) {
			contador++;
		}
		System.out.println("Devia para a v�tima? ('s' para sim)");
		resposta = scan.next();
		if(resposta.equalsIgnoreCase("s")) {
			contador++;
		}
		System.out.println("J� trabalhou com a v�tima? ('s' para sim)");
		resposta = scan.next();
		if(resposta.equalsIgnoreCase("s")) {
			contador++;
		}
		
		switch(contador) {
		case 0:
		case 1: veredito = "inocente"; break;
		case 2: veredito = "suspeita"; break;
		case 3:
		case 4: veredito = "c�mplice"; break;
		case 5: veredito = "assassino"; break;
		}
		
		System.out.println("A pessoa � " + veredito);
		scan.close();
	}
}
