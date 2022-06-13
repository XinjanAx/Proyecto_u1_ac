package com.uce.demo.santamaria.modelo;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDateTime;



public class Producto {
	
	private String nombre,cantidad;
	private BigDecimal valor;
	private LocalDateTime fechaIngreso;

	
// get set
	public String getNombre() {
		return nombre;
	}
	public String getCantidad() {
		return cantidad;
	}
	public BigDecimal getValor() {
		return valor;
	}
	public LocalDateTime getFechaIngreso() {
		return fechaIngreso;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setCantidad(String cantidad) {
		this.cantidad = cantidad;
	}
	public void setValor(BigDecimal PC) {
		this.valor = PC;
	}
	public void setFechaIngreso(LocalDateTime fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}
	@Override
	public String toString() {
		return nombre + " - " + cantidad + " - $" + valor.setScale(2, RoundingMode.HALF_UP) + " -- "
				+ fechaIngreso +"\n";
	}
	
	
}

