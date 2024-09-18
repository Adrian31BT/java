package com.krakedev;

public class TestAuto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Auto auto1 = new Auto();
		Auto auto2 = new Auto();
		
		auto1.marca = "Chevrolet";
		auto1.anio = 2019;
		auto1.precio = 13000.43;
		
		auto2.marca = "Aveo";
		auto2.anio = 2020;
		auto2.precio = 12440.45;
		
		
		System.out.println("Auto 1------------------");
		System.out.println("Marca: "+auto1.marca);
		System.out.println("Año: "+auto1.anio);
		System.out.println("Precio: "+auto1.precio);
		System.out.println("Auto 2------------------");
		System.out.println("Marca: "+auto2.marca);
		System.out.println("Año: "+auto2.anio);
		System.out.println("Precio: "+auto2.precio);
		
	}

}
