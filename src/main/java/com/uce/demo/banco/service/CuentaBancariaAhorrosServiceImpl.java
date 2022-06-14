package com.uce.demo.banco.service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.uce.demo.banco.modelo.CuentaBancaria;
import com.uce.demo.banco.repository.ICuentaBancariraRepository;

@Service
@Qualifier("ahorros")
public class CuentaBancariaAhorrosServiceImpl implements ICuentaBancariaService{

	@Autowired
	private ICuentaBancariraRepository bancariaRepository;
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
		BigDecimal saldo = new BigDecimal(12);
		BigDecimal interes = new BigDecimal(560).multiply(new BigDecimal (0.15));
		interes = interes.add(saldo.divide(new BigDecimal (100)));
		
		return interes;
	}

}
