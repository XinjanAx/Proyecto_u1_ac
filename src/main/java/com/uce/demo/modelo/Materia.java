package com.uce.demo.modelo;

public class Materia {
	private String nombre, semestre;

//-------------get set------------------
	public String getNombre() {
		return nombre;
	}

	public String getSemestre() {
		return semestre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setSemestre(String semestre) {
		this.semestre = semestre;
	}

	@Override
	public String toString() {
		return "Materia [nombre=" + nombre + ", semestre=" + semestre + "]";
	}
	
	

}
