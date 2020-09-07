package com.cursojava.aula43.labs.ex02;

public class Teste {

	public static void main(String[] args) {
		
		PessoaFisica p1 = new PessoaFisica();
		p1.setNome("Física 01");
		p1.setRendaBruta(1000);
		p1.setCpf("253.547.753-02");
		
		PessoaJuridica p2 = new PessoaJuridica();
		p2.setNome("Jurídica 01");
		p2.setRendaBruta(5000);
		p2.setCnpj("55.524.447/0001-51");
		
		PessoaFisica p3 = new PessoaFisica();
		p3.setNome("Física 02");
		p3.setRendaBruta(2000);
		p3.setCpf("734.373.999-93");
		
		PessoaJuridica p4 = new PessoaJuridica();
		p4.setNome("Jurídica 02");
		p4.setRendaBruta(3000);
		p4.setCnpj("40.168.534/0001-46");
		
		PessoaFisica p5 = new PessoaFisica();
		p5.setNome("Física 03");
		p5.setRendaBruta(3700);
		p5.setCpf("370.751.893-01");
		
		PessoaJuridica p6 = new PessoaJuridica();
		p6.setNome("Jurídica 03");
		p6.setRendaBruta(4000);
		p6.setCnpj("66.283.482/0001-42");
		
		Contribuinte[] contribuintes = new Contribuinte[6];
		contribuintes[0] = p1;
		contribuintes[1] = p2;
		contribuintes[2] = p3;
		contribuintes[3] = p4;
		contribuintes[4] = p5;
		contribuintes[5] = p6;
		
		for(Contribuinte c : contribuintes) {
			System.out.println(c);
		}

	}

}
