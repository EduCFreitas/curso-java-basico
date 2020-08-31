package com.cursojava.aula20.labs;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[][][] compromissos = new String[12][31][8];
		boolean sair = false;
		boolean mesValido = false;
		boolean diaValido = false;
		boolean horaValida = false;
		byte opcao;
		int mes = 0;
		int dia = 0;
		int hora = 0;
		
		while(!sair) {
			System.out.println("\nDigite 1 para adicionar compromisso");
			System.out.println("Digite 2 para verificar compromisso");
			System.out.println("Digite 0 para sair");
			opcao = scan.nextByte();
			
			if(opcao==1) {
				mesValido = false;
				diaValido = false;
				horaValida = false;
				while(!mesValido) {
					mes = 0;
					System.out.println("Informe o mês");
					mes = scan.nextInt() - 1;
					if(mes>=0 && mes<12) {
						mesValido = true;
					}else {
						System.out.println("Mês inválido. Digite novamente");
					}
				}
				while(!diaValido) {
					dia = 0;
					System.out.println("Informe o dia do mês");
					dia = scan.nextInt() - 1;
					if(dia>=0 && dia<31) {
						diaValido = true;
					}else {
						System.out.println("Dia inválido. Digite novamente");
					}
				}
				while(!horaValida) {
					hora = 0;
					System.out.println("Informe a hora do compromisso");
					hora = scan.nextInt();
					if(hora>=0 && hora<8) {
						horaValida = true;
					}else {
						System.out.println("Hora inválida. Digite novamente");
					}
				}
				System.out.println("Informe o compromisso");
				compromissos[mes][dia][hora] = scan.next();
				
			}else if(opcao==2) {
				mesValido = false;
				diaValido = false;
				horaValida = false;
				while(!mesValido) {
					mes = 0;
					System.out.println("Informe o mês");
					mes = scan.nextInt() - 1;
					if(mes>=0 && mes<12) {
						mesValido = true;
					}else {
						System.out.println("Mês inválido. Digite novamente");
					}
				}
				while(!diaValido) {
					dia = 0;
					System.out.println("Informe o dia do mês");
					dia = scan.nextInt() - 1;
					if(dia>=0 && dia<31) {
						diaValido = true;
					}else {
						System.out.println("Dia inválido. Digite novamente");
					}
				}
				while(!horaValida) {
					hora = 0;
					System.out.println("Informe a hora do compromisso");
					hora = scan.nextInt();
					if(hora>=0 && hora<8) {
						horaValida = true;
					}else {
						System.out.println("Hora inválida. Digite novamente");
					}
				}
				System.out.println("O compromisso agendado é: ");
				System.out.println(compromissos[mes][dia][hora]);
				
			}else if(opcao==0){
				sair = true;
			}else {
				System.out.println("Opção inválida! Digite novamente.");
			}
		}
		scan.close();

	}

}
