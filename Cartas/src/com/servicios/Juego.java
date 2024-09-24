package com.servicios;

import java.util.ArrayList;

import com.entidades.Carta;
import com.entidades.Naipe;

public class Juego {
	private Naipe naipe;
	private ArrayList<ArrayList<Carta>> cartasJugadores;
	private ArrayList<Carta> naipeBarajado;
	

	public Juego(ArrayList<String> idsJugadores) {
		cartasJugadores = new ArrayList<ArrayList<Carta>>();
		naipeBarajado = new ArrayList<Carta>();
		
		naipe = new Naipe();
		naipeBarajado = naipe.barajar();
		
		for(int i = 0; i < idsJugadores.size(); i++) {
			ArrayList<Carta> cartas = new ArrayList<Carta>();	
			cartasJugadores.add(cartas);
		}
		
	}
	
	public int devolverTotal(int idJugador) {
		int acum = 0;
		for(int i = 0; i < cartasJugadores.size(); i++) {
			if(i == idJugador) {
				for(int j = 0; j < cartasJugadores.get(i).size(); j++) {
					acum = acum + cartasJugadores.get(i).get(j).getNumero().getValor();
				}
			}
		}
		return acum;
	}
	
	
	public void entregarCartas(int cartasPorJugador) {
		int cont = 0;
	
		int totalCartasRepartir = 0;
		totalCartasRepartir = cartasPorJugador*cartasJugadores.size();
		
		for (int i = 0; i < totalCartasRepartir; i++) {
			if(cont != cartasJugadores.size()) {
				cartasJugadores.get(cont).add(naipeBarajado.get(i));
				cont = cont + 1;
			}else {
				cont = 0;
			}
			
		}
	}

	public String determinarGanador() {
		String idGanador = "1";
		int sumaGanador = devolverTotal(0);
		int numeroDeJugadores = cartasJugadores.size();
		
		for(int i=0; i<numeroDeJugadores; i++) {
			if(devolverTotal(i) >= sumaGanador) {
				idGanador = Integer.toString(i+1);
			}
			sumaGanador = devolverTotal(i);
		}
		return idGanador;
	}
	
	public ArrayList<ArrayList<Carta>> getCartasJugadores() {
		return cartasJugadores;
	}


}
