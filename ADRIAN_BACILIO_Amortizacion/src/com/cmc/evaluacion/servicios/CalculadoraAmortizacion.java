package com.cmc.evaluacion.servicios;

import com.cmc.evaluacion.entidades.Cuota;
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
	
	public static void generarTabla(Prestamo prestamo) {
		double cuota = calcularCuota(prestamo);
		for(int i=1; i<=prestamo.getPlazo(); i++) {
			Cuota objCuota = new Cuota(i);
			objCuota.setCuota(cuota);
			prestamo.getCuotas().add(objCuota);
		}
		
		prestamo.getCuotas().get(0).setInicio(prestamo.getMonto());
		
		for(int j=0; j<prestamo.getPlazo(); j++) {
			if(j != (prestamo.getPlazo() - 1)) {
				calcularValoresCuota(prestamo.getInteres(),prestamo.getCuotas().get(j), prestamo.getCuotas().get(j+1));
			}else {
				calcularValoresCuota(prestamo.getInteres(),prestamo.getCuotas().get(j), null);
			}
				
				
		}
	}
	
	public static void calcularValoresCuota(double interes, Cuota cuota, Cuota sigCuota) {
		double i;
		double intereses;
		double abono;
		double saldo;
		
		i = (interes/12)/100;
		intereses = cuota.getInicio() * i;
		cuota.setInteres(intereses);
		
		abono = cuota.getCuota() - intereses;
		cuota.setAbonoCapital(abono);
		
		saldo = cuota.getInicio() - abono;
		cuota.setSaldo(saldo);
		
		if(sigCuota != null) {
			sigCuota.setInicio(saldo);
		}else {
			cuota.setCuota(cuota.getCuota() + saldo);
			abono = cuota.getCuota() - intereses;
			cuota.setAbonoCapital(abono);
			saldo = cuota.getInicio() - abono;
			cuota.setSaldo(saldo);
		}
		
	}

	public static void mostrarTabla(Prestamo prestamo) {
		System.out.println("Numero\t|Cuota |Inicio\t|Interes\t|Abono\t\t|Saldo");
		for(int i = 0; i<prestamo.getCuotas().size(); i++) {
			prestamo.getCuotas().get(i).mostrarPrestamo();
		}
	}
}
