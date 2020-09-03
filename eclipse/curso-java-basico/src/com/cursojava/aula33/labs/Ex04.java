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
			//Determinação de qual jogador fará a jogada
			if(jogo.vezJogador1()) {
				System.out.println("\nVez do jogador 1. Escolha linha e coluna (1-3)");
				sinal = 'X';
			}else {
				System.out.println("\nVez do jogador 2. Escolha linha e coluna (1-3)");
				sinal = 'O';
			}
			
			//Obtenção de valores de linha e coluna
			linha = valor("linha", scan);
			coluna = valor("coluna", scan);
			
			//Validação de jogada
			jogo.validarJogada(linha, coluna, sinal);
			
			//Impressão de tabuleiro
			jogo.imprimirTabuleiro();
			
			//Verificação se há ganhador
			if(jogo.verificarGanhador('X')) {
				ganhou = true;
				System.out.println("Parabéns, jogador 1 ganhou");
			}else if(jogo.verificarGanhador('O')) {
				ganhou = true;
				System.out.println("Parabéns, jogador 2 ganhou");
			}else if(jogo.getJogada()>9){
				System.out.println("Deu velha! Ninguém ganhou!");
			}
			
		}

		scan.close();

	}
	
	static int valor(String tipoValor, Scanner scan) {
		//Verificação de linha e coluna válidas
		int valor = 0;
		boolean valorValido = false;
		while(!valorValido) {
			System.out.println("Informe a " + tipoValor + " (1, 2 ou 3): ");
			valor = scan.nextInt() - 1;
			if(valor >=0 && valor<=2) {
				valorValido = true;
			}else {
				System.out.println("Entrada inválida, tente novamente");
			}
		}
		return valor;
	}

}
