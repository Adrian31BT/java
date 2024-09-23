package com.entidades;


public class Random {
	public static int obtenerPosicion() {
		int menor = 0;
	    int mayor = 51;
	    
	    int numero = (int)Math.floor(Math.random()*(mayor-menor+1)+menor);
	    
	    return numero;
	}
}


