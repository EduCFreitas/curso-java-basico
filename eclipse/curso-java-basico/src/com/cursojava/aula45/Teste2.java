package com.cursojava.aula45;

public class Teste2 {

	public static void main(String[] args) {
		//Downcasting só funciona se estiver referenciando o próprio tipo em particular
		
		Object obj1 = obterString();
		String s1 = (String) obj1; //Downcasting
		
		Object obj2 = "Minha String";
		String s2 = (String) obj2; //Downcasting
		
		Object obj3 = new Object();
		String s3 = (String) obj3; //Downcasting falhando em tempo de execução
		
		Object obj4 = obterInteiro();
		String s4 = (String) obj4; //Downcasting falha em tempo de execução

	}
	
	public static String obterString() {
		return "minha String";
	}
	
	public static int obterInteiro() {
		return 1;
	}

}
