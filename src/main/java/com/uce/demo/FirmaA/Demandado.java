package com.uce.demo.FirmaA;

import org.springframework.stereotype.Component;

@Component
public class Demandado {
	private String id,nombre,apellido,ciudad,delito;
	private int edad;
	
	
	//----------get set------------------
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
	public String getId() {
		return id;
	}
	public String getDelito() {
		return delito;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setDelito(String delito) {
		this.delito = delito;
	}
	@Override
	public String toString() {
		return "Demandado [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", ciudad=" + ciudad
				+ ", delito=" + delito + ", edad=" + edad + "]";
	}
	

}
