package com.uce.demo.banco.service;

import java.math.BigDecimal;

import com.uce.demo.banco.modelo.Retiro;

public interface IRetiroService{
	
	public void realizarRetiro(String id,String cuentaRetiro,String numTarjeta,BigDecimal monto);
	public void actualizar (Retiro r);
	public Retiro buscar (String id);
	public void eliminar (String id);

}
