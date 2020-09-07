package com.cursojava.aula45;

public class Teste3 {

	public static void main(String[] args) {
		
		Pessoa pessoa = new Pessoa();
		Aluno aluno = new Aluno();
		Professor prof = new Professor();
		
		//InstanceOf verifica se é uma instância da classe
		if(pessoa instanceof Pessoa) {
			System.out.println("É do tipo Pessoa");
		}
		
		if(aluno instanceof Aluno) {
			System.out.println("É do tipo Aluno");
		}
		
		if(prof instanceof Professor) {
			System.out.println("É do tipo Professor");
		}

	}

}
