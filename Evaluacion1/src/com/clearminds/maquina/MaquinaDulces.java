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
		
		System.out.println("Saldo: "+saldo);
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
	
	public double consultarPrecio(String codCelda) {
		double precioEncontrado = 0;
		Celda celdaEncontrada = null;
		celdaEncontrada = buscarCelda(codCelda);
		if(celdaEncontrada != null) {
			precioEncontrado = celdaEncontrada.getProducto().getPrecio();
		}
		return precioEncontrado;
	}
	
	public Celda buscarCeldaProducto(String codProd) {
		Celda elementoCelda = null;
		for (int i = 0; i < celdas.size(); i++) {		
			if(celdas.get(i).getProducto() != null) {
				if(codProd.equals(celdas.get(i).getProducto().getCodigo())) {
					elementoCelda = celdas.get(i);
				}
			}
		}
		return elementoCelda;
	}
	
	public void incrementarProductos(String codProd, int cantidad) {
		Celda celdaEncontrada = buscarCeldaProducto(codProd);
		int stock = celdaEncontrada.getStock();
		celdaEncontrada.setStock(stock + cantidad);
	}
	
	public void vender(String codCelda) {
		Celda celdaEncontrada = null;
		int stock = 0;
		double precio = 0;
		
		celdaEncontrada = buscarCelda(codCelda);
		stock = celdaEncontrada.getStock();
		celdaEncontrada.setStock(stock - 1);
		precio = celdaEncontrada.getProducto().getPrecio();
		saldo = saldo + precio;
	}
	
	public double venderConCambio(String codCelda, double valor) {
		int stock = 0;
		double precio = 0;
		double vuelto = 0;
		
		Celda celdaEncontrada = null;
		celdaEncontrada = buscarCelda(codCelda);
		stock = celdaEncontrada.getStock();
		celdaEncontrada.setStock(stock - 1);
		precio = celdaEncontrada.getProducto().getPrecio();
		saldo = saldo + precio;
		vuelto = valor - precio;
		return vuelto;
	}
	
	public ArrayList<Producto> buscarMenores(double limite){
		Producto prod = null;
		ArrayList<Producto> productosM = new ArrayList<Producto>();
		for (int i = 0; i < celdas.size(); i++) {
			if(celdas.get(i).getProducto().getPrecio() <= limite) {
				prod = celdas.get(i).getProducto();
				productosM.add(prod);
			}
		}
		return productosM;
	}
}
