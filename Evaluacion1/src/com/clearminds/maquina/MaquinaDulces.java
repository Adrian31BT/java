package com.clearminds.maquina;

import java.util.ArrayList;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;

public class MaquinaDulces {
	private ArrayList<Celda> celdas;
	private double saldo;

	public MaquinaDulces() {
		celdas = new ArrayList<Celda>();
	}

	public void agregarCelda(Celda celda) {
		celdas.add(celda);
	}

	public void mostrarConfiguracion() {
		for (int i = 0; i < celdas.size(); i++) {
			System.out.println("Celda1: " + celdas.get(i).getCodigo());
		}
	}

	public Celda buscarCelda(String codCelda) {
		Celda elementoCelda = null;
		for (int i = 0; i < celdas.size(); i++) {
			if (codCelda.equals(celdas.get(i).getCodigo())) {
				elementoCelda = celdas.get(i);
			}
		}
		return elementoCelda;
	}

	public void cargarProducto(Producto producto, String codCelda, int cantidad) {
		Celda celdaRecuperada;
		celdaRecuperada = buscarCelda(codCelda);
		celdaRecuperada.ingresarProducto(producto, cantidad);
	}

	public void mostrarProductos() {
		for (int i = 0; i < celdas.size(); i++) {
			if(celdas.get(i).getProducto() != null) {
				System.out.println("Celda:" + celdas.get(i).getCodigo() + " Stock:" + celdas.get(i).getStock()
						+ " Producto:" + celdas.get(i).getProducto().getNombre() + " Precio:"
						+ celdas.get(i).getProducto().getPrecio());
			}else {
				System.out.println("Celda:" + celdas.get(i).getCodigo() + " Stock:" + celdas.get(i).getStock()
						+ " Sin producto asignado");
			}
		}
	}
	
	public Producto buscarProductoEnCelda(String codCelda) {
		Producto elementoProducto = null;
		Celda celdaEncontrada = null;
		celdaEncontrada = buscarCelda(codCelda);
		if(celdaEncontrada != null) {
			elementoProducto = celdaEncontrada.getProducto();
		}
		return elementoProducto;
	}
}
