package krakedev.entidades;

import java.util.ArrayList;

public class Estudiante {
	private String nombre;
	private String apellido;
	private String cedula;
	private ArrayList<Nota> notas;


	public Estudiante(String cedula, String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.cedula = cedula;
		notas = new ArrayList<Nota>();
	}

	public void agregarNota(Nota nuevaNota) {
		String almCodMateria;
		boolean validar = false;
		if(notas.size() == 0) {
			notas.add(nuevaNota);
		}else {
			for (int i = 0; i < notas.size(); i++) {
				almCodMateria = notas.get(i).getMateria().getCodigo();
				if (almCodMateria.equals(nuevaNota.getMateria().getCodigo())) {
					validar = true;
				}
			}
			if(validar == false) {
				if (nuevaNota.getCalificacion() >= 0 && nuevaNota.getCalificacion() <= 10) {
					notas.add(nuevaNota);
				}
			}	
		}	
	}

	public void modificarNota(String codigo, double nuevaNota) {
		String almCodMateria;
		boolean validar = false;
		for (int i = 0; i < notas.size(); i++) {
			almCodMateria = notas.get(i).getMateria().getCodigo();
			if (almCodMateria.equals(codigo)) {
				validar = true;
				if (nuevaNota >= 0 && nuevaNota <= 10) {
					notas.get(i).setCalificacion(nuevaNota);
				}
			}
		}
		if (validar == false) {
			System.out.println("No se encontro el codigo de la materia");
		}
	}

	public double calcularPromedioNotasEstudiante() {
		double acumNotas = 0;
		double promedio = 0;
		for (int i = 0; i < notas.size(); i++) {
			acumNotas = acumNotas + notas.get(i).getCalificacion();
		}

		promedio = acumNotas / notas.size();
		return promedio;
	}

	public void mostrar() {
		System.out.println("Estudiante [Cedula: " + cedula + ", Nombre de estudiante: " + nombre
				+ ", Apellido de estudiante: " + apellido + "]");
		for (int i = 0; i < notas.size(); i++) {
			notas.get(i).mostrar();
		}
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public ArrayList<Nota> getNotas() {
		return notas;
	}

	public void setNotas(ArrayList<Nota> notas) {
		this.notas = notas;
	}

}
