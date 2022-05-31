package com.uce.demo.consultorio;

import org.springframework.stereotype.Component;

//METADATOS
	
@Component
public class Doctor {
	private String nombre, apellido;

//------get-set------------------------------
	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	@Override
	public String toString() {
		return "Doctor [nombre=" + nombre + ", apellido=" + apellido + "]";
	}
	
	
	
}
