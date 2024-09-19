package com.krakedev;

public class TestRectangulo {

	public static void main(String[] args) {
		Rectangulo r1 = new Rectangulo();
		Rectangulo r2 = new Rectangulo();
		Rectangulo p = new Rectangulo();
		
		int areaR1;
		r1.base = 10;
		r1.altura = 5;
		areaR1 = r1.calcularArea();
		System.out.println("Area de r1: "+areaR1);
		
		int areaR2;
		r2.base = 8;
		r2.altura = 3;
		areaR2 = r2.calcularArea();
		System.out.println("Area de r2: "+areaR2);
		
		double perimetro;
		p.base = 2;
		p.altura = 8;
		perimetro = p.calcularPerimetro();
		System.out.println("Perimetro: "+perimetro);
	
	}

}
