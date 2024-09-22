package com.krakedev.evaluacion;

public class Contacto {
	private String cedula;
	private String nombre;
	private String apellido;
	private Direccion direccion;
	
	public Contacto(String cedula, String nombre, String apellido) {
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
	}
	
	public void imprimir() {
		System.out.println("\nInformacion del Contacto:");
		System.out.println("Cedula: "+cedula);
		System.out.println("Nombre: "+nombre);
		System.out.println("Apellido: "+apellido);
		System.out.println("Direccion: ");
		if(direccion != null) {
			System.out.println("Calle Principal: "+direccion.getCallePrincipal());
			System.out.println("Calle Secundaria: "+direccion.getCalleSecundaria());
		}else {
			System.out.println("No tiene asociada una direccion");
		}
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

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}
	
}
