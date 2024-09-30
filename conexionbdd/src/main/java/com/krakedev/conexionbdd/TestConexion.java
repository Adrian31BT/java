package com.krakedev.conexionbdd;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestConexion {

	public static void main(String[] args) {

		Connection connection = null;
		PreparedStatement ps = null;
		try {
			Class.forName("org.postgresql.Driver");
			connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres",
					"adrian31bt");
			System.out.println("conexion exitosa");
			ps = connection.prepareStatement(
					"insert into personas (cedula, nombre, apellido, estatura, fecha_nacimiento, hora_nacimiento, cantidad_ahorrada, estado_civil_codigo)\r\n"
							+ "values (?,?,?,?,?,?,?,?)");

			ps.setString(1, "0230918223");
			ps.setString(2, "Mariengelis");
			ps.setString(3, "Hernandez");
			ps.setDouble(4, 1.64);
			ps.setBigDecimal(7, new BigDecimal(2000.60));
			ps.setString(8, "S");

			SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
			String fechaStr = "2020/03/22 10:05:05";

			try {
				Date fecha = sdf.parse(fechaStr);
				// System.out.println(fecha);
				long fechaMilis = fecha.getTime();
				// System.out.println(fechaMilis);
				// crea un java.sql.Date a partir de un java.util.Date
				java.sql.Date fechaSQL = new java.sql.Date(fechaMilis);
				System.out.println(fechaSQL);

				Time timeSQL = new Time(fechaMilis);
				System.out.println(timeSQL);

				ps.setDate(5, fechaSQL);
				ps.setTime(6, timeSQL);

				ps.executeUpdate();
				System.out.println("ejecuta insert");
			} catch (ParseException e) {
				e.printStackTrace();
			}

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

}
