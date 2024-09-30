package com.krakedev.persistencia.entidades;

import java.math.BigDecimal;
import java.util.Date;

public class Persona {
	private String cedula;
	private String nombre;
	private String apellido;
	private double estatura;
	private Date fecha_nacimiento;
	private Date hora_nacimiento;
	private BigDecimal cantidad_ahorrada;
	private int numero_hijos;
	private EstadoCivil estado_civil_codigo;

	public Persona() {
	}

	public Persona(String cedula, String nombre, String apellido, double estatura, Date fecha_nacimiento,
			Date hora_nacimiento, BigDecimal cantidad_ahorrada, int numero_hijos, EstadoCivil estado_civil_codigo) {
		super();
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
		this.estatura = estatura;
		this.fecha_nacimiento = fecha_nacimiento;
		this.hora_nacimiento = hora_nacimiento;
		this.cantidad_ahorrada = cantidad_ahorrada;
		this.numero_hijos = numero_hijos;
		this.estado_civil_codigo = estado_civil_codigo;
	}

	public Persona(String cedula, String nombre, String apellido, EstadoCivil estado_civil_codigo) {
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
		this.estado_civil_codigo = estado_civil_codigo;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public double getEstatura() {
		return estatura;
	}

	public void setEstatura(double estatura) {
		this.estatura = estatura;
	}

	public Date getFecha_nacimiento() {
		return fecha_nacimiento;
	}

	public void setFecha_nacimiento(Date fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}

	public Date getHora_nacimiento() {
		return hora_nacimiento;
	}

	public void setHora_nacimiento(Date hora_nacimiento) {
		this.hora_nacimiento = hora_nacimiento;
	}

	public BigDecimal getCantidad_ahorrada() {
		return cantidad_ahorrada;
	}

	public void setCantidad_ahorrada(BigDecimal cantidad_ahorrada) {
		this.cantidad_ahorrada = cantidad_ahorrada;
	}

	public EstadoCivil getEstado_civil_codigo() {
		return estado_civil_codigo;
	}

	public int getNumero_hijos() {
		return numero_hijos;
	}

	public void setNumero_hijos(int numero_hijos) {
		this.numero_hijos = numero_hijos;
	}

	public void setEstado_civil_codigo(EstadoCivil estado_civil_codigo) {
		this.estado_civil_codigo = estado_civil_codigo;
	}

	@Override
	public String toString() {
		return "Persona [cedula=" + cedula + ", nombre=" + nombre + ", apellido=" + apellido + ", estatura=" + estatura
				+ ", fecha_nacimiento=" + fecha_nacimiento + ", hora_nacimiento=" + hora_nacimiento
				+ ", cantidad_ahorrada=" + cantidad_ahorrada + ", numero_hijos=" + numero_hijos
				+ ", estado_civil_codigo=" + estado_civil_codigo + "]";
	}

}
