package com.krakedev.evaluacion;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Directorio {
	private ArrayList<Contacto> contactos;
	private Date fechaModificacion;
	
	
	
	public Directorio() {
		contactos = new ArrayList<Contacto>();
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
}
