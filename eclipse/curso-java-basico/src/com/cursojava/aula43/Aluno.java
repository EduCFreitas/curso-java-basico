package com.cursojava.aula43;

import java.util.Arrays;

public class Aluno{

	private String curso;
	private double[] notas;
	
	
	public Aluno() {
		super();
	}
	
	public Aluno(String nome, String endereco, String telefone, String curso) {
		//super(nome, endereco, telefone);
		this.curso = curso;
	}


	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public double[] getNotas() {
		return notas;
	}
	public void setNotas(double[] notas) {
		this.notas = notas;
	}
	
	public double calcularMedia() {
		return 0;
	}
	
	public boolean verificarAprovado() {
		return true;
	}
	
	
	public void metodoQualquer() {
		//super.setCpf("12345678901");
		//this.setCpf("12345678901");
	}
	
	public String obterEtiquetaEndereco() {
		String s;
		
		s = "Endereço do Aluno: " ;
		//s += this.getEndereco();
		return s;
	}

	//@Override
	public void imprimirEtiquetaEndereco() {
		System.out.println(this.obterEtiquetaEndereco());
	}

	/*public String toString() {
		String s;
		s = curso + "\n";
		for(double nota : notas) {
			s += nota + " ";
		}
		return s;
	}*/
	@Override
	public String toString() {
		return "Aluno [curso=" + curso + ", notas=" + Arrays.toString(notas) + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		
		Aluno other = (Aluno) obj;
		if(curso.equalsIgnoreCase(other.getCurso())) {
			return true;
		}
		return false;
	}
	
	
}
