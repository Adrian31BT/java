package com.krakedev.estaticos.ejercicio.utils;

public class Util {
	public static String formatearHora(int numero) {
		int cont = 0;
		String valor = "";
		
		//valida si el numero de cifras es 1 se coloca el 0 en frente y si tiene mas de 1 digito no agrega el 0
		if(numero == 0) {
			cont = 1;
		}else {
			//cuenta el numero de cifras
			for(int i = Math.abs(numero); i > 0; i/= 10){
				cont++;
			} 
		}	
		
		if(cont < 2) {
			valor  = "0" + numero;	
		}else {
			valor = ""+numero;
		}
		return valor;
	}
	
	public static String formatearDia(int numero) {
		String dia = "";
		switch (numero){
			case 0:
				dia = "Lunes";
				break;
			case 1:
				dia = "Martes";
				break;
			case 2:
				dia = "Miercoles";
				break;
			case 3:
				dia = "Jueves";
				break;
			case 4:
				dia = "Viernes";
				break;
			case 5:
				dia = "Sabado";
				break;
			case 6:
				dia = "Domingo";
				break;	
		}
		return dia;
	}
}
