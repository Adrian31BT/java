package com.krakedev.persistencia;

import java.sql.Connection;

import com.krakedev.entidades.Cliente;
import com.krakedev.utils.ConexionBDD;

public class ClientesBDD {
	
	public void insertar(Cliente cliente) {
		Connection con = ConexionBDD.obtenerConexion();
		if(con != null) {
			System.out.println("Conectado");
		}else {
			System.out.println("Error al obtener conexion");
		}
	}
}
