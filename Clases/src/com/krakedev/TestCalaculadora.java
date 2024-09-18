package com.krakedev;

public class TestCalaculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int resultadoSuma;
		Calculadora calcu1 = new Calculadora();
		resultadoSuma = calcu1.sumar(3, 4);
		System.out.println("Resultado: "+resultadoSuma);
		
		int resultadoRestar;
		Calculadora calcu2 = new Calculadora();
		resultadoRestar = calcu2.restar(3, 4);
		System.out.println("Resultado: "+resultadoRestar);
	}
}
