package com.cmc.evaluacion.entidades;

import com.cmc.evaluacion.servicios.Utilitario;

public class Cuota {
	private int numero;
	private double cuota;
	private double capital;
	private double inicio;
	private double interes;
	private double abonoCapital;
	private double saldo;
	
	public Cuota(int numero) {
		this.numero = numero;
	}
	
	public void mostrarPrestamo() {
		System.out.println(numero+"\t|"+cuota+"|"+inicio+"\t|"+interes+"\t\t|"+abonoCapital+"\t\t|"+saldo);
	}
	
	public double getCuota() {
		return cuota;
	}
	public void setCuota(double cuota) {
		Utilitario redondear = new Utilitario();
		cuota = redondear.redondear(cuota);
		this.cuota = cuota;
	}
	public double getCapital() {
		return capital;
	}
	public void setCapital(double capital) {
		Utilitario redondear = new Utilitario();
		capital = redondear.redondear(capital);
		this.capital = capital;
	}
	public double getInicio() {
		return inicio;
	}
	public void setInicio(double inicio) {
		Utilitario redondear = new Utilitario();
		inicio = redondear.redondear(inicio);
		this.inicio = inicio;
	}
	public double getInteres() {
		return interes;
	}
	public void setInteres(double interes) {
		Utilitario redondear = new Utilitario();
		interes = redondear.redondear(interes);
		this.interes = interes;
	}
	public double getAbonoCapital() {
		return abonoCapital;
	}
	public void setAbonoCapital(double abonoCapital) {
		Utilitario redondear = new Utilitario();
		abonoCapital = redondear.redondear(abonoCapital);
		this.abonoCapital = abonoCapital;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		Utilitario redondear = new Utilitario();
		saldo = redondear.redondear(saldo);
		this.saldo = saldo;
	}
	
}
