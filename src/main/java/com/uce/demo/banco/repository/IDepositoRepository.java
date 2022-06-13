package com.uce.demo.banco.repository;

import java.time.LocalDateTime;
import java.util.List;

import com.uce.demo.banco.modelo.CuentaBancaria;
import com.uce.demo.banco.modelo.Deposito;

public interface IDepositoRepository {
	
	public void insertarDeposito (Deposito d);
	public void actualizarDeposito (CuentaBancaria c);
	public Deposito buscarDep (String id);
	public void eliminarDep (String id);
	public List<Deposito> consultar(String cuenta, LocalDateTime fechaInicio, LocalDateTime fechaFin);

}
