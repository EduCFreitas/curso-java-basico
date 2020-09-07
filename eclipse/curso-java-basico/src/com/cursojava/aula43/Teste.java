package com.cursojava.aula43;

public class Teste {

	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		double[] notas = {10, 9, 8, 7};
		String s1 = "sbdjhbd";
		String s2 = "sbdjhbd";
		
		aluno.setCurso("Ciência da Computação");
		aluno.setNotas(notas);
		
		System.out.println(aluno);
		
		System.out.println(s1.equals(s2));
		
		
		Aluno aluno2 = new Aluno();
		double[] notas2 = {9, 8, 7, 6};
		aluno2.setCurso("Ciência da Computação");
		aluno2.setNotas(notas2);
		
		System.out.println(aluno.equals(aluno2));
	}

}
