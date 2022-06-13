package com.uce.demo.banco.repository;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

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

	@Override
	public List<Deposito> consultar(String cuenta, LocalDateTime fechaInicio, LocalDateTime fechaFin) {
		List<Deposito> listaDepositos = new ArrayList<>();
        Deposito dep1 = new Deposito();
        dep1.setFechaDeposito(LocalDateTime.of(2021, 2, 10, 8, 50, 2));
        dep1.setMonto(new BigDecimal(20));
        dep1.setNumeroCuentaDestino("2345");

        listaDepositos.add(dep1);

        Deposito dep2 = new Deposito();
        dep2.setFechaDeposito(LocalDateTime.of(2021, 3, 15, 9, 53, 2));
        dep2.setMonto(new BigDecimal(50));
        dep2.setNumeroCuentaDestino("1234");

        listaDepositos.add(dep2);

        return listaDepositos;
	}
	
	
}
