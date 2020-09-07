package com.cursojava.aula43.labs.ex02;

public class PessoaJuridica extends Contribuinte {

	private String cnpj;

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	@Override
	public String toString() {
		return super.toString() + "; PessoaJuridica [cnpj=" + cnpj + "]; Imposto a ser pago: R$" + calcularImposto();
	}

	@Override
	public double calcularImposto() {
		return this.getRendaBruta()*0.1;
	}
	

}
