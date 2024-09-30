package com.krakedev.persistencia.servicios;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Time;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.krakedev.persistencia.entidades.Persona;
import com.krakedev.persistencia.util.ConexionBDD;

public class AdminPersonas {

	private static final Logger LOGGER = LogManager.getLogger(AdminPersonas.class);

	public static void insertar(Persona persona) throws Exception {
		Connection con = null;
		PreparedStatement ps;
		LOGGER.trace("Persona a insertar: " + persona);
		try {
			// abre la conexion
			con = ConexionBDD.conectar();
			ps = con.prepareStatement(
					"insert into personas (cedula, nombre, apellido, estatura, fecha_nacimiento, hora_nacimiento, cantidad_ahorrada, numero_hijos, estado_civil_codigo)\r\n"
							+ "values (?,?,?,?,?,?,?,?,?)");

			ps.setString(1, persona.getCedula());
			ps.setString(2, persona.getNombre());
			ps.setString(3, persona.getApellido());
			ps.setDouble(4, persona.getEstatura());

			ps.setDate(5, new java.sql.Date(persona.getFecha_nacimiento().getTime()));
			ps.setTime(6, new Time(persona.getHora_nacimiento().getTime()));

			ps.setBigDecimal(7, persona.getCantidad_ahorrada());
			ps.setInt(8, persona.getNumero_hijos());
			ps.setString(9, persona.getEstado_civil_codigo().getCodigo());

			ps.executeUpdate();

		} catch (Exception e) {
			LOGGER.error("Error al insertar", e);
			throw new Exception("Error al insertar");
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				LOGGER.error("Error con la base de datos", e);
				throw new Exception("Error con la base de datos");
			}
		}
	}

}
