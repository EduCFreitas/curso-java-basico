package com.cursojava.aula43.labs.ex03;

public class Peixe extends Animal {
	
	private String caracteristicas;

	public Peixe() {
		super();
		this.setPatas(0);
		this.setAmbiente("Mar");
		this.setCor("Cinzenta");
		this.caracteristicas = "Barbatanas e cauda";
	}
	

	public String getCaracteristicas() {
		return caracteristicas;
	}

	public void setCaracteristicas(String caracteristicas) {
		this.caracteristicas = caracteristicas;
	}


	@Override
	public String toString() {
		String s = super.toString();
		s += "\nCaracterísticas: " + caracteristicas;
		return s;
	}
	
	
	
	
}
