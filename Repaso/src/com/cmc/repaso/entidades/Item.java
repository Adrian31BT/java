package com.cmc.repaso.entidades;

public class Item {
	private String nombre;
	private int productosActuales;
	private int productosDevueltos;
	private int productosVendidos;
	
	public void imprimir() {
		System.out.println("Productos actuales: "+this.productosActuales);
		System.out.println("Productos devueltos: "+this.productosDevueltos);
		System.out.println("Productos vendidos: "+this.productosVendidos);
	}
	
	public void vender(int productosVendidos) {
		int productosAct = this.productosActuales;
		int productosVen = this.productosVendidos;
		this.productosActuales = productosAct - productosVendidos;
		this.productosVendidos = productosVen + productosVendidos;
	}
	
	public void devolver(int productosDevueltos) {
		
		int productosAct = this.productosActuales;
		int productosVen = this.productosVendidos;
		int productosDev = this.productosDevueltos;
		
		this.productosActuales = productosAct + productosDevueltos;
		this.productosVendidos = productosVen - productosDevueltos;
		this.productosDevueltos = productosDev + productosDevueltos;
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getProductosActuales() {
		return productosActuales;
	}

	public void setProductosActuales(int productosActuales) {
		this.productosActuales = productosActuales;
	}
	
	
}
