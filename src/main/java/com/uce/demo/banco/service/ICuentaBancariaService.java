package com.uce.demo.banco.service;

import com.uce.demo.banco.modelo.CuentaBancaria;

public interface ICuentaBancariaService {
	
	public void actualizar (CuentaBancaria c);
	public CuentaBancaria buscar (String numero);

}
