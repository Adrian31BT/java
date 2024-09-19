package com.krakedev;

public class TestRectangulo {

	public static void main(String[] args) {
		Rectangulo r1 = new Rectangulo();
		Rectangulo r2 = new Rectangulo();
		Rectangulo p = new Rectangulo();
		
		int areaR1;
		r1.setBase(10);
		r1.setAltura(5);;
		areaR1 = r1.calcularArea();
		System.out.println("Area de r1: "+areaR1);
		
		int areaR2;
		r2.setBase(8);
		r2.setAltura(3);
		areaR2 = r2.calcularArea();
		System.out.println("Area de r2: "+areaR2);
		
		double perimetro;
		p.setBase(2);
		p.setAltura(8);
		perimetro = p.calcularPerimetro();
		System.out.println("Perimetro: "+perimetro);
	}

}
