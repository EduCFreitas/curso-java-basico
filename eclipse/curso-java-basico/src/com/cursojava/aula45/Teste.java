package com.cursojava.aula45;

public class Teste {

	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		Pessoa pessoaAluno = aluno; //Upcasting
		
		Pessoa aluno2 = (Pessoa) new Aluno(); //Upcasting usando conversão
		
		Pessoa aluno3 = new Pessoa();
		Aluno aluno4 = (Aluno) aluno3; //Downcasting
		//Erro devido à superclasse Pessoa não conseguir ser rebaixada para a subclasse Aluno

	}

}
