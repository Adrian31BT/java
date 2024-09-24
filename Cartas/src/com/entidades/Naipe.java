package com.entidades;

import java.util.ArrayList;

public class Naipe {
	private ArrayList<Numero> numerosPosibles;
	private ArrayList<Carta> cartas;
	
	public Naipe() {
		numerosPosibles = new ArrayList<Numero>();
		cartas = new ArrayList<Carta>();
		Palos p = new Palos();
		
		Numero n1 = new Numero("A",11);
		numerosPosibles.add(n1);
		Numero n2 = new Numero("2",2);
		numerosPosibles.add(n2);
		Numero n3 = new Numero("3",3);
		numerosPosibles.add(n3);
		Numero n4 = new Numero("4",4);
		numerosPosibles.add(n4);
		Numero n5 = new Numero("5",5);
		numerosPosibles.add(n5);
		Numero n6 = new Numero("6",6);
		numerosPosibles.add(n6);
		Numero n7 = new Numero("7",7);
		numerosPosibles.add(n7);
		Numero n8 = new Numero("8",8);
		numerosPosibles.add(n8);
		Numero n9 = new Numero("9",9);
		numerosPosibles.add(n9);
		Numero n10 = new Numero("10",10);
		numerosPosibles.add(n10);
		Numero n11 = new Numero("J",10);
		numerosPosibles.add(n11);
		Numero n12 = new Numero("Q",10);
		numerosPosibles.add(n12);
		Numero n13 = new Numero("K",10);
		numerosPosibles.add(n13);
		
		for(int i = 0; i < numerosPosibles.size(); i++) {
			
				Carta cc1 = new Carta(numerosPosibles.get(i),p.getCorazonRojo());
				Carta cc2 = new Carta(numerosPosibles.get(i),p.getCorazonNegro());
				Carta cc3 = new Carta(numerosPosibles.get(i),p.getDiamante());
				Carta cc4 = new Carta(numerosPosibles.get(i),p.getTrebol());
				
				cartas.add(cc1);
				cartas.add(cc2);
				cartas.add(cc3);
				cartas.add(cc4);
		}
	
	}
	
	public ArrayList<Carta> barajar(){
		ArrayList<Carta> auxiliar = new ArrayList<Carta>();
		int respuesta = 0;
		for(int i = 0; i < 99; i++){
			respuesta = Random.obtenerPosicion();
				if(cartas.get(respuesta).getEstado().equals("N")) {
					auxiliar.add(cartas.get(respuesta));
					cartas.get(respuesta).setEstado("C");
				}
		}
		for(int x = 0; x < cartas.size(); x++) {
			if(cartas.get(x).getEstado().equals("N")) {
				auxiliar.add(cartas.get(x));
				cartas.get(x).setEstado("C");
			}
		}
		
		return auxiliar;
	}
	
	
	public ArrayList<Carta> getCartas() {
		return cartas;
	}	
	
}
