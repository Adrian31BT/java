package com.krakedev.colecciones;

import java.util.ArrayList;

public class TestAdminPersonas {

	public static void main(String[] args) {
		AdminPersonas admin = new AdminPersonas();
		admin.agregar(new Persona("Adrian","Bacilio",50));
		admin.agregar(new Persona("Julio","Torres",30));
		admin.agregar(new Persona("Mario","Bacilio",25));
		
		admin.imprimir();
		Persona pb1 = admin.buscarPorNombre("Julio");
		if(pb1!=null) {
			System.out.println("Encontrado: "+pb1.getNombre()+" - "+pb1.getEdad());
		}else {
			System.out.println("Persona no encontrada");
		}
		
		ArrayList<Persona> personasMayores = admin.buscarMayores(25);
		System.out.println("Mayores: "+personasMayores.size());
	}

}
