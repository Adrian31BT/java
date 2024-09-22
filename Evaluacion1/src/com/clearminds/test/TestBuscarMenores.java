package com.clearminds.test;

import java.util.ArrayList;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;
import com.clearminds.maquina.MaquinaDulces;

public class TestBuscarMenores {

	public static void main(String[] args) {
		
		MaquinaDulces maquina=new MaquinaDulces();
		
		maquina.agregarCelda(new Celda("A1"));
		maquina.agregarCelda(new Celda("A2"));
		maquina.agregarCelda(new Celda("B1"));
		maquina.agregarCelda(new Celda("B2"));
		maquina.agregarCelda(new Celda("C1"));
		maquina.agregarCelda(new Celda("C2"));
		
		Producto productoA1=new Producto("KE34","Papitas",0.85);
		maquina.cargarProducto(productoA1, "A1", 4);
		Producto productoA2=new Producto("KE35","Doritos",0.84);
		maquina.cargarProducto(productoA2, "A2", 5);
		Producto productoB1=new Producto("KE36","Trident",0.25);
		maquina.cargarProducto(productoB1, "B1", 6);
		Producto productoB2=new Producto("KE37","Chito",0.15);
		maquina.cargarProducto(productoB2, "B2", 4);
		Producto productoC1=new Producto("KE38","Yogurt",0.70);
		maquina.cargarProducto(productoC1, "C1", 3);
		Producto productoC2=new Producto("KE38","Pepsi",1);
		maquina.cargarProducto(productoC2, "C2", 2);
		
		ArrayList<Producto> prodMenores = maquina.buscarMenores(0.70);
		System.out.println("Productos Menores: "+prodMenores.size());
		
		for(int i = 0; i < prodMenores.size(); i++) {
			System.out.println("Nombre: "+prodMenores.get(i).getNombre()+" Precio: "+prodMenores.get(i).getPrecio());
		}
	}

}
