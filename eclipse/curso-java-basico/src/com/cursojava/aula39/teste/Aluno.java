package com.cursojava.aula39.teste;

import com.cursojava.aula39.Pessoa;

public class Aluno extends Pessoa{

	private String curso;
	private double[] notas;
	
	
	public Aluno() {
		super();
	}
	
	public Aluno(String nome, String endereco, String telefone, String curso) {
		super(nome, endereco, telefone);
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
		//Palavra super acessa atributos e métodos da classe super
		super.setCpf("12345678901");
		this.setCpf("12345678901");
	}
	
	public void verificarAcesso() {
		this.nomeVisibilidade = "qq";
		super.nomeVisibilidade = "qq";
		this.setNomeVisibilidade("qq");
	}
}
