package com.cmc.evaluacion.servicios;

import com.cmc.evaluacion.entidades.Prestamo;

public class CalculadoraAmortizacion {
	public static double calcularCuota(Prestamo prestamo) {
		double cuota;
		double i;
		double dividendo;
		double divisor;
		
		i = (prestamo.getInteres()/12)/100;
		dividendo = prestamo.getMonto() * i;
		divisor = 1 - Math.pow((1+i), -(prestamo.getPlazo()));
		cuota = dividendo/divisor;
		
		return cuota;
	}
}
