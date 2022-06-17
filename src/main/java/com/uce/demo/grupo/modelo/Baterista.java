package com.uce.demo.grupo.modelo;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value=ConfigurableBeanFactory.SCOPE_SINGLETON)
public class Baterista {
	private String nombre,apellido;
	private boolean teoria;

//get set
	public String getNombre() {
		return nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public boolean isTeoria() {
		return teoria;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public void setTeoria(boolean teoria) {
		this.teoria = teoria;
	}
	@Override
	public String toString() {
		return "Baterista Singleton: " + nombre + " " +  apellido;
	}
}
