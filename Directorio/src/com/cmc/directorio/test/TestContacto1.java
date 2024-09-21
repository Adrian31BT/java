package com.cmc.directorio.test;

import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestContacto1 {

	public static void main(String[] args) {
		
		Telefono telef = new Telefono("movi","0923137646",40);
		Contacto c = new Contacto("Adrian","Bacilio",telef, 72.4);
		
		c.imprimir();
		
		
	}

}
