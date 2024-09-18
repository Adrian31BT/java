package com.krakedev;

public class TestCalaculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int resultadoSuma;
		Calculadora calcu1 = new Calculadora();
		resultadoSuma = calcu1.sumar(3, 4);
		System.out.println("Resultado suma: "+resultadoSuma);
		
		int resultadoRestar;
		Calculadora calcu2 = new Calculadora();
		resultadoRestar = calcu2.restar(3, 4);
		System.out.println("Resultado resta: "+resultadoRestar);
		
		double producto;
		Calculadora calcu3 = new Calculadora();
		producto = calcu3.multiplicar(8.2, 4);
		System.out.println("Resultado multiplicacion: "+producto);
		
		double cociente;
		Calculadora calcu4 = new Calculadora();
		cociente = calcu4.dividir(10, 4);
		System.out.println("Resultado division: "+cociente);
		
		double promedio;
		Calculadora calcu5 = new Calculadora();
		promedio = calcu5.promediar(10, 4, 5.6);
		System.out.println("Resultado promedio: "+promedio);
		
		Calculadora mensaje = new Calculadora();
		mensaje.mostrarResultado();
	}
}
