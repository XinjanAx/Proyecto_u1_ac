package com.uce.demo.banco.service;

import java.math.BigDecimal;

import com.uce.demo.banco.modelo.CuentaBancaria;

public interface ICuentaBancariaService {
	
	public void incertar(CuentaBancaria c);
	public void actualizar (CuentaBancaria c);
	public CuentaBancaria buscar (String numero);
	public void eliminar (String numero);
	public BigDecimal calcularInteres(String numerocta,BigDecimal sueldo);

}
