package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Validacion;

public class TestValidacion {

	public static void main(String[] args) {
		Validacion prueba = new Validacion();
		boolean respuesta1 = prueba.validarMonto(0);
		boolean respuesta2 = prueba.validarMonto(10);
		System.out.println(respuesta1);
		System.out.println(respuesta2);
	}

}
