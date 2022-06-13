package com.uce.demo.banco.repository;

import java.time.LocalDateTime;
import java.util.List;

import com.uce.demo.banco.modelo.Transferencia;

public interface ITransferenciaRepository {
	
	public void tranferir (Transferencia t);
	public void actualizarT (Transferencia t);
	public Transferencia buscarTransferencia (String id);
	public void eliminarDep (String id);
	public List<Transferencia> consultar(String cuenta, LocalDateTime fechaInicio, LocalDateTime fechaFin);

}
