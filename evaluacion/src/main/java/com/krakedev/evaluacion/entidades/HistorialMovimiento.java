package com.krakedev.evaluacion.entidades;

import java.util.Date;

public class HistorialMovimiento {
	private int id;
	private Producto producto;
	private int cantidad;
	private Date fecha_movimiento;
	
	
	public HistorialMovimiento() {
		super();
	}
	public HistorialMovimiento(int id, Producto producto, int cantidad, Date fecha_movimiento) {
		super();
		this.id = id;
		this.producto = producto;
		this.cantidad = cantidad;
		this.fecha_movimiento = fecha_movimiento;
	}
	public int getSerial() {
		return id;
	}
	public void setSerial(int serial) {
		this.id = serial;
	}
	public Producto getProducto() {
		return producto;
	}
	public void setProducto(Producto producto) {
		this.producto = producto;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public Date getFecha_movimiento() {
		return fecha_movimiento;
	}
	public void setFecha_movimiento(Date fecha_movimiento) {
		this.fecha_movimiento = fecha_movimiento;
	}
	@Override
	public String toString() {
		return "HistorialMovimiento [id=" + id + ", producto=" + producto + ", cantidad=" + cantidad
				+ ", fecha_movimiento=" + fecha_movimiento + "]";
	}
	
	
	
}
