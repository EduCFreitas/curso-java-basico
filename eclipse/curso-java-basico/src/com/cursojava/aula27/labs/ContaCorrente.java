package com.cursojava.aula27.labs;

public class ContaCorrente {

	String numero;
	String agencia;
	boolean especial;
	double limiteEspecial;
	double valorEspecialUsado;
	double saldo;
	
	boolean realizarSaque(double quantiaASacar) {
		double limite;
		
		//Há saldo na conta
		if(saldo>=quantiaASacar) {
			saldo -= quantiaASacar;
			return true;
		}else { //Sem saldo na conta
			if(especial) {
				limite = limiteEspecial + saldo;
				if(limite>= quantiaASacar) {
					saldo -= quantiaASacar;
					return true;
				}else {
					return false;
				}
			}else {
				return false; //Não é especial e sem saldo suficiente
			}
		}
	}
	
	void depositar(double valorDepositado) {
		saldo += valorDepositado;
	}
	
	void consultarSaldo() {
		System.out.println("Saldo atual da conta = R$" + saldo);
	}
	
	boolean verificarUsoChequeEspecial() {
		return saldo<0;
	}
}
