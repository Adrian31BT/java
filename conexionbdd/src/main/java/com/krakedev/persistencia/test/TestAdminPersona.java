package com.krakedev.persistencia.test;

import java.math.BigDecimal;
import java.util.Date;

import com.krakedev.persistencia.entidades.EstadoCivil;
import com.krakedev.persistencia.entidades.Persona;
import com.krakedev.persistencia.servicios.AdminPersonas;
import com.krakedev.persistencia.util.Convertidor;

public class TestAdminPersona {

	public static void main(String[] args) {
		EstadoCivil ec  = new EstadoCivil("S", "Soltero");
		Persona p = new Persona("0230918223","Mariengelis","Hernandez",ec);
		try {
			Date fechaNac = Convertidor.convertirFecha("2001/12/08");
			Date horaNac = Convertidor.convertirHora("12:12");
			p.setFecha_nacimiento(fechaNac);
			p.setHora_nacimiento(horaNac);
			p.setEstatura(1.64);
			p.setCantidad_ahorrada(new BigDecimal(2000.5));
			p.setNumero_hijos(3);
			AdminPersonas.insertar(p);
		} catch (Exception e) {
			System.out.println("Error en el sistema: "+ e.getMessage());
		}
	}

}
