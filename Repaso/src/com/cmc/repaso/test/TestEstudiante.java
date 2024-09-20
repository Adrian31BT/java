package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Estudiante;

public class TestEstudiante {

	public static void main(String[] args) {
		Estudiante est1 = new Estudiante("Adrian Bacilio");
		est1.calificar(7);
		System.out.println("---------Estudiantes---------");
		System.out.println("Nombre: "+est1.getNombre());
		System.out.println("Nota: "+est1.getNota());
		System.out.println("Resultado: "+est1.getResultado());
		
		Estudiante est2 = new Estudiante("Denise Perero");
		est2.calificar(9);
		System.out.println("---------Estudiantes---------");
		System.out.println("Nombre: "+est2.getNombre());
		System.out.println("Nota: "+est2.getNota());
		System.out.println("Resultado: "+est2.getResultado());
	}

}
