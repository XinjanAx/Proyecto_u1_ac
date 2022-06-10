package com.uce.demo;

import java.math.BigDecimal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.uce.demo.banco.service.IRetiroService;

@SpringBootApplication
public class ProyectoU1AcApplication implements CommandLineRunner{
			
	@Autowired
	private IRetiroService retiroService;
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1AcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		this.retiroService.realizarRetiro("368413541-e4", "14", "22546842187", new BigDecimal(10));
			
	}

}
