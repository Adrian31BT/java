package com.krakedev.evaluacion;

import java.util.ArrayList;

public class Contacto {
	private String cedula;
	private String nombre;
	private String apellido;
	private Direccion direccion;
	private ArrayList<Telefono> telefonos;
	
	public Contacto(String cedula, String nombre, String apellido) {
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
		telefonos = new ArrayList<Telefono>();
	}
	
	public void agregarTelefono(Telefono telefono) {
		telefonos.add(telefono);
	}
	
	public void mostrarTelefonos() {
		System.out.println("\nTelefonos con estados C:");
		for(int i=0; i<telefonos.size(); i++) {
			if(telefonos.get(i).getEstado().equals("C")) {
				System.out.println("Numero: "+telefonos.get(i).getNumero()+", Tipo: "+telefonos.get(i).getTipo());
			}
		}
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

	public ArrayList<Telefono> recuperarIncorrectos(){
		ArrayList<Telefono> telRecuperados = new ArrayList<Telefono>();
		for(int i = 0; i<telefonos.size(); i++) {
			if(telefonos.get(i).getEstado().equals("E")) {
				telRecuperados.add(telefonos.get(i));
			}
		}
		return telRecuperados;
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

	public ArrayList<Telefono> getTelefonos() {
		return telefonos;
	}

	public void setTelefonos(ArrayList<Telefono> telefonos) {
		this.telefonos = telefonos;
	}
	
}
