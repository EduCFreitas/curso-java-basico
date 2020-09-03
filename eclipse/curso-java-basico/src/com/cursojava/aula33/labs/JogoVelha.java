package com.cursojava.aula33.labs;

public class JogoVelha {

	private char[][] jogoVelha;
	private int jogada;
	
	
	public JogoVelha() {
		this.jogoVelha = new char[3][3];
		this.jogada = 1;
	}


	public char[][] getJogoVelha() {
		return jogoVelha;
	}


	public void setJogoVelha(char[][] jogoVelha) {
		this.jogoVelha = jogoVelha;
	}


	public int getJogada() {
		return jogada;
	}


	public void setJogada(int jogada) {
		this.jogada = jogada;
	}


	public boolean validarJogada(int linha, int coluna, char sinal) {
		//Verifica��o se a c�lula do jogo j� est� ocupada
		if(jogoVelha[linha][coluna]=='X' || jogoVelha[linha][coluna]=='O') {
			//System.out.println("Posi��o inv�lida, tente novamente");
			return false;
		}else { //Jogada v�lida
			jogoVelha[linha][coluna] = sinal;
			jogada++;
			return true;
		}
	}
	
	public void imprimirTabuleiro() {
		//Impress�o de tabuleiro
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
	
	public boolean verificarGanhador(char sinal) {
		//Verifica��o se h� ganhador
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
	
	public boolean vezJogador1() {
		if(jogada%2==1) {
			return true;
		}
		return false;
	}
	
	
}
