package com.krakedev.servicios;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.krakedev.entidades.Cliente;
import com.krakedev.excepciones.KrakeDevException;
import com.krakedev.persistencia.ClientesBDD;

@Path("clientes")
public class ServicioClientes {
	
	@Path("m1")
	@GET
	public String saludar() {
		return "Hola mundo Rest Web Services";
	}
	
	@Path("mbuscar")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Cliente buscar() {
		Cliente cliente = new Cliente("0923138747","Adrian Bacilio");
		return cliente;
	}
	@Path("insertar")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response insertar(Cliente cliente) {
		System.out.println("INSERTANDO >>>"+ cliente);
		ClientesBDD cli = new ClientesBDD();
		try {
			cli.insertar(cliente);
			return Response.ok().build();
		} catch (KrakeDevException e) {
			e.printStackTrace();
			return Response.serverError().build();
		}
	}
	@Path("actualizar")
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	public Response actualizar(Cliente cliente) {
		System.out.println("ACTUALIZANDO >>>"+ cliente);
		ClientesBDD cli = new ClientesBDD();
		try {
			cli.actualizar(cliente);
			return Response.ok().build();
		} catch (KrakeDevException e) {
			e.printStackTrace();
			return Response.serverError().build();
		}
		
	}
}
