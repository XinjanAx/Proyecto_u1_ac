package com.uce.demo.banco.to;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import com.uce.demo.banco.modelo.Deposito;
import com.uce.demo.banco.modelo.Retiro;
import com.uce.demo.banco.modelo.Transferencia;
import com.uce.demo.banco.service.ITransaccionService;

public class TransaccionTo implements ITransaccionService {
	
	private LocalDateTime fecha;
    private String tipo;
    private BigDecimal monto;
		
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

	

	@Override
	public void transferencia(String origen, String destino, BigDecimal monto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deposito(String destino, BigDecimal monto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void retiro(String ctaRetiro, BigDecimal monto) {
		// TODO Auto-generated method stub
		
	}
	

}
