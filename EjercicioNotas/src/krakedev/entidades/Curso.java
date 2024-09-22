package krakedev.entidades;

import java.util.ArrayList;

public class Curso {
	private ArrayList<Estudiante> estudiantes;
	
	public Curso() {
		estudiantes = new ArrayList<Estudiante>();
	}
	
	public String buscarEstudiantePorCedula(Estudiante estudiante) {
		String mensaje = null;
		for(int i=0; i<estudiantes.size(); i++) {
			if(estudiante.getCedula().equals(estudiantes.get(i).getCedula())) {
				mensaje = "Estudiante encontrado";
			}
		}
		
		return mensaje;
	}
	
	public void matricularEstudiante(Estudiante estudiante) {
		String respuesta;
		respuesta = buscarEstudiantePorCedula(estudiante);
		if(respuesta == null) {
			estudiantes.add(estudiante);
		}
	}
	
	public double calcularPromedioCurso() {
		double aumPromedio = 0; 
		double promedioCurso = 0;
		for(int i=0; i<estudiantes.size(); i++) {
			aumPromedio = aumPromedio + estudiantes.get(i).calcularPromedioNotasEstudiante();
		}
		
		promedioCurso = aumPromedio / estudiantes.size();
		return promedioCurso;
	}
	
	public void mostrar() {
		for(int i=0; i<estudiantes.size(); i++) {
			estudiantes.get(i).mostrar();
		}
	}

	public ArrayList<Estudiante> getEstudiantes() {
		return estudiantes;
	}

	public void setEstudiantes(ArrayList<Estudiante> estudiantes) {
		this.estudiantes = estudiantes;
	}
	
	
}
