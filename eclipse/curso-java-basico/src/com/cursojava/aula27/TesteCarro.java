package com.cursojava.aula27;

public class TesteCarro {

	public static void main(String[] args) {
		
		Carro van = new Carro();
		van.marca = "Fiat";
		van.modelo = "Ducato";
		van.numPassageiros = 10;
		van.capCombustivel = 100;
		van.consumoCombustivel = 0.2;
		double autonomia;
		double qtdCombustivel10;
		double qtdCombustivel15;
		
		System.out.println(van.marca);
		System.out.println(van.modelo);
		
		autonomia = van.obterAutonomia();
		System.out.println("A autonomia do carro é: " + autonomia);
		System.out.println("A autonomia do carro é: " + van.obterAutonomia());
		
		qtdCombustivel10 = van.calcularCombustivel(10);
		qtdCombustivel15 = van.calcularCombustivel(15);
		System.out.println("qtdCombustivel10 = " + qtdCombustivel10);
		System.out.println("qtdCombustivel15 = " + qtdCombustivel15);

	}

}
