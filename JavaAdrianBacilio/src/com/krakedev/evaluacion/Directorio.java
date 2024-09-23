package com.krakedev.evaluacion;

import java.util.ArrayList;
import java.util.Date;

public class Directorio {
	private ArrayList<Contacto> contactos;
	private Date fechaModificacion;
	
	
	
	public Directorio() {
		contactos = new ArrayList<Contacto>();
	}

	public boolean agregarContacto (Contacto contacto) {
		Contacto respuesta;
		respuesta = buscarPorCedula(contacto.getCedula());
		if(respuesta == null) {
			contactos.add(contacto);
			return true;
		}else {
			return false;
		}
		
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
	
}
