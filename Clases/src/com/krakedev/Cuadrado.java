package com.krakedev;

public class Cuadrado {
	private double lado;
	
	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	public double calcularArea(){
		double areaCuadrado;
		areaCuadrado = Math.pow(lado, 2);
		return areaCuadrado;
	}
	
	public double calcularPerimetro(){
		double perimetroCuadrado;
		perimetroCuadrado = lado * 4;
		return perimetroCuadrado;
	}
}
