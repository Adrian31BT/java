package com.krakedev.test;

import com.krakedev.composicion.Direccion;
import com.krakedev.composicion.Persona;

public class TestPersona {

	public static void main(String[] args) {
		
		Persona p1 = new Persona();
		p1.setNombre("Adrian");
		p1.setApellido("Bacilio");
		
		Direccion dir = new Direccion();
		dir.setCallePrincipal("Av siempre viva");
		dir.setCalleSecundaria("La que cruza");
		dir.setNumero("N-47");
		p1.setDireccion(dir);
		
		String nombre = p1.getNombre();
		Direccion d1 = p1.getDireccion();
		
		p1.imprimir();
		
		Persona p2 = new Persona();
		Direccion dir2 = new Direccion("Av Shyris", "Eloy Alfaro", "S/N");
		p2.setNombre("Juli");
		p2.setApellido("Cedeño");
		p2.setDireccion(dir2);
		p2.imprimir();
		
		Persona p3 = new Persona();
		p3.setDireccion(new Direccion("xx","yy","123"));
		p3.imprimir();
	}

}
