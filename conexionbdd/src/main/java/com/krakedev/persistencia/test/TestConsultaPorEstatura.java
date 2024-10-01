package com.krakedev.persistencia.test;

import java.util.ArrayList;

import com.krakedev.persistencia.entidades.Persona;
import com.krakedev.persistencia.servicios.AbmPersonas;

public class TestConsultaPorEstatura {

	public static void main(String[] args) {
		try {
			ArrayList<Persona> persona = AbmPersonas.buscarPorEstatura(1.50);
			System.out.println(persona);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
}
