package com.krakedev.test;

import com.krakedev.Rectangulo;

public class TestRectangulo {

	public static void main(String[] args) {
		Rectangulo r1 = new Rectangulo(10, 5);
		Rectangulo r2 = new Rectangulo(8, 3);
		Rectangulo p = new Rectangulo(2, 8);
		
		int areaR1;
		areaR1 = r1.calcularArea();
		System.out.println("Area de r1: "+areaR1);
		
		int areaR2;
		areaR2 = r2.calcularArea();
		System.out.println("Area de r2: "+areaR2);
		
		double perimetro;
		perimetro = p.calcularPerimetro();
		System.out.println("Perimetro: "+perimetro);
	}

}
