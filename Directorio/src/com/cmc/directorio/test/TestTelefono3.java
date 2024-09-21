package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminTelefono;
import com.cmc.directorio.entidades.Telefono;

public class TestTelefono3 {

	public static void main(String[] args) {
		
		int contMovi;
		int contClaro;
		
		Telefono telf1 = new Telefono("movi","0999328123",40);
		Telefono telf2 = new Telefono("claro","0944344122",20);
		Telefono telf3 = new Telefono("movi","0999323433",10);
		Telefono telf4 = new Telefono("claro","0978984353",30);
		
		AdminTelefono atcm = new AdminTelefono();
		AdminTelefono atcl = new AdminTelefono();
		
		contMovi = atcm.contarMovi(telf1, telf2, telf3);
		contClaro = atcl.contarClaro(telf1, telf2, telf3, telf4);
		System.out.println("Numero de operadoras movi: "+contMovi);
		System.out.println("Numero de operadoras claro: "+contClaro);
	}

}
