package com.uce.demo.banco.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.uce.demo.banco.modelo.CuentaBancaria;
import com.uce.demo.banco.modelo.Transferencia;
import com.uce.demo.banco.repository.ITransferenciaRepository;

@Service
public class TransferenciaServiceImpl implements ITransferenciaService{
	
	@Autowired
	@Qualifier("ahorros")
	private ICuentaBancariaService bancariaService;
	@Autowired
	private ITransferenciaRepository iTransferenciaRepository; 
	
	@Override
	public void realizarTransferencia(String ctaOrigen, String ctaDestino, BigDecimal monto, String numTransferencia) {

		CuentaBancaria cOrigen = this.bancariaService.buscar(ctaOrigen);
		BigDecimal saldoOrigen = cOrigen.getSaldo();
		BigDecimal nuevoSaldoOrigen = saldoOrigen.subtract(monto);
		cOrigen.setSaldo(nuevoSaldoOrigen);
		this.bancariaService.actualizar(cOrigen);

		CuentaBancaria cDestino = this.bancariaService.buscar(ctaDestino);
		BigDecimal saldoDestino = cDestino.getSaldo();
		BigDecimal nuevoSaldoDestino = saldoDestino.add(monto);
		cDestino.setSaldo(nuevoSaldoDestino);
		this.bancariaService.actualizar(cDestino);
		
		Transferencia t = new Transferencia();
		t.setNumeroCuentaOrigen(ctaOrigen);
		t.setNumeroCuentaDestino(ctaDestino);
		t.setMontoTransferir(monto);
		t.setFechaTransferencia(LocalDateTime.now());
		this.iTransferenciaRepository.tranferir(t);
	}

	@Override
	public void actualizarTransferencia(Transferencia t) {
		// TODO Auto-generated method stub
		this.iTransferenciaRepository.actualizarT(t);
	}

	@Override
	public Transferencia buscarTransferencia(String numTransferencia) {
		// TODO Auto-generated method stub
		return this.iTransferenciaRepository.buscarTransferencia(numTransferencia);
	}

	@Override
	public void eliminarTransferencia(String id) {
		// TODO Auto-generated method stub
		this.iTransferenciaRepository.eliminarDep(id);
	}

	@Override
	public List<Transferencia> consultar(String cuenta, LocalDateTime fechaInicio, LocalDateTime fechaFin) {
		// TODO Auto-generated method stub
		return null;
	}

}
