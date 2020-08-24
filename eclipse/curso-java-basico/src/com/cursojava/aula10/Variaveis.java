package com.cursojava.aula10;

public class Variaveis {

	public static void main(String[] args) {
		
		//Convenção Java
		int idade = 26;
		String nome = "Eduardo";
		String nomeDoMeuCachorro = "Nina";
		String ano2014;
		
		//É aceito mas não utilizado
		int _idade;
		int $idade;
		
		//Não é convemção Java
		String nome_do_meu_cachorro;
		String NomeDoMeuCachorro;
		String NomeDoMeucachorro;
		
		idade = 27;
		
		System.out.println("Idade: " + idade);
		System.out.println("Nome: " + nome);
		
		//Má prática
		int a = 10;
		String b = "José";
	}
}
