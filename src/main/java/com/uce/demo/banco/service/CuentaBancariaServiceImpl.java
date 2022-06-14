package com.uce.demo.banco.service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.uce.demo.banco.modelo.CuentaBancaria;
import com.uce.demo.banco.repository.ICuentaBancariraRepository;

@Service
public class CuentaBancariaServiceImpl  implements ICuentaBancariaService{
	
	@Autowired
	private ICuentaBancariraRepository bancariaRepository;
	
//CRUD	
	@Override
	public void incertar(CuentaBancaria c) {
		this.bancariaRepository.incertar(c);
	}
	
	@Override
	public void actualizar(CuentaBancaria c) {
		this.bancariaRepository.actualizar(c);
	}

	@Override
	public CuentaBancaria buscar(String numero) {
		// TODO Auto-generated method stub
		return this.bancariaRepository.buscar(numero);
	}

	@Override
	public void eliminar(String numero) {
		// TODO Auto-generated method stub	
		this.bancariaRepository.eliminar(numero);
	}

	@Override
	public BigDecimal calcularInteres(String numerocta,BigDecimal sueldo) {
		// TODO Auto-generated method stub
		return null;
	}
}
