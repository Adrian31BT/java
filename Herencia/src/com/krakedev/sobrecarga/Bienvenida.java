package com.krakedev.sobrecarga;

public class Bienvenida {
	public void saludar(String nombre) {
		System.out.print("Hola "+nombre);
	}
	
	
	public void saludar(String nombre, String apellido) {
		System.out.print("Hola "+nombre+" "+apellido);
	}
}
