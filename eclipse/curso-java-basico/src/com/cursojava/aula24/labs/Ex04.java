package com.cursojava.aula24.labs;

import java.util.Date;

public class Ex04 {

	public static void main(String[] args) {
		
		LivroDeBiblioteca livro = new LivroDeBiblioteca();
		livro.nome = "War Of The Realms";
		livro.autor = "Stan Lee";
		livro.anoLancamento = 2019;
		livro.emprestado = true;
		livro.dataEntrega = new Date();
		livro.emprestadoA = "Eduardo";
		
		System.out.println("Nome do livro = " + livro.nome);
	}

}
