package com.uce.demo.banco.service;

import java.math.BigDecimal;

import com.uce.demo.banco.modelo.CuentaBancaria;
import com.uce.demo.banco.modelo.Deposito;

public interface IDepositoService {
	
	public void realizarDeposito(String id, String numeroCtaDestino,BigDecimal monto);
	public void actualizarDeposito (CuentaBancaria c);
	public Deposito buscarDep (String numero);
	public void eliminarDep (String numero);
}
