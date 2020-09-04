package com.cursojava.aula36.labs;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Agenda agenda = new Agenda();
		Contato[] contatos = new Contato[3];
		String nome;
		String telefone;
		String email;
		
		System.out.println("Informe o nome da agenda:");
		nome = scan.nextLine();
		agenda.setNome(nome);
		
		for(int i=0; i<3; i++) {
			System.out.println("\nEntre com as informações do contato " + (i+1));
			Contato c = new Contato();
			
			System.out.println("Informe o nome do contato:");
			nome = scan.nextLine();
			c.setNome(nome);
			
			System.out.println("Informe o telefone do contato:");
			telefone = scan.nextLine();
			c.setTelefone(telefone);
			
			System.out.println("Informe o email do contato");
			email = scan.nextLine();
			c.setEmail(email);
			
			contatos[i] = c;
		}
		agenda.setContatos(contatos);
		
		if(agenda!=null) {
			System.out.println(agenda.obterInfo());
		}
		scan.close();

	}

}
