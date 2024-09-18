package com.krakedev;

public class Calculadora {
	public int sumar(int valor1, int valor2) {
		int resultado;
		resultado = valor1 + valor2;
		return resultado;
	}
	
	public int restar(int valor1, int valor2){
		int resultado;
		resultado = valor1 - valor2;
		return resultado;
	}
	
	public double multiplicar(double valor1, double valor2){
		double producto;
		producto = valor1 * valor2;
		return producto;
	}
	
	public double dividir(double dividendo, double divisor){
		double cociente;
		cociente = dividendo / divisor;
		return cociente;
	}
	
	
}
