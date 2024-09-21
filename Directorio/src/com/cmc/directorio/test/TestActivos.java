package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminContactos;
import com.cmc.directorio.entidades.AdminTelefono;
import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestActivos {

	public static void main(String[] args) {
		
		Telefono telef = new Telefono("movi","0923137646",40);
		Contacto c = new Contacto("Adrian","Bacilio",telef, 72.4);
		AdminContactos au = new AdminContactos();
		
		System.out.println("**********EJEMPLO 1**********");
		c.imprimir();
		au.activarUsuario(c);
		System.out.println("*****Luego de invocar a activar usuario*****");
		c.imprimir();
		
		
		Telefono telef2 = new Telefono("movi","092345646",20);
		Contacto c2 = new Contacto("Jose","Alvares",telef2, 71.4);
		
		AdminTelefono at2 = new AdminTelefono();
		AdminContactos au2 = new AdminContactos();
		
		System.out.println("**********EJEMPLO 2**********");
		c2.imprimir();
		at2.activarMensajeria(telef2);
		au2.activarUsuario(c2);
		System.out.println("*****Luego de invocar a activar usuario*****");
		c2.imprimir();
	}

}
