package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminContactos;
import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestContactos2 {

	public static void main(String[] args) {
		
		Contacto contMasPesado;
		boolean comparacion;
		
		Telefono telef1 = new Telefono("claro","0923323336",20);
		Contacto c1 = new Contacto("Denise","Perero",telef1, 71.4);
		
		Telefono telef2 = new Telefono("movi","0924543546",10);
		Contacto c2 = new Contacto("Zaine","lopez",telef2, 70.4);
		
		AdminContactos mp = new AdminContactos();
		AdminContactos co = new AdminContactos();
		
		contMasPesado = mp.buscarMasPesado(c1, c2);
		comparacion = co.compararOperadoras(c1, c2);
		
		if(contMasPesado != null) {
			System.out.println("Contacto mas pesado: " + contMasPesado.getNombre()+" "+contMasPesado.getApellido());
		}else {
			System.out.println("Tienen mismo peso");
		}
		
		System.out.println("¿Son operadoras iguales?: " + comparacion);

	}

}
