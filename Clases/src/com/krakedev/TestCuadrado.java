package com.krakedev;

public class TestCuadrado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cuadrado c1 = new Cuadrado();
		Cuadrado c2 = new Cuadrado();
		Cuadrado c3 = new Cuadrado();
		
		c1.lado = 2;
		c2.lado = 4;
		c3.lado = 6;
		
		double areaC1;
		double perimetroC1;
		areaC1 = c1.calcularArea();
		perimetroC1 = c1.calcularPerimetro();
		System.out.println("Cuadrado 1----------------------------");
		System.out.println("Area de cuadrado 1: "+areaC1);
		System.out.println("Perimetro de cuadrado 1: "+perimetroC1);
		
		double areaC2;
		double perimetroC2;
		areaC2 = c2.calcularArea();
		perimetroC2 = c2.calcularPerimetro();
		System.out.println("Cuadrado 2----------------------------");
		System.out.println("Area de cuadrado 2: "+areaC2);
		System.out.println("Perimetro de cuadrado 2: "+perimetroC2);
		
		double areaC3;
		double perimetroC3;
		areaC3 = c3.calcularArea();
		perimetroC3 = c3.calcularPerimetro();
		System.out.println("Cuadrado 3----------------------------");
		System.out.println("Area de cuadrado 3: "+areaC3);
		System.out.println("Perimetro de cuadrado3: "+perimetroC3);
	}

}
