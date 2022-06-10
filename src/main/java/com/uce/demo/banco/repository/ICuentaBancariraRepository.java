package com.uce.demo.banco.repository;

import com.uce.demo.banco.modelo.CuentaBancaria;


public interface ICuentaBancariraRepository {
	
//CRUD
	public void incertar(CuentaBancaria c);
	public void actualizar (CuentaBancaria c);
	public CuentaBancaria buscar (String numero);
	public void eliminar (String numero);
	
	
}
