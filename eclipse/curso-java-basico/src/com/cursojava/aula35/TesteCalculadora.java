package com.cursojava.aula35;

public class TesteCalculadora {

	public static void main(String[] args) {
		
		int fatorialNR = Calculadora.fatorialNaoRecursivo(5);
		int fatorialR = Calculadora.fatorial(5);
		
		System.out.println(fatorialNR);
		System.out.println(fatorialR);

	}

}
