package com.uce.demo.banco.service;
import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.demo.banco.modelo.CuentaBancaria;
import com.uce.demo.banco.modelo.Deposito;
import com.uce.demo.banco.repository.IDepositoRepository;

@Service
public class DepositoServiceImpl  implements IDepositoService{
	@Autowired
	private ICuentaBancariaService bancariaService;
	@Autowired
	private IDepositoRepository depositoRepository;
	
	@Override
	public void realizarDeposito(String id ,String numeroCtaDestino, BigDecimal monto) {
		CuentaBancaria ctaDestino = this.bancariaService.buscar(numeroCtaDestino);
		BigDecimal saldoCtaDestino = ctaDestino.getSaldo();
		BigDecimal saldoFinal = saldoCtaDestino.add(monto);
		ctaDestino.setSaldo(saldoFinal);

		this.bancariaService.actualizar(ctaDestino);
		
		Deposito deposito = new Deposito();
		deposito.setFechaDeposito(LocalDateTime.now());
		deposito.setNumeroCuentaDestino(numeroCtaDestino);
		deposito.setMonto(monto);
		
		this.depositoRepository.insertarDeposito(deposito);
	}

	@Override
	public void actualizarDeposito(CuentaBancaria c) {
		this.depositoRepository.actualizarDeposito(c);	
	}

	@Override
	public Deposito buscarDep(String numero) {
		return this.depositoRepository.buscarDep(numero);
	}

	@Override
	public void eliminarDep(String numero) {
		this.depositoRepository.eliminarDep(numero);
	}	
}
