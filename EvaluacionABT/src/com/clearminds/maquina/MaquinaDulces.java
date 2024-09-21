package com.clearminds.maquina;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;

public class MaquinaDulces {
	private Celda celda1;
	private Celda celda2;
	private Celda celda3;
	private Celda celda4;
	private double saldo;
	

	public void configurarMaquina(String cod1, String cod2, String cod3, String cod4) {
		Celda celda1 = new Celda(cod1);
		this.celda1 = celda1;
		Celda celda2 = new Celda(cod2);
		this.celda2 = celda2;
		Celda celda3 = new Celda(cod3);
		this.celda3 = celda3;
		Celda celda4 = new Celda(cod4);
		this.celda4 = celda4;
	}
	
	public void mostrarConfiguracion() {
		System.out.println("--------Codigo de celdas--------");
		System.out.println("Celda 1: "+celda1.getCodigo());
		System.out.println("Celda 2: "+celda2.getCodigo());
		System.out.println("Celda 3: "+celda3.getCodigo());
		System.out.println("Celda 4: "+celda4.getCodigo());
	}
	
	public Celda buscarCelda(String codigo) {
		if(celda1.getCodigo() == codigo) {
			return celda1;
		}else if(celda2.getCodigo() == codigo) {
			return celda2;
		}else if(celda3.getCodigo() == codigo) {
			return celda3;
		}else if(celda4.getCodigo() == codigo) {
			return celda4;
		}else {
			return null;
		}
	}
	
	public void cargarProducto(Producto producto, String codigo, int cantidad) {
		Celda celdaRecuperada = buscarCelda(codigo);
		celdaRecuperada.ingresarProducto(producto, cantidad);
	}
	
	public void mostrarProductos() {
		System.out.println("--------Celda "+celda1.getCodigo());
		System.out.println("Stock: "+celda1.getStock());
		if(celda1.getProducto() != null) {
			System.out.println("Nombre Producto: "+celda1.getProducto().getNombre());
			System.out.println("Precio Producto: "+celda1.getProducto().getPrecio());
			System.out.println("Codigo Producto: "+celda1.getProducto().getCodigo());
		}else {
			System.out.println("La celda no tiene producto");
		}
		
		System.out.println("--------Celda "+celda2.getCodigo());
		System.out.println("Stock: "+celda2.getStock());
		if(celda2.getProducto() != null) {
			System.out.println("Nombre Producto: "+celda2.getProducto().getNombre());
			System.out.println("Precio Producto: "+celda2.getProducto().getPrecio());
			System.out.println("Codigo Producto: "+celda2.getProducto().getCodigo());
		}else {
			System.out.println("La celda no tiene producto");
		}
		
		System.out.println("--------Celda "+celda3.getCodigo());
		System.out.println("Stock: "+celda3.getStock());
		if(celda3.getProducto() != null) {
			System.out.println("Nombre Producto: "+celda3.getProducto().getNombre());
			System.out.println("Precio Producto: "+celda3.getProducto().getPrecio());
			System.out.println("Codigo Producto: "+celda3.getProducto().getCodigo());
		}else {
			System.out.println("La celda no tiene producto");
		}
		
		System.out.println("--------Celda "+celda4.getCodigo());
		System.out.println("Stock: "+celda4.getStock());
		if(celda4.getProducto() != null) {
			System.out.println("Nombre Producto: "+celda4.getProducto().getNombre());
			System.out.println("Precio Producto: "+celda4.getProducto().getPrecio());
			System.out.println("Codigo Producto: "+celda4.getProducto().getCodigo());
		}else {
			System.out.println("La celda no tiene producto");
		}
		System.out.println("____________________________");
		System.out.println("Saldo: "+saldo);
	}
	
	public Producto buscarProductoEnCelda(String codigoC) {
		Celda buscar = buscarCelda(codigoC);
		return buscar.getProducto();
	}
	
	
	public double consultarPrecio(String codigoC) {
		Celda buscar = buscarCelda(codigoC);
		return buscar.getProducto().getPrecio();
	}
	
	public Celda buscarCeldaProducto(String codigoP) {

		Celda celda = null;
		if(celda1.getProducto() != null) {
			if(celda1.getProducto().getCodigo() == codigoP) {
				celda = celda1;
			}
		}else {
			if(celda2.getProducto() != null) {
				if(celda2.getProducto().getCodigo() == codigoP) {
					celda = celda2;
				}
			}else {
				if(celda3.getProducto() != null) {
					if(celda3.getProducto().getCodigo() == codigoP) {
						celda = celda3;
					}
				}else {
					if(celda4.getProducto() != null) {
						if(celda4.getProducto().getCodigo() == codigoP) {
							celda = celda4;
						}
					}
				}
				
			}
			
		}
		
		return celda;
	}
	
	public void incrementarProductos(String codigo, int item) {
		int stock;
		Celda celdaEncontrada = buscarCeldaProducto(codigo);
		stock = celdaEncontrada.getStock();
		celdaEncontrada.setStock(item + stock);
	}
	
	public void vender(String codigoC) {
		int item = 0;
		double precio = 0;
		Celda buscar = buscarCelda(codigoC);
		item = buscar.getStock();
		buscar.setStock(item - 1);
		precio = buscar.getProducto().getPrecio();	
		saldo = saldo + precio;
	}
	
	public double venderConCambio(String codigoC, double valor) {
		int item = 0;
		double precio = 0;
		double vuelto = 0;
		
		Celda buscar = buscarCelda(codigoC);
		item = buscar.getStock();
		buscar.setStock(item - 1);
		precio = buscar.getProducto().getPrecio();
		saldo = saldo + precio;
		
		vuelto = valor - precio;
		
		return vuelto;
	}

	public Celda getCelda1() {
		return celda1;
	}

	public void setCelda1(Celda celda1) {
		this.celda1 = celda1;
	}

	public Celda getCelda2() {
		return celda2;
	}

	public void setCelda2(Celda celda2) {
		this.celda2 = celda2;
	}

	public Celda getCelda3() {
		return celda3;
	}

	public void setCelda3(Celda celda3) {
		this.celda3 = celda3;
	}

	public Celda getCelda4() {
		return celda4;
	}

	public void setCelda4(Celda celda4) {
		this.celda4 = celda4;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	
	
}
