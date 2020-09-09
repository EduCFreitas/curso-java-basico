package com.cursojava.aula52.labs;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Agenda agenda = new Agenda();
		int opcao = 1;
		
		while(opcao!=3) {
			opcao = obterOpcaoMenu(scan);
			
			if(opcao==1) { //Consutar contato
				consultarContato(scan, agenda);
			}else if(opcao==2) { //Adicionar contato
				adicionarContato(scan, agenda);
			}else if(opcao==3) { //Sair
				System.exit(0);
			}
		}

	}
	
	
	public static int obterOpcaoMenu(Scanner scan) {
		boolean entradaValida = false;
		int opcao = 3;
		
		while(!entradaValida){
			System.out.println("\nDigite a op��o desejada:");
			System.out.println("1: Consultar contato");
			System.out.println("2: Adicionar contato");
			System.out.println("3: Sair");
			
			try {
				String entrada = scan.nextLine();
				opcao = Integer.parseInt(entrada);
				
				if(opcao==1 || opcao==2 || opcao==3) {
					entradaValida = true;
				}else {
					throw new Exception("Entrada inv�lida!");
				}
			}
			catch(Exception e) {
				System.out.println("Entrada inv�lida! Digite novamente.\n");
			}
		}
		
		return opcao;
	}
	
	public static String lerInformacaoString(Scanner scan, String msg) {
		System.out.println(msg);
		String entrada = scan.nextLine();
		
		return entrada;
	}
	
	public static void consultarContato(Scanner scan, Agenda agenda) {
		String nomeContato = lerInformacaoString(scan, "Informe o nome do contato a ser pesquisado:");
		try {
			if(agenda.consultarContatoPorNome(nomeContato) >= 0) {
				System.out.println("Contato existente");
			}
		} catch (ContatoNaoExisteException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void adicionarContato(Scanner scan, Agenda agenda) {
		try {
			System.out.println("Criando um contato. Entre com as informa��es");
			String nome = lerInformacaoString(scan, "Informe o nome do contato:");
			String telefone = lerInformacaoString(scan, "Informe o telefone do contato:");
			String email = lerInformacaoString(scan, "Informe o email do contato:");
			
			Contato contato = new Contato();
			contato.setNome(nome);
			contato.setTelefone(telefone);
			contato.setEmail(email);
			
			System.out.println("Contato a ser criado:");
			System.out.println(contato);
			
			agenda.adicionarContato(contato);
		} catch (AgendaCheiaException e) {
			System.out.println(e.getMessage());
			System.out.println("Contatos da agenda:");
			System.out.println(agenda);
		}
	}

}
