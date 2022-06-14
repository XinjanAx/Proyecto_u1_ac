package com.uce.demo.banco.repository;

import java.math.BigDecimal;
import org.springframework.stereotype.Repository;
import com.uce.demo.banco.modelo.CuentaBancaria;

@Repository
public class CuentaBancariaRepositoryImpl implements ICuentaBancariraRepository {
	
	@Override
	public void incertar(CuentaBancaria c) {
		// TODO Auto-generated method stub
		System.out.println("SE agrego la cuenta: "+c.toString());
	}
	@Override
	public void actualizar(CuentaBancaria c) {
		System.out.println("cuenta bancaria actualizada: "+ c);	
	}

	@Override
	public CuentaBancaria buscar(String numero) {
		System.out.println("se busca la cuenta bancaria: "+ numero);
		CuentaBancaria cta = new CuentaBancaria();
		cta.setNumero(numero);
		cta.setSaldo(new BigDecimal(100));
		cta.setTipo("A");
		return cta;
	}
	@Override
	public void eliminar(String numero) {
		// TODO Auto-generated method stub
		System.out.println("cuenta bancaria actualizada: "+ numero);
	}
	
	

}
