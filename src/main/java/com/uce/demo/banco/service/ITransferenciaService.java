package com.uce.demo.banco.service;

import java.math.BigDecimal;

import com.uce.demo.banco.modelo.Transferencia;

public interface ITransferenciaService {
	
	public void realizarTransferencia (String id, String ctaOrigen, String ctaDestino,BigDecimal monto);
	public void actualizarT (Transferencia t);
	public Transferencia buscarTranferencia (String id);
	public void eliminarDep (String id);
}
