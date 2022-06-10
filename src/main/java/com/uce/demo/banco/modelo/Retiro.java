package com.uce.demo.banco.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Retiro {
	
	private String id, cuentaRetiro, numTarjeta; 
	private BigDecimal monto;
	private LocalDateTime fechaRetiro;
	
//----------set get-----------------------------------
	public String getId() {
		return id;
	}
	public String getcuentaRetiro() {
		return cuentaRetiro;
	}
	public String getNumTargeta() {
		return numTarjeta;
	}
	public BigDecimal getMonto() {
		return monto;
	}
	public LocalDateTime getFechaRetiro() {
		return fechaRetiro;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setCuentaRetiro(String cuentaRetiro) {
		this.cuentaRetiro = cuentaRetiro;
	}
	public void setNumTargeta(String numTargeta) {
		this.numTarjeta = numTargeta;
	}
	public void setMonto(BigDecimal monto) {
		this.monto = monto;
	}
	public void setFechaRetiro(LocalDateTime fechaRet) {
		this.fechaRetiro = fechaRet;
	}
	
	@Override
	public String toString() {
		return "Retiro [id=" + id + ", Cuenta=" + cuentaRetiro + ", numero de Tarjeta=" + numTarjeta + ", monto=" + monto
				+ ", fecha de Retiro=" + fechaRetiro + "]";
	}	
}
