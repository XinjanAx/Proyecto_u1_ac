package com.uce.demo.banco.service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.uce.demo.banco.modelo.CuentaBancaria;
import com.uce.demo.banco.repository.ICuentaBancariraRepository;

@Service
public class FachadaCuentaBancariaServiceImpl implements IFachadaCuentaBancariaService{
	
	
	@Autowired
	private ICuentaBancariraRepository bancariaRepository;
	@Autowired
	@Qualifier("corriente")
	private ICuentaBancariaService bancariaService;
	@Autowired
	@Qualifier("ahorros")
	private ICuentaBancariaService bancariaServiceA;
	
	@Override
	public BigDecimal calcularInteres(String numeroCta) {

        BigDecimal interes= null;
        CuentaBancaria cta = this.bancariaRepository.buscar(numeroCta);
        if(cta.getTipo().equals("w")) {
            //Ahorros
            interes =this.bancariaServiceA.calcularInteres(numeroCta, cta.getSaldo());

        }else {
            //Corriente
            interes =this.bancariaService.calcularInteres(numeroCta, cta.getSaldo());

        }
        return interes;
	}

}
