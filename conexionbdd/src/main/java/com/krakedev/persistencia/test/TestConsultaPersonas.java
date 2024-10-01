package com.krakedev.persistencia.test;

import java.util.ArrayList;

import com.krakedev.persistencia.entidades.Persona;
import com.krakedev.persistencia.servicios.AbmPersonas;


public class TestConsultaPersonas {

	public static void main(String[] args) {
		try {
			ArrayList<Persona> personas = AbmPersonas.buscarPorNombre("a");
			System.out.println(personas);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}	
	}
}
