package com.krakedev.test;

import com.krakedev.Auto;

public class TestAuto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Auto auto1 = new Auto("Chevrolet", 2019, 13000.43);
		Auto auto2 = new Auto("Aveo", 2020, 12440.45);
		
		/**
		auto1.setMarca("Chevrolet");
		auto1.setAnio(2019);
		auto1.setPrecio(13000.43);
		
		auto2.setMarca("Aveo");
		auto2.setAnio(2020);
		auto2.setPrecio(12440.45);
		**/
		
		System.out.println("Auto 1------------------");
		System.out.println("Marca: "+auto1.getMarca());
		System.out.println("Año: "+auto1.getAnio());
		System.out.println("Precio: "+auto1.getPrecio());
		System.out.println("Auto 2------------------");
		System.out.println("Marca: "+auto2.getMarca());
		System.out.println("Año: "+auto2.getAnio());
		System.out.println("Precio: "+auto2.getPrecio());
		
	}

}
