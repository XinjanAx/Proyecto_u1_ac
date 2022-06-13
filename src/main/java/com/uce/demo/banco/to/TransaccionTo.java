package com.uce.demo.banco.to;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class TransaccionTo {
	
	private LocalDateTime fecha;
    private String tipo;
    private BigDecimal monto;
    
    //get set
    
	public LocalDateTime getFecha() {
		return fecha;
	}
	public String getTipo() {
		return tipo;
	}
	public BigDecimal getMonto() {
		return monto;
	}
	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public void setMonto(BigDecimal monto) {
		this.monto = monto;
	}

}
