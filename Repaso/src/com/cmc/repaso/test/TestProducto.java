package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Producto;

public class TestProducto {

	public static void main(String[] args) {
		
		Producto pro1 = new Producto("Infinix note 40 PRO",270);
		double precioDescuento;
		
		pro1.setPrecio(-270);
		System.out.println("********PRODUCTO********");
		System.out.println("Nombre: "+pro1.getNombre());
		System.out.println("Precio: "+pro1.getPrecio());
		
		precioDescuento = pro1.calcularPrecioPromo(20);
		System.out.println("--------Descuento--------");
		System.out.println("Total: "+precioDescuento);
	}

}
