package com.krakedev.persistencia.test;

import com.krakedev.persistencia.servicios.AbmPersonas;
//import com.krakedev.persistencia.servicios.AdminPersonas;

public class TestEliminar {

	public static void main(String[] args) {
		try {
			AbmPersonas.eliminar("0992323132");
		} catch (Exception e) {
			System.out.println("Error en el sistema: " + e.getMessage());
		}

	}

}
