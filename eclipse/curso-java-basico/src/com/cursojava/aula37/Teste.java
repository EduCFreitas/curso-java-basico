package com.cursojava.aula37;

public class Teste {

	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		Professor professor = new Professor();
		Pessoa pessoa = new Pessoa();
		
		aluno.setNome("Maria");
		professor.setTelefoneCelular("11 99999-9999");
		
		//Nesse caso o objeto instanciado s� tem acesso aos atributos e m�todos da classe m�e (Pessoa)
		Pessoa aluno1 = new Aluno();
		Pessoa professor1 = new Professor();
		
		professor1.getCpf();

	}

}
