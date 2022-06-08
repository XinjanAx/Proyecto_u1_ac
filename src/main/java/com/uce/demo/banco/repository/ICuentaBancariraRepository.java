package com.uce.demo.banco.repository;

import com.uce.demo.banco.modelo.CuentaBancaria;

public interface ICuentaBancariraRepository {

	public void actualizar (CuentaBancaria c);
	public CuentaBancaria buscar (String numero);
	
}
