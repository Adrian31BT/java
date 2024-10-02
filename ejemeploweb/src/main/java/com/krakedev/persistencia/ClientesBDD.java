package com.krakedev.persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.krakedev.entidades.Cliente;
import com.krakedev.excepciones.KrakeDevException;
import com.krakedev.utils.ConexionBDD;

public class ClientesBDD {
	
	public void insertar(Cliente cliente) throws KrakeDevException{
		Connection con = null; 
		try {
			con = ConexionBDD.obtenerConexion();
			PreparedStatement ps = con.prepareStatement("insert into clientes(cedula, nombre, numerohijos) values (?,?,?)");
			ps.setString(1, cliente.getCedula());
			ps.setString(2, cliente.getNombre());
			ps.setInt(3, cliente.getNumeroHijos());
			ps.executeUpdate();
		} catch (SQLException e) {
			throw new KrakeDevException("Error al insertar cliente, detalle: "+e.getMessage());
		} catch (KrakeDevException e) {
			throw e;
		} finally{
			if(con != null){
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	public void actualizar(Cliente cliente) throws KrakeDevException{
		Connection con = null; 
		try {
			con = ConexionBDD.obtenerConexion();
			PreparedStatement ps = con.prepareStatement("update clientes set nombre = ?, numerohijos = ? where cedula = ?");
			ps.setString(1, cliente.getNombre());
			ps.setInt(2, cliente.getNumeroHijos());
			ps.setString(3, cliente.getCedula());
			ps.executeUpdate();
		} catch (SQLException e) {
			throw new KrakeDevException("Error al actualizar cliente, detalle: "+e.getMessage());
		} catch (KrakeDevException e) {
			throw e;
		}finally{
			if(con != null){
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	public ArrayList<Cliente> recuperarTodos() throws KrakeDevException{
		ArrayList<Cliente> clientes = new ArrayList<Cliente>();
		Connection con = null; 
		PreparedStatement ps = null;
		ResultSet rs = null;
		Cliente c = null;
		try {
			con = ConexionBDD.obtenerConexion();
			ps = con.prepareStatement("select cedula, nombre, numerohijos from clientes");
			rs = ps.executeQuery();
			while(rs.next()) {
				String cedula = rs.getString("cedula");
				String nombre = rs.getString("nombre");
				int numeroHijos = rs.getInt("numerohijos");
				
				c = new Cliente(cedula, nombre, numeroHijos);
				clientes.add(c);			
			}
			
		} catch (KrakeDevException e) {
			e.printStackTrace();
			throw e;
		} catch (SQLException e) {
			e.printStackTrace();
			throw new KrakeDevException("Error al consultar, detalle: "+e.getMessage());
		}
		
		return clientes;
	}
	
	
	public Cliente buscarPorPK(String cedulaBusqueda) throws KrakeDevException{
		Connection con = null; 
		PreparedStatement ps = null;
		ResultSet rs = null;
		Cliente c = null;
		try {
			con = ConexionBDD.obtenerConexion();
			ps = con.prepareStatement("select cedula, nombre, numerohijos from clientes where cedula = ?");
			ps.setString(1, cedulaBusqueda);
			rs = ps.executeQuery();
			if(rs.next()) {
				String cedula = rs.getString("cedula");
				String nombre = rs.getString("nombre");
				int numeroHijos = rs.getInt("numerohijos");
				
				c = new Cliente(cedula, nombre, numeroHijos);			
			}
			
		} catch (KrakeDevException e) {
			e.printStackTrace();
			throw e;
		} catch (SQLException e) {
			e.printStackTrace();
			throw new KrakeDevException("Error al consultar, detalle: "+e.getMessage());
		}
		
		return c;
	}
	
	public ArrayList<Cliente> buscarPorNumeroHijos(int numHijos) throws KrakeDevException{
		ArrayList<Cliente> clientes = new ArrayList<Cliente>();
		Connection con = null; 
		PreparedStatement ps = null;
		ResultSet rs = null;
		Cliente c = null;
		try {
			con = ConexionBDD.obtenerConexion();
			ps = con.prepareStatement("select cedula, nombre, numerohijos from clientes where numerohijos >= ?");
			ps.setInt(1, numHijos);
			rs = ps.executeQuery();
			while(rs.next()) {
				String cedula = rs.getString("cedula");
				String nombre = rs.getString("nombre");
				int numeroHijos = rs.getInt("numerohijos");
				
				c = new Cliente(cedula, nombre, numeroHijos);
				clientes.add(c);			
			}
			
		} catch (KrakeDevException e) {
			e.printStackTrace();
			throw e;
		} catch (SQLException e) {
			e.printStackTrace();
			throw new KrakeDevException("Error al consultar, detalle: "+e.getMessage());
		}
		
		return clientes;
	}
}
