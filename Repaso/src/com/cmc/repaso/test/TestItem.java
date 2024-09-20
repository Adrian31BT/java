package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Item;

public class TestItem {

	public static void main(String[] args) {
		
		Item item1 = new Item();
		item1.setNombre("Celulares");
		item1.setProductosActuales(20);
		System.out.println("*********Valores Iniciales*********");
		System.out.println("Nombre de producto: "+item1.getNombre());
		item1.imprimir();
		item1.vender(5);
		item1.devolver(2);
		System.out.println("-----------Valores Nuevos----------");
		item1.imprimir();
		
		Item item2 = new Item();
		item2.setNombre("Laptops");
		item2.setProductosActuales(30);
		System.out.println("*********Valores Iniciales*********");
		System.out.println("Nombre de producto: "+item2.getNombre());
		item2.imprimir();
		item2.vender(10);
		item2.devolver(5);
		System.out.println("-----------Valores Nuevos----------");
		item2.imprimir();

	}

}
