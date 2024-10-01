package com.krakedev.persistencia.test;

import com.krakedev.persistencia.entidades.Persona;
import com.krakedev.persistencia.servicios.AbmPersonas;

public class TestConsultaPorCedula {
	
	public static void main(String[] args) {
		try {
			Persona persona = AbmPersonas.buscarPorCedula("0992323132");
			System.out.println(persona);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
	
}
