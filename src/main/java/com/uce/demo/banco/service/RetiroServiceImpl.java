package com.uce.demo.banco.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.demo.banco.modelo.CuentaBancaria;
import com.uce.demo.banco.modelo.Retiro;
import com.uce.demo.banco.repository.IRetiroRepository;

@Service
public class RetiroServiceImpl implements IRetiroService{
	
	@Autowired
	private ICuentaBancariaService bancariaService;
	@Autowired
	private IRetiroRepository retiroRepository;

	@Override
	public void realizarRetiro(String id, String cuentaRetiro, String numTarjeta, BigDecimal monto) {
		CuentaBancaria cuenta = this.bancariaService.buscar(cuentaRetiro);
		BigDecimal saldoCuenta = cuenta.getSaldo();
		BigDecimal saldoFinal = saldoCuenta.subtract(monto);
		cuenta.setSaldo(saldoFinal);

		this.bancariaService.actualizar(cuenta);
		
		Retiro retiro = new Retiro();
		retiro.setId(id);
		retiro.setCuentaRetiro(cuentaRetiro);
		retiro.setNumTargeta(numTarjeta);
		retiro.setFechaRetiro(LocalDateTime.now());
		retiro.setCuentaRetiro(cuentaRetiro);
		retiro.setMonto(monto);
		
		this.retiroRepository.incertar(retiro);
		
	}

	@Override
	public void actualizar(Retiro r) {
		// TODO Auto-generated method stub
		this.retiroRepository.actualizar(r);
	}

	@Override
	public Retiro buscar(String id) {
		return this.retiroRepository.buscar(id);
	}

	@Override
	public void eliminar(String id) {
		// TODO Auto-generated method stub
		this.retiroRepository.eliminar(id);
	}



}
