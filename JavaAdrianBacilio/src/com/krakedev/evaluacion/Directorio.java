package com.krakedev.evaluacion;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Directorio {
	private ArrayList<Contacto> contactos;
	private Date fechaModificacion;
	private ArrayList<Contacto> correctos;
	private ArrayList<Contacto> incorrectos;
	
	public Directorio() {
		contactos = new ArrayList<Contacto>();
		correctos = new ArrayList<Contacto>();
		incorrectos = new ArrayList<Contacto>();
		fechaModificacion = new Date();
	}

	public boolean agregarContacto (Contacto contacto) {
		Contacto respuesta;
		respuesta = buscarPorCedula(contacto.getCedula());
		if(respuesta == null) {
			contactos.add(contacto);
			fechaModificacion = Directorio.this.fechaModificacion;
			return true;
		}else {
			return false;
		}
	}
	
	public String consultarUltimaModificacion() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		String fechaComoCadena = sdf.format(fechaModificacion);
		return fechaComoCadena;
	}
	
	public Contacto buscarPorCedula(String cedula) {
		Contacto conEncontrado = null;
		for(int i=0; i<contactos.size(); i++) {
			if(cedula.equals(contactos.get(i).getCedula())) {
				conEncontrado = contactos.get(i);
			}
		}
		return conEncontrado;
	}
	
	public int contarPerdidos() {
		int cont = 0;
		for(int i=0; i<contactos.size(); i++) {
			if(contactos.get(i).getDireccion() == null) {
				cont = cont + 1;
			}
		}
		return cont;
	}
	
	public int contarFijos() {
		int cont = 0;
		for(int i=0; i<contactos.size(); i++) {		
			for(int j=0; j<contactos.get(i).getTelefonos().size(); j++) {
				if(contactos.get(i).getTelefonos().get(j).getEstado().equals("C") && contactos.get(i).getTelefonos().get(j).getTipo().equals("Convencional")) {
					cont = cont+ 1;
				}
			}
		}
		return cont;
	}
	
	public void depurar() {

		for(int i=0; i<contactos.size(); i++) {
			if(contactos.get(i).getDireccion() == null) {
				incorrectos.add(contactos.get(i));
			}else {
				correctos.add(contactos.get(i));
			}
		}
		
		contactos.clear();
	}

	public ArrayList<Contacto> getContactos() {
		return contactos;
	}

	public ArrayList<Contacto> getCorrectos() {
		return correctos;
	}

	public ArrayList<Contacto> getIncorrectos() {
		return incorrectos;
	}	
	
}
