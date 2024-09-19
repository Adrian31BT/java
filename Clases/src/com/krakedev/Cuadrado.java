package com.krakedev;

public class Cuadrado {
	public double lado;
	
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
