package com.uce.demo;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import com.uce.demo.grupo.modelo.Baterista;
import com.uce.demo.grupo.modelo.GrupoMusical;


@SpringBootApplication
public class ProyectoU1AcApplication implements CommandLineRunner{
			
	@Autowired
	private Baterista bateria1;
	@Autowired
	private Baterista bateria2;
	@Autowired
	private GrupoMusical gupo1;
	@Autowired
	private GrupoMusical gupo2;

	
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1AcApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		this.bateria1.setNombre("Fredo");
		this.bateria1.setApellido("Godofredo");
		
		this.gupo1.setNombre("Billy y los Gasonoros");
		this.gupo1.setCiudad("Inframundo Records");
		this.gupo1.setBateria1(bateria1);
		
		this.gupo2.setNombre("Los Borbotones");
		this.gupo2.setCiudad("Springfield");
		this.gupo2.setBateria1(bateria2);
		
		System.out.println();
		System.out.println(this.gupo1);
		System.out.println("-----------------------");
		System.out.println(this.gupo2);	
		
		System.out.println("\n-----------------------------------Cambio a baterista2--------------------------------");
		
		this.bateria2.setNombre("Vegeta");
		this.bateria2.setApellido("");
		
		System.out.println();
		System.out.println(this.gupo1);
		System.out.println("-----------------------");
		System.out.println(this.gupo2);
	}
}
