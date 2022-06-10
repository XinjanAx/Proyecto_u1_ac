package com.uce.demo.banco.repository;

import org.springframework.stereotype.Repository;

import com.uce.demo.banco.modelo.CuentaBancaria;
import com.uce.demo.banco.modelo.Deposito;

@Repository
public class DepositoRepositoryImpl implements IDepositoRepository{
	

	@Override
	public void insertarDeposito(Deposito d) {
		// TODO Auto-generated method stub
		System.out.println("se creo el deposito:"+ d);
	}

	@Override
	public void actualizarDeposito(CuentaBancaria c) {
		// TODO Auto-generated method stub
		System.out.println("se actualizo el deposito:"+ c);
	}

	@Override
	public Deposito buscarDep(String id) {
		Deposito deposito = new Deposito();
		deposito.setNumeroCuentaDestino(id);
		System.out.println("Se econtro el deposito: "+id);
		return deposito;
	}

	@Override
	public void eliminarDep(String id) {
		// TODO Auto-generated method stub
		System.out.println("se elimino el deposito:"+ id);
	}
	
	
}
