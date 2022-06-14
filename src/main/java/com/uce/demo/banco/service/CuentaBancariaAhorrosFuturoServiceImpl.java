package com.uce.demo.banco.service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.uce.demo.banco.modelo.CuentaBancaria;


@Service
@Qualifier("ahorrosFuturo")
public class CuentaBancariaAhorrosFuturoServiceImpl implements ICuentaBancariaService{

	
	@Override
	public void incertar(CuentaBancaria c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actualizar(CuentaBancaria c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public CuentaBancaria buscar(String numero) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void eliminar(String numero) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public BigDecimal calcularInteres(String numerocta, BigDecimal sueldo) {
	//	CuentaBancaria cta = this.bancariaRepository.buscar(numerocta);
		//se soluciona con un gestor o fachada
		BigDecimal saldo = new BigDecimal(20);
		BigDecimal interes = new BigDecimal(600).multiply(new BigDecimal (20).divide(new BigDecimal (100)));
		interes = interes.add(saldo.divide(new BigDecimal (100)));		
		return interes;
	}

}
