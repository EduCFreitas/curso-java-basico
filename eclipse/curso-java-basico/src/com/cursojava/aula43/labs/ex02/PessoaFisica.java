package com.cursojava.aula43.labs.ex02;

public class PessoaFisica extends Contribuinte {

	private String cpf;

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	@Override
	public String toString() {
		return super.toString() + "; PessoaFisica [cpf=" + cpf + "]; Imposto a ser pago: R$" + calcularImposto();
	}

	@Override
	public double calcularImposto() {
		double renda = this.getRendaBruta();
		
		if(renda<=1400) {
			return 0;
		}else if(renda<=2100) {
			return (renda*0.1)-100;
		}else if(renda<=2800) {
			return (renda*0.15)-270;
		}else if(renda<=3600) {
			return (renda*0.25)-500;
		}
		
		return (renda*0.3)-700;
	}
	
	
}
