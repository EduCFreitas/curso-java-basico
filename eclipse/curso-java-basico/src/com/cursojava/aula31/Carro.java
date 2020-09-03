package com.cursojava.aula31;

public class Carro {

	//default -> vis�vel apenas dentro do mesmo package
	//public -> vis�vel de forma geral
	public String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	//private -> vis�vel dentro da pr�pria classe
	private double consumoCombustivel;
	
	public void exibirAutonomia() {
		System.out.println("A autonomia do carro �: " + (this.capCombustivel*this.consumoCombustivel) + "km");
	}
	
	public double obterAutonomia() {
		System.out.println("M�todo obterAutonomia foi chamado.");
		return this.capCombustivel*this.consumoCombustivel;
	}
	
	private double divideKmPorConsumoCombutivel(double km) {
		return km/this.consumoCombustivel;
	}
	
	public double calcularCombustivel(double km) {
		return this.divideKmPorConsumoCombutivel(km);
	}
}
