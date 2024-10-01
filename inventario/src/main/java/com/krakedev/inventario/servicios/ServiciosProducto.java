package com.krakedev.inventario.servicios;

import java.util.ArrayList;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.krakedev.inventario.entidades.Categoria;
import com.krakedev.inventario.entidades.Producto;

@Path("productos")
public class ServiciosProducto {
	
	@Path("insertar")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public void insertar(Producto producto) {
		System.out.println("Insertando: "+producto);
	}
	
	@Path("actualizar")
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	public void actualizar(Producto producto) {
		System.out.println("Actualizando: "+producto);
	}
	
	@Path("recuperar")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public ArrayList<Producto> recuperarTodos() {
		
		ArrayList<Producto> productos = new ArrayList<Producto>();
		
		Categoria c1 = new Categoria(1,"Ropa");
		Categoria c2 = new Categoria(2,"Accesorio");
		
		Producto p1 = new Producto("001", "Camisa blanca", c1, 20, 20);
		Producto p2 = new Producto("002", "Pantalon negro", c1, 30.4, 10);
		Producto p3 = new Producto("003", "Gorra W", c2, 21, 15);
		
		productos.add(p1);
		productos.add(p2);
		productos.add(p3);
		
		return productos;
		
	}
}
