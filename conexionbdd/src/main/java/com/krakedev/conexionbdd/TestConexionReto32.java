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

public class TestConexionReto32 {

	public static void main(String[] args) {
		Connection connection = null;
		PreparedStatement ps1 = null;
		PreparedStatement ps2 = null;
		try {
			Class.forName("org.postgresql.Driver");
			connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/reto2", "postgres",
					"adrian31bt");
			System.out.println("conexion exitosa");

			// Insert de persona
			ps1 = connection.prepareStatement(
					"insert into persona (cedula, nombre, apellido, estatura, fecha_nacimiento, hora_nacimiento, cantidad_ahorrada, numero_hijos)\r\n"
							+ "values (?,?,?,?,?,?,?,?)");

			ps1.setString(1, "0230918223");
			ps1.setString(2, "Mariengelis");
			ps1.setString(3, "Hernandez");
			ps1.setDouble(4, 1.64);

			SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
			String fechaStr1 = "2002/03/22 11:06:05";
			String fechaStr2 = "2024/09/29 15:00:00";

			try {
				Date fecha1 = sdf.parse(fechaStr1);
				long fechaMilis1 = fecha1.getTime();

				java.sql.Date fechaSQL1 = new java.sql.Date(fechaMilis1);
				Time timeSQL1 = new Time(fechaMilis1);

				ps1.setDate(5, fechaSQL1);
				ps1.setTime(6, timeSQL1);
				ps1.setBigDecimal(7, new BigDecimal(2000.60));
				ps1.setInt(8, 2);

				ps1.executeUpdate();
				System.out.println("ejecuta insert persona");

				// Insert de prestamo

				ps2 = connection.prepareStatement(
						"insert into prestamo (cedula, monto, fecha_prestamo, hora_prestamo, garante)\r\n"
								+ "values (?,?,?,?,?)");
				ps2.setString(1, "0230918223");
				ps2.setBigDecimal(2, new BigDecimal(5000));

				Date fecha2 = sdf.parse(fechaStr2);
				
				long fechaMilis2 = fecha2.getTime();

				java.sql.Date fechaSQL2 = new java.sql.Date(fechaMilis2);
				Time timeSQL2 = new Time(fechaMilis2);

				ps2.setDate(3, fechaSQL2);
				ps2.setTime(4, timeSQL2);
				ps2.setString(5, "Adrian Bacilio");

				ps2.executeUpdate();
				System.out.println("ejecuta insert prestamo");

			} catch (ParseException e) {
				e.printStackTrace();
			}

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

	}

}
