package com.uce.demo.banco.repository;

import org.springframework.stereotype.Repository;

import com.uce.demo.banco.modelo.Transferencia;

@Repository
public class TransferenciaRepositoryImpl  implements ITransferenciaRepository{

	@Override
	public void insertar(Transferencia t) {
		System.out.println("se crea la transferencia: "+ t);
		
	}

	
}
