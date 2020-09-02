package com.cursojava.aula27.labs;


public class Ex02 {

	public static void main(String[] args) {
		
		ContaCorrente conta = new ContaCorrente();
		conta.numero = "123456";
		conta.agencia = "1234";
		conta.especial = true;
		conta.limiteEspecial = 500;
		conta.valorEspecialUsado = 0;
		conta.saldo = -10;
		boolean saqueEfetuado;
		
		System.out.println("Saldo da conta " + conta.numero + " = " + conta.saldo);
		
		saqueEfetuado = conta.realizarSaque(10);
		if(saqueEfetuado) {
			System.out.println("Saque efetuado com sucesso");
			conta.consultarSaldo();
		}else {
			System.out.println("N�o foi poss�vel realizar saque. Saldo insuficiente");
		}
		
		saqueEfetuado = conta.realizarSaque(500);
		if(saqueEfetuado) {
			System.out.println("Saque efetuado com sucesso");
			conta.consultarSaldo();
		}else {
			System.out.println("N�o foi poss�vel realizar saque. Saldo insuficiente");
		}
		
		System.out.println("Dep�sito de R$500,00");
		conta.depositar(500);
		conta.consultarSaldo();
		
		if(conta.verificarUsoChequeEspecial()) {
			System.out.println("Est� usando cheque especial");
		}else {
			System.out.println("N�o est� usando cheque especial");
		}
		
		conta.realizarSaque(600);
		conta.consultarSaldo();
		if(conta.verificarUsoChequeEspecial()) {
			System.out.println("Est� usando cheque especial");
		}else {
			System.out.println("N�o est� usando cheque especial");
		}
	}

}
