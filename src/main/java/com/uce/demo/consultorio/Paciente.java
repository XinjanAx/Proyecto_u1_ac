package com.uce.demo.consultorio;

import org.springframework.stereotype.Component;

@Component
public class Paciente {
	private String nombre,apellido,ciudad;
	private int edad;
	
//------get-set------------------------------
	public String getNombre() {
		return nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public int getEdad() {
		return edad;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	@Override
	public String toString() {
		return "Paciente [nombre=" + nombre + ", apellido=" + apellido + ", ciudad=" + ciudad + ", edad=" + edad + "]";
	}
	

}
