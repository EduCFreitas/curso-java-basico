package com.cursojava.aula33.labs;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		JogoVelha jogo = new JogoVelha();
		boolean ganhou = false;
		char sinal;
		int linha = 0;
		int coluna = 0;
		
		System.out.println("Jogo da velha");
		System.out.println("Jogador 1 = X");
		System.out.println("Jogador 1 = O");
		
		while(!ganhou) {
			//Determina��o de qual jogador far� a jogada
			if(jogo.vezJogador1()) {
				System.out.println("\nVez do jogador 1. Escolha linha e coluna (1-3)");
				sinal = 'X';
			}else {
				System.out.println("\nVez do jogador 2. Escolha linha e coluna (1-3)");
				sinal = 'O';
			}
			
			//Obten��o de valores de linha e coluna
			linha = valor("linha", scan);
			coluna = valor("coluna", scan);
			
			//Valida��o de jogada
			jogo.validarJogada(linha, coluna, sinal);
			
			//Impress�o de tabuleiro
			jogo.imprimirTabuleiro();
			
			//Verifica��o se h� ganhador
			if(jogo.verificarGanhador('X')) {
				ganhou = true;
				System.out.println("Parab�ns, jogador 1 ganhou");
			}else if(jogo.verificarGanhador('O')) {
				ganhou = true;
				System.out.println("Parab�ns, jogador 2 ganhou");
			}else if(jogo.getJogada()>9){
				System.out.println("Deu velha! Ningu�m ganhou!");
			}
			
		}

		scan.close();

	}
	
	static int valor(String tipoValor, Scanner scan) {
		//Verifica��o de linha e coluna v�lidas
		int valor = 0;
		boolean valorValido = false;
		while(!valorValido) {
			System.out.println("Informe a " + tipoValor + " (1, 2 ou 3): ");
			valor = scan.nextInt() - 1;
			if(valor >=0 && valor<=2) {
				valorValido = true;
			}else {
				System.out.println("Entrada inv�lida, tente novamente");
			}
		}
		return valor;
	}

}
