package com.uce.demo.grupo.modelo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value=ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class GrupoMusical {
	private String nombre,Ciudad;
	@Autowired
	private Baterista bateria;
	
//get set
	public String getNombre() {
		return nombre;
	}
	public String getCiudad() {
		return Ciudad;
	}
	public Baterista getBateria1() {
		return bateria;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setCiudad(String ciudad) {
		Ciudad = ciudad;
	}
	public void setBateria1(Baterista bateria1) {
		this.bateria = bateria1;
	}
	@Override
	public String toString() {
		return "GrupoMusical Prototype: " + nombre + ", " + Ciudad + ", " + bateria;
	}
	
	
	
}
