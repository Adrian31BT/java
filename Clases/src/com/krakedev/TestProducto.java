package com.krakedev;

public class TestProducto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Producto productoA = new Producto();
		Producto productoB = new Producto();
		Producto productoC = new Producto();
		
		productoA.nombre = "Paracetamol ";
		productoA.descripcion = "500mg ";
		productoA.precio = 5.00;
		productoA.stockActual = 10;
		
		productoB.nombre = "Ibuprofeno  ";
		productoB.descripcion = "200mg ";
		productoB.precio = 7.00;
		productoB.stockActual = 20;
		
		productoC.nombre = "Loratadina ";
		productoC.descripcion = "10mg ";
		productoC.precio = 10.00;
		productoC.stockActual = 30;
		
		System.out.println("Producto A ------------------");
		System.out.println("Nombre: "+productoA.nombre);
		System.out.println("Descripcion: "+productoA.descripcion);
		System.out.println("Precio: "+productoA.precio);
		System.out.println("Stock Actual: "+productoA.stockActual);
		System.out.println("Producto B ------------------");
		System.out.println("Nombre: "+productoB.nombre);
		System.out.println("Descripcion: "+productoB.descripcion);
		System.out.println("Precio: "+productoB.precio);
		System.out.println("Stock Actual: "+productoB.stockActual);
		System.out.println("Producto B ------------------");
		System.out.println("Nombre: "+productoC.nombre);
		System.out.println("Descripcion: "+productoC.descripcion);
		System.out.println("Precio: "+productoC.precio);
		System.out.println("Stock Actual: "+productoC.stockActual);
		
	}

}
