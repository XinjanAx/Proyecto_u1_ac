package com.uce.demo;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.demo.consultorio.CitaMedica;
import com.uce.demo.consultorio.CitaMedica2;

@SpringBootApplication
public class ProyectoU1AcApplication implements CommandLineRunner{
	
	//Inyeccion de D por atriburo
	@Autowired
	private CitaMedica2 cita;
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1AcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Mi primer proyecto con Spring Framework");


        
        cita.agendar(LocalDateTime.now(), "Andres", "Benavides", "Quito",23,  "Ramon", "Padilla");
        System.out.println(cita.toString());
        
	}

}
