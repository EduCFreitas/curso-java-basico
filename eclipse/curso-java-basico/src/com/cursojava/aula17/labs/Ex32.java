package com.cursojava.aula17.labs;

import java.util.Scanner;

public class Ex32 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		boolean terminar = false;
		int cod;
		int qtd;
		double preco;
		double resultadoItem = 0;
		double total = 0;
		String output = "";
		
		do {
			System.out.println("Digite o código e a quantidade.\nDigite 0 0 para sair.");
			cod = scan.nextInt();
			qtd = scan.nextInt();
			
			if(cod==0 && qtd ==0) {
				terminar = true;
				output += "Total: R$" + total;
			}else {
				if(cod==100) {
					preco = 1.2;
					resultadoItem = qtd*preco;
					total+=resultadoItem;
					output += "Cachorro Quente -> R$" + preco + " * " + qtd + " = " + resultadoItem + "\n";
				}else if(cod==101) {
					preco = 1.3;
					resultadoItem = qtd*preco;
					total+=resultadoItem;
					output += "Bauru Simples -> R$" + preco + " * " + qtd + " = " + resultadoItem + "\n";
				}else if(cod==102) {
					preco = 1.5;
					resultadoItem = qtd*preco;
					total+=resultadoItem;
					output += "Bauru com Ovo -> R$" + preco + " * " + qtd + " = " + resultadoItem + "\n";
				}else if(cod==103) {
					preco = 1.2;
					resultadoItem = qtd*preco;
					total+=resultadoItem;
					output += "Hambúrguer -> R$" + preco + " * " + qtd + " = " + resultadoItem + "\n";
				}else if(cod==104) {
					preco = 1.3;
					resultadoItem = qtd*preco;
					total+=resultadoItem;
					output += "Cheeseburguer -> R$" + preco + " * " + qtd + " = " + resultadoItem + "\n";
				}else if(cod==105) {
					preco = 1.0;
					resultadoItem = qtd*preco;
					total+=resultadoItem;
					output += "Refrigerante -> R$" + preco + " * " + qtd + " = " + resultadoItem + "\n";
				}
			}
			
		}while(!terminar);
		
		System.out.println(output);
		scan.close();

	}

}
