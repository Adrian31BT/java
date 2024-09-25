package com.cmc.evaluacion.servicios;

import java.util.ArrayList;

import com.cmc.evaluacion.entidades.Cliente;
import com.cmc.evaluacion.entidades.Prestamo;

public class Banco {
	private ArrayList<Cliente> clientes;
	
	
	public Banco() {
		clientes = new ArrayList<Cliente>();
		
	}

	public void registrarCliente(Cliente cliente) {
		Cliente respuesta;
		respuesta = buscarcliente(cliente.getCedula());
		if(respuesta ==  null) {
			clientes.add(cliente);
		}else {
			System.out.println("Cliente ya existe: "+cliente.getCedula());
		}
	}
	
	public void asignarPrestamo(String cedula, Prestamo prestamo) {
		Cliente respuesta;
		respuesta = buscarcliente(cedula);
		if(respuesta!=null) {
			respuesta.getPestamos().add(prestamo);
		}else {
			System.out.println("Cliente no es del banco ");
		}
	}
	
	
	public ArrayList<Prestamo> buscarPrestamos(String cedula) {
		ArrayList<Prestamo> respuestaP = new ArrayList<Prestamo>();	
		Cliente respuesta;
		respuesta = buscarcliente(cedula);
		respuestaP = respuesta.getPestamos();
		return respuestaP;
	}
	
	public Cliente buscarcliente(String cedula) {
		Cliente clienteEncontrado = null;
		if(clientes.size() != 0) {
			for(int i=0; i<clientes.size(); i++){
				if(cedula.equals(clientes.get(i).getCedula())) {
					clienteEncontrado = clientes.get(i);
					break;
				}
			}
		}
		
		return clienteEncontrado;
	}
	
	public ArrayList<Cliente> getClientes() {
		return clientes;
	}
	public void setClientes(ArrayList<Cliente> clientes) {
		this.clientes = clientes;
	}
	
	
}
