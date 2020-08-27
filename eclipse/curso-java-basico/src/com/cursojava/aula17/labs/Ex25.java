package com.cursojava.aula17.labs;

import java.util.Scanner;

public class Ex25 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		boolean sair = false;
		double preco;
		double total = 0;
		double pgto;
		double troco;
		String continuarCompra;
		
		
		System.out.println("Lojas Tabajara");
		do {
			System.out.println("\nDeseja informar uma nova compra? S/N");
			continuarCompra = scan.next();
			preco = 0;
			total = 0;
			pgto = 0;
			troco = 0;
			if(continuarCompra.equalsIgnoreCase("s")) {
				for(int i=1; i!=0; i++) {
					System.out.print("Produto " + i + ": R$");
					preco = scan.nextDouble();
					total+=preco;
					if(preco==0) {
						break;
					}
				}
				System.out.println("Total: R$" + total);
				System.out.print("Dinheiro: R$");
				pgto = scan.nextDouble();
				troco = pgto-total;
				if(troco<0){
					System.out.println("Erro!!!");
				}else {
					System.out.println("Troco: R$" + troco);
				}
				
			}else {
				sair = true;
			}
		}while(!sair);
		System.out.println("Encerrando");

		scan.close();
	}

}
