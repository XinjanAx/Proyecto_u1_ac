package com.uce.demo.FirmaA;

import org.springframework.stereotype.Component;

@Component
public class Demandante {
	private String id,nombre,apellido,ciudad,causa;
	private int edad;
	
	//----------get set------------------
	public String getCausa() {
		return causa;
	}
	public void setCausa(String causa) {
		this.causa = causa;
	}
	public String getId() {
		return id;
	}
	public String getNombre() {
		return nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public String getCiudad() {
		return ciudad;
	}
	public int getEdad() {
		return edad;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	@Override
	public String toString() {
		return "Demandante [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", ciudad=" + ciudad
				+ ", causa=" + causa + ", edad=" + edad + "]";
	}
	
	
	
}
