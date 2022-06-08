package com.uce.demo.banco.repository;

import org.springframework.stereotype.Repository;

import com.uce.demo.banco.modelo.Deposito;

@Repository
public class DepositoRepositoryImpl implements IDepositoRepository{

	@Override
	public void insertarDeposito(Deposito d) {
		// TODO Auto-generated method stub
		System.out.println("se creo el deposito:"+ d);
		
	}
}
