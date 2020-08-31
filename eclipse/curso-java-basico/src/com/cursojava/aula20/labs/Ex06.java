package com.cursojava.aula20.labs;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		char[][] jogoVelha = new char[3][3];
		int jogada = 1;
		char sinal;
		int linha = 0;
		int coluna = 0;
		boolean ganhou = false;
		boolean linhaValida = false;
		boolean colunaValida = false;
		
		System.out.println("Jogo da velha");
		System.out.println("Jogador 1 = X");
		System.out.println("Jogador 1 = O");
		
		while(!ganhou) { //Jogo continua aocntecendo até que nenhum dos jogadores ganhe
			
			//Determinação de qual jogador fará a jogada
			if(jogada%2==1) { //Vez do jogador 1
				System.out.println("\nVez do jogador 1. Escolha linha e coluna (1-3)");
				sinal = 'X';
			}else { //Vez do jogador 2
				System.out.println("\nVez do jogador 2. Escolha linha e coluna (1-3)");
				sinal = 'O';
			}
			
			//Verificação de linha válida
			linhaValida = false;
			while(!linhaValida) {
				System.out.println("Informe a linha (1, 2 ou 3): ");
				linha = scan.nextInt() - 1;
				if(linha >=0 && linha<=2) {
					linhaValida = true;
				}else {
					System.out.println("Entrada inválida, tente novamente");
				}
			}
			
			//Verificação de coluna válida
			colunaValida = false;
			while(!colunaValida) {
				System.out.println("Informe a coluna (1, 2 ou 3): ");
				coluna = scan.nextInt() - 1;
				if(coluna >=0 && coluna<=2) {
					colunaValida = true;
				}else {
					System.out.println("Entrada inválida, tente novamente");
				}
			}
			
			//Verificação se a célula do jogo já está ocupada
			if(jogoVelha[linha][coluna]=='X' || jogoVelha[linha][coluna]=='O') {
				System.out.println("Posição inválida, tente novamente");
			}else { //Jogada válida
				jogoVelha[linha][coluna] = sinal;
				jogada++;
			}
			
			//Impressão de tabuleiro
			System.out.print("\n| ");
			for(int i=0; i<jogoVelha.length; i++) {
				for(int j=0; j<jogoVelha[i].length; j++) {
					System.out.print(jogoVelha[i][j] + " | ");
				}
				if(i<(jogoVelha.length-1)){
					System.out.print("\n| ");
				}else {
					System.out.println();
				}
			}
			
			//Verificação se há ganhador
			if((jogoVelha[0][0]=='X' && jogoVelha[0][1]=='X' && jogoVelha[0][2]=='X') || //Linha 1
					(jogoVelha[1][0]=='X' && jogoVelha[1][1]=='X' && jogoVelha[1][2]=='X') || //Linha 2
					(jogoVelha[2][0]=='X' && jogoVelha[2][1]=='X' && jogoVelha[2][2]=='X') || //Linha 3
					(jogoVelha[0][0]=='X' && jogoVelha[1][0]=='X' && jogoVelha[2][0]=='X') || //Coluna 1
					(jogoVelha[0][1]=='X' && jogoVelha[1][1]=='X' && jogoVelha[2][1]=='X') || //Coluna 2
					(jogoVelha[0][2]=='X' && jogoVelha[1][2]=='X' && jogoVelha[2][2]=='X') || //Coluna 1
					(jogoVelha[0][0]=='X' && jogoVelha[1][1]=='X' && jogoVelha[2][2]=='X') || //Diagonal 1
					(jogoVelha[0][2]=='X' && jogoVelha[1][1]=='X' && jogoVelha[2][0]=='X')) { //Diagonal 2
				ganhou = true;
				System.out.println("Parabéns! Jogador 1 ganhou!");
			}else if((jogoVelha[0][0]=='O' && jogoVelha[0][1]=='O' && jogoVelha[0][2]=='O') || //Linha 1
					(jogoVelha[1][0]=='O' && jogoVelha[1][1]=='O' && jogoVelha[1][2]=='O') || //Linha 2
					(jogoVelha[2][0]=='O' && jogoVelha[2][1]=='O' && jogoVelha[2][2]=='O') || //Linha 3
					(jogoVelha[0][0]=='O' && jogoVelha[1][0]=='O' && jogoVelha[2][0]=='O') || //Coluna 1
					(jogoVelha[0][1]=='O' && jogoVelha[1][1]=='O' && jogoVelha[2][1]=='O') || //Coluna 2
					(jogoVelha[0][2]=='O' && jogoVelha[1][2]=='O' && jogoVelha[2][2]=='O') || //Coluna 1
					(jogoVelha[0][0]=='O' && jogoVelha[1][1]=='O' && jogoVelha[2][2]=='O') || //Diagonal 1
					(jogoVelha[0][2]=='O' && jogoVelha[1][1]=='O' && jogoVelha[2][0]=='O')) { //Diagonal 2
				ganhou = true;
				System.out.println("Parabéns! Jogador 2 ganhou!");
			}else if(jogada>9){
				System.out.println("Deu velha! Ninguém ganhou!");
			}
			scan.close();
		}

	}
}
