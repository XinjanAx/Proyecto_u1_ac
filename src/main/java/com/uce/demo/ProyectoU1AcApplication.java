package com.uce.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.demo.santamaria.service.IInventarioService;
import com.uce.demo.santamaria.service.IProductoService;

@SpringBootApplication
public class ProyectoU1AcApplication implements CommandLineRunner{
			
	@Autowired
	private IProductoService producotS;
	@Autowired
	private IInventarioService inventarioS;
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1AcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	
		
		
		this.inventarioS.añadirProductoI(this.producotS.incertarProducto("Jalapeños","300", new BigDecimal(0.2), LocalDateTime.of(2022, 2, 15, 10, 0)));
		this.inventarioS.añadirProductoI(this.producotS.incertarProducto("Arror","20c", new BigDecimal(35), LocalDateTime.of(2022, 4, 7, 10, 0)));
		this.inventarioS.añadirProductoI(this.producotS.incertarProducto("Agua","570", new BigDecimal(0.7), LocalDateTime.of(2022, 4, 20, 10, 0)));
		this.inventarioS.añadirProductoI(this.producotS.incertarProducto("Colgate","100", new BigDecimal(0.8), LocalDateTime.of(2022, 3, 15, 10, 0)));
		this.inventarioS.añadirProductoI(this.producotS.incertarProducto("Mortadela","480", new BigDecimal(2.75), LocalDateTime.now()));
		
		this.inventarioS.verInventario();	
		
		this.inventarioS.reporteFecha(LocalDateTime.of(2022, 3, 15, 11, 0));
		
		
		
	}

}
