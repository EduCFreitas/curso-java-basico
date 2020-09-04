package com.cursojava.aula36.labs;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String nome;
		String horario;
		Curso curso = new Curso();
		String nomeProf;
		String depProf;
		String emailProf;
		Professor professor = new Professor();
		String nomeAluno;
		String matAluno;
		Aluno[] alunos = new Aluno[5];
		
		
		System.out.println("Informe o nome do curso:");
		nome = scan.nextLine();
		
		System.out.println("Informe o horário do curso:");
		horario = scan.nextLine();
		
		System.out.println("Informe o nome do professor:");
		nomeProf = scan.nextLine();
		
		System.out.println("Informe o departamento do professor:");
		depProf = scan.nextLine();
		
		System.out.println("Informe o email do professor:");
		emailProf = scan.nextLine();
		
		curso.setNome(nome);
		curso.setHorario(horario);
		
		professor.setNome(nomeProf);
		professor.setDepartamento(depProf);
		professor.setEmail(emailProf);
		
		curso.setProfessor(professor);
		
		System.out.println("\n-----Alunos-----");
		
		for(int i=0; i<5; i++) {
			scan.nextLine();
			System.out.println("Informe o nome do aluno " + (i+1));
			nomeAluno = scan.nextLine();
			
			System.out.println("Informe a matrícula do aluno " + (i+1));
			matAluno = scan.nextLine();
			
			double[] notas = new double[4];
			
			for(int j=0; j<4; j++) {
				System.out.println("Informe a nota " + (j+1));
				notas[j] = scan.nextDouble();
			}
			
			Aluno aluno = new Aluno();
			aluno.setNome(nomeAluno);
			aluno.setMatricula(matAluno);
			aluno.setNotas(notas);
			
			alunos[i] = aluno;
			
		}
		
		curso.setAlunos(alunos);
		
		System.out.println(curso.obterInfo());

		scan.close();
	}

}
