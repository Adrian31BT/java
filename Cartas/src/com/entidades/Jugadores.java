package com.entidades;

import java.util.ArrayList;

import com.servicios.Juego;

public class Jugadores {
	private ArrayList<String> jugadores;

	public void jugar() {
		ArrayList<String> jugadores = new ArrayList<String>();
		Juego jugador = new Juego(jugadores);
		jugador.entregarCartas(5);
		
		for(int i = 0; i < jugadores.size(); i++) {
			System.out.println("Numero de jugador: "+(i+1));
		}
		
		System.out.println("Total jugadores: "+jugadores.size());
		
		
	}

	public ArrayList<String> getJugadores() {
		return jugadores;
	}

	public void setJugadores(ArrayList<String> jugadores) {
		this.jugadores = jugadores;
	}
	
	
	
	
}
