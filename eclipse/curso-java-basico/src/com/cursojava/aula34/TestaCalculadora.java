package com.cursojava.aula34;

public class TestaCalculadora {
	
	static int resultSoma;

	public static void main(String[] args) {
		
		//N�o h� a necessidade de instancia��o da classe, devido ao static
		resultSoma = MinhaCalculadora.soma(1, 2);
		soma2Valores(1, 2);

	}
	
	static int soma2Valores(int num1, int num2) {
		return MinhaCalculadora.soma(num1, num2);
	}

}
