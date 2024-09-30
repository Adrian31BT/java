package com.krakedev.excepciones;

public class Ejercicio1 {

	public static void main(String[] args) {
		System.out.println("Inicio");
		String a = null;
		
		try {
			System.out.println("Abre la conexion bdd");
			a.substring(3);
			System.out.println("Fin");
			
		}catch(Exception ex) {
			System.out.println("Entra al catch");
		}finally {
			System.out.println("Ingresa al finally");
			System.out.println("Cierra la conexion bdd");
		}
		System.out.println("Fuera del catch");
		
		
	}

}
