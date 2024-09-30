package com.krakedev.persistencia.test;

import java.math.BigDecimal;
import java.util.Date;

import com.krakedev.persistencia.entidades.EstadoCivil;
import com.krakedev.persistencia.entidades.Persona;
import com.krakedev.persistencia.servicios.AbmPersonas;
//import com.krakedev.persistencia.servicios.AdminPersonas;
import com.krakedev.persistencia.util.Convertidor;

public class TestAdminPersona {

	public static void main(String[] args) {
		EstadoCivil ec  = new EstadoCivil("S", "Soltero");
		Persona p = new Persona("0992323132","Denise","Perero",ec);
		try {
			Date fechaNac = Convertidor.convertirFecha("1997/03/03");
			Date horaNac = Convertidor.convertirHora("14:12");
			p.setFecha_nacimiento(fechaNac);
			p.setHora_nacimiento(horaNac);
			p.setEstatura(1.56);
			p.setCantidad_ahorrada(new BigDecimal(3000.56));
			p.setNumero_hijos(0);
			//AdminPersonas.insertar(p);
			AbmPersonas.insertar(p);
		} catch (Exception e) {
			System.out.println("Error en el sistema: "+ e.getMessage());
		}
	}

}
