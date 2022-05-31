package com.uce.demo;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.demo.FirmaA.ProcesoDemandaAtributo;
import com.uce.demo.FirmaA.ProcesoDemandaConstructor;
import com.uce.demo.FirmaA.ProcesoDemandaSet;
import com.uce.demo.consultorio.CitaMedica;
import com.uce.demo.consultorio.CitaMedica2;

@SpringBootApplication
public class ProyectoU1AcApplication implements CommandLineRunner{
	
	//Inyeccion de D por atriburo
//	@Autowired
//	private CitaMedica2 cita;
	@Autowired
	private ProcesoDemandaAtributo pdA;
	@Autowired
	private ProcesoDemandaConstructor pdC;
	@Autowired
	private ProcesoDemandaSet pdS;
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1AcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
      //cita.agendar(LocalDateTime.now(), "Andres", "Benavides", "Quito",23,  "Ramon", "Padilla");
      //System.out.println(cita.toString());		
		
		System.out.println("Deber de inyeccion de dependencia Spring Framework");

		pdA.demandar(LocalDate.now(), "175468854-e", "Esteban", "Ramirez", "Quito", "Robo a mano armada", 34, "448725664","Manuel", "De Serbantes", "Guallaquil", 33);	
		System.out.println(pdA.toString());
		pdC.demandar(LocalDate.now(), "175468854-e", "Esteban", "Ramirez", "Quito", "Robo a mano armada", 34, "448725664","Manuel", "De Serbantes", "Guallaquil", 33);
		System.out.println(pdC.toString());
		pdS.demandar(LocalDate.now(), "175468854-e", "Esteban", "Ramirez", "Quito", "Robo a mano armada", 34, "448725664","Manuel", "De Serbantes", "Guallaquil", 33);
		System.out.println(pdS.toString());
	}

}
