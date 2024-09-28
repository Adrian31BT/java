package com.krakedev.estaticos.ejercicio.test;

import java.util.ArrayList;

import com.krakedev.estaticos.ejercicio.entidades.Alarma;
import com.krakedev.estaticos.ejercicio.logica.AdminAlarmas;
import com.krakedev.estaticos.ejercicio.utils.DiasSemana;

public class TestAlarmas {

	public static void main(String[] args) {
		
		DiasSemana ds = new DiasSemana();
		
		Alarma a0 = new Alarma(ds.LUNES, 7, 15);
		Alarma a1 = new Alarma(ds.MARTES, 7, 5);
		Alarma a2 = new Alarma(ds.MIERCOLES, 7, 05);
		Alarma a3 = new Alarma(ds.JUEVES, 7, 30);
		Alarma a4 = new Alarma(ds.VIERNES, 7, 30);
		Alarma a5 = new Alarma(ds.SABADO, 9, 30);
		Alarma a6 = new Alarma(ds.DOMINGO, 10, 30);
		
		AdminAlarmas admA = new AdminAlarmas();
		admA.agregarAlarma(a0);
		admA.agregarAlarma(a1);
		admA.agregarAlarma(a2);
		admA.agregarAlarma(a3);
		admA.agregarAlarma(a4);
		admA.agregarAlarma(a5);
		admA.agregarAlarma(a6);
		
		ArrayList<Alarma> alarmasActuales = admA.getAlarmas();
		System.out.println(alarmasActuales);		
	}

}
