package com.cursojava.aula36;

public class Teste {

	public static void main(String[] args) {
		
		Contato contato = new Contato();
		contato.setNome("Eduardo");
		//contato.setEndereco("Rua Teste");
		//contato.setTelefone("11 99999-9999");
		
		//Relacionamento tem-um endereço
		Endereco end = new Endereco();
		end.setNomeRua("Rua Teste");
		end.setNumero("11A");
		end.setComplemento("-");
		end.setCidade("São Paulo");
		end.setEstado("SP");
		end.setCep("00000000");
		contato.setEndereco(end);
		
		//Relacionamento tem-muitos telefones
		Telefone telefone = new Telefone();
		telefone.setTipo("celular");
		telefone.setDdd("11");
		telefone.setNumero("99999-9999");
		
		Telefone telefone2 = new Telefone();
		telefone2.setTipo("casa");
		telefone2.setDdd("11");
		telefone2.setNumero("3333-9999");
		
		Telefone[] telefones = new Telefone[2];
		telefones[0] = telefone;
		telefones[1] = telefone2;
		
		//contato.setTelefone(telefone);
		contato.setTelefones(telefones);
		
		System.out.println(contato.getNome());

		//Validação para evitar exception de Contato e/ou Endereco nulos
		if(contato!=null && contato.getEndereco()!=null) {
			System.out.println(contato.getEndereco().getCidade());
		}
		
		//Validação para evitar exception de Contato e/ou Telefone nulos
		/*if(contato!=null && contato.getTelefone()!=null) {
			System.out.println(contato.getTelefone().getDdd() + " " + contato.getTelefone().getNumero());
		}*/
		if(contato!=null && contato.getTelefones()!=null) {
			for(Telefone t : contato.getTelefones()) {
				System.out.println(t.getDdd() + " " + t.getNumero());
			}
		}
	}

}
