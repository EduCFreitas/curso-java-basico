package com.cursojava.aula34.labs;

public class ConversaoDeUnidadesDeArea {

	public static double converterMetroQuadradoParaPeQuadrado(double area) {
		return area*10.76;
	}
	
	public static double converterPeQuadradoParaCentimetroQuadrado(double area) {
		return area*929;
	}
	
	public static double converterMilhaQuadradaParaAcre(double area) {
		return area*640;
	}
	
	public static double converterAcreParaPeQuadrado(double area) {
		return area*43560;
	}
}
