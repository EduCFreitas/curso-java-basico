package com.cursojava.aula24.labs;

public class Ex03 {

	public static void main(String[] args) {
		
		LivroDeLivraria livro = new LivroDeLivraria();
		livro.nome = "War Of The Realms";
		livro.autor = "Stan Lee";
		livro.anoLancamento = 2019;
		livro.preco = 55.89;
		
		System.out.println("Nome do livro = " + livro.nome);
	}

}
