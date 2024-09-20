package com.krakedev.demo.test;

import com.krakedev.demo.Producto;

public class TestProducto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Producto productoA = new Producto(12345, "Arroz");
		
		productoA.setDescripcion("Conejo");
		productoA.setPeso(2.5);
		
		System.out.println("------------PRODUCTO------------");
		System.out.println("Codigo :"+productoA.getCodigo());
		System.out.println("Nombre :"+productoA.getNombre());
		System.out.println("Descripcion :"+productoA.getDescripcion());
		System.out.println("Peso (lb):"+productoA.getPeso());
	}

}
