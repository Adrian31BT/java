package com.krakedev.persistencia.test;

import com.krakedev.persistencia.servicios.AdminPersonas;

public class TestEliminar {

	public static void main(String[] args) {
		try {
			AdminPersonas.eliminar("0230918223");
		} catch (Exception e) {
			System.out.println("Error en el sistema: "+ e.getMessage());
		}

	}

}
