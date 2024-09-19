package com.krakedev;

public class TestProducto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Producto productoA = new Producto();
		Producto productoB = new Producto();
		Producto productoC = new Producto();
		
		productoA.setNombre("Paracetamol");
		productoA.setDescripcion("500mg");
		productoA.setPrecio(5.00);
		productoA.setStockActual(10);
		
		productoB.setNombre("Ibuprofeno");
		productoB.setDescripcion("200mg");
		productoB.setPrecio(7.00);
		productoB.setStockActual(20);
		
		productoC.setNombre("Loratadina");
		productoC.setDescripcion("10mg");
		productoC.setPrecio(10.00);
		productoC.setStockActual(30);
		
		System.out.println("Producto A ------------------");
		System.out.println("Nombre: "+productoA.getNombre());
		System.out.println("Descripcion: "+productoA.getDescripcion());
		System.out.println("Precio: "+productoA.getPrecio());
		System.out.println("Stock Actual: "+productoA.getStockActual());
		System.out.println("Producto B ------------------");
		System.out.println("Nombre: "+productoB.getNombre());
		System.out.println("Descripcion: "+productoB.getDescripcion());
		System.out.println("Precio: "+productoB.getPrecio());
		System.out.println("Stock Actual: "+productoB.getStockActual());
		System.out.println("Producto B ------------------");
		System.out.println("Nombre: "+productoC.getNombre());
		System.out.println("Descripcion: "+productoC.getDescripcion());
		System.out.println("Precio: "+productoC.getPrecio());
		System.out.println("Stock Actual: "+productoC.getStockActual());
		
	}

}
