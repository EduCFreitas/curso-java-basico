package com.cursojava.aula52.labs;

import java.util.Arrays;

public class Agenda {

	private Contato[] contatos;
	
	public Agenda() {
		contatos = new Contato[5];
	}
	
	

	public Contato[] getContatos() {
		return contatos;
	}



	@Override
	public String toString() {
		String s = "";
		for(Contato c : contatos) {
			if(c != null) {
				s += c.toString() + "\n";
			}
		}
		
		return s;
	}
	
	
	public void adicionarContato(Contato c) throws AgendaCheiaException {
		boolean cheia = true;
		
		for(int i=0; i<contatos.length; i++) {
			if(contatos[i] == null) {
				contatos[i] = c;
				cheia = false;
				break;
			}
		}
		
		if(cheia) {
			//Lan�ar exception de agenda cheia
			throw new AgendaCheiaException();
		}
	}
	
	public int consultarContatoPorNome(String nome) throws ContatoNaoExisteException {
		for(int i=0; i<contatos.length; i++) {
			if(contatos[i] != null) {
				if(contatos[i].getNome().equalsIgnoreCase(nome)) {
					return i;
				}
			}
		}
		
		//Lan�ar exception de contato n�o existente
		throw new ContatoNaoExisteException(nome);
	}
	
	
}
