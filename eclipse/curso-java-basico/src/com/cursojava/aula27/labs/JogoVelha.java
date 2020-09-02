package com.cursojava.aula27.labs;

public class JogoVelha {

	char[][] jogoVelha = new char[3][3];
	int jogada = 1;
	
	boolean validarJogada(int linha, int coluna, char sinal) {
		//Verificação se a célula do jogo já está ocupada
		if(jogoVelha[linha][coluna]=='X' || jogoVelha[linha][coluna]=='O') {
			//System.out.println("Posição inválida, tente novamente");
			return false;
		}else { //Jogada válida
			jogoVelha[linha][coluna] = sinal;
			jogada++;
			return true;
		}
	}
	
	void imprimirTabuleiro() {
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
	}
	
	boolean verificarGanhador(char sinal) {
		//Verificação se há ganhador
		if((jogoVelha[0][0]==sinal && jogoVelha[0][1]==sinal && jogoVelha[0][2]==sinal) || //Linha 1
				(jogoVelha[1][0]==sinal && jogoVelha[1][1]==sinal && jogoVelha[1][2]==sinal) || //Linha 2
				(jogoVelha[2][0]==sinal && jogoVelha[2][1]==sinal && jogoVelha[2][2]==sinal) || //Linha 3
				(jogoVelha[0][0]==sinal && jogoVelha[1][0]==sinal && jogoVelha[2][0]==sinal) || //Coluna 1
				(jogoVelha[0][1]==sinal && jogoVelha[1][1]==sinal && jogoVelha[2][1]==sinal) || //Coluna 2
				(jogoVelha[0][2]==sinal && jogoVelha[1][2]==sinal && jogoVelha[2][2]==sinal) || //Coluna 1
				(jogoVelha[0][0]==sinal && jogoVelha[1][1]==sinal && jogoVelha[2][2]==sinal) || //Diagonal 1
				(jogoVelha[0][2]==sinal && jogoVelha[1][1]==sinal && jogoVelha[2][0]==sinal)) { //Diagonal 2
			return true;
		}
		return false;
	}
	
	boolean vezJogador1() {
		if(jogada%2==1) {
			return true;
		}
		return false;
	}
	
	
}
