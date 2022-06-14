package com.uce.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.demo.banco.service.IFachadaCuentaBancariaService;

@SpringBootApplication
public class ProyectoU1AcApplication implements CommandLineRunner{
			
	@Autowired
	private IFachadaCuentaBancariaService bancaria;

	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1AcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
			
		System.out.println(this.bancaria.calcularInteres("cew123"));
	}

}
