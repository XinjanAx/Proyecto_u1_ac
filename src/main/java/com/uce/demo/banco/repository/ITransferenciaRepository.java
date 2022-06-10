package com.uce.demo.banco.repository;

import com.uce.demo.banco.modelo.Transferencia;

public interface ITransferenciaRepository {
	
	public void tranferir (Transferencia t);
	public void actualizarT (Transferencia t);
	public Transferencia buscarTransferencia (String id);
	public void eliminarDep (String id);
}
