package com.cmc.evaluacion.servicios;

public class Utilitario {
	public double redondear(double valor) {
		double valorRedondeado;
		valorRedondeado = Math.round(valor * 100.0)/100.0;
		return valorRedondeado;
	}
}
