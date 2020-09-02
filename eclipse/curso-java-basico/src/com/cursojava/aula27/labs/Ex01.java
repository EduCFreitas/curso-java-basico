package com.cursojava.aula27.labs;

public class Ex01 {

	public static void main(String[] args) {
		
		Lampada lampada = new Lampada();
		lampada.ligada = true;
		
		lampada.ligar();
		lampada.mostrarEstado();
		lampada.desligar();
		lampada.mostrarEstado();
		lampada.mudarEstado();
		lampada.mostrarEstado();
		lampada.mudarEstado();
		lampada.mostrarEstado();
	}

}
