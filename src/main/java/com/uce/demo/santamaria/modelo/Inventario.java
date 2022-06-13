package com.uce.demo.santamaria.modelo;

import java.util.ArrayList;
import java.util.List;

public class Inventario {
	
	private String id;
	
	private List<Producto> inventario = new ArrayList<Producto>();
	
	public void addProfucto(Producto p) {
		this.inventario.add(p);
	}
	
	public void setInventario(List<Producto> inventario) {
		this.inventario = inventario;
	}
	public List<Producto> getInventario() {
		return inventario;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
		@Override
	public String toString() {
		System.out.println("Inventario: ");
		return  ""+ inventario ;
	}
}
