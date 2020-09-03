package com.cursojava.aula31;

public class Carro {

	//default -> visível apenas dentro do mesmo package
	//public -> visível de forma geral
	public String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	//private -> visível dentro da própria classe
	private double consumoCombustivel;
	
	public void exibirAutonomia() {
		System.out.println("A autonomia do carro é: " + (this.capCombustivel*this.consumoCombustivel) + "km");
	}
	
	public double obterAutonomia() {
		System.out.println("Método obterAutonomia foi chamado.");
		return this.capCombustivel*this.consumoCombustivel;
	}
	
	private double divideKmPorConsumoCombutivel(double km) {
		return km/this.consumoCombustivel;
	}
	
	public double calcularCombustivel(double km) {
		return this.divideKmPorConsumoCombutivel(km);
	}
}
