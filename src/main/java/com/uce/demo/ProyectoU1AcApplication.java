package com.uce.demo;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.demo.modelo.Estudiante;
import com.uce.demo.modelo.Materia;
import com.uce.demo.modelo.Matricula;
import com.uce.demo.modelo.ProfesorGeneral;
import com.uce.demo.modelo.ProfesorMateria;
import com.uce.demo.service.IMatriculaS;

@SpringBootApplication
public class ProyectoU1AcApplication implements CommandLineRunner{
			
	@Autowired
	private ProfesorGeneral general1;
	@Autowired
	private ProfesorGeneral general2;
	@Autowired
	private ProfesorMateria materia1;
	@Autowired
	private ProfesorMateria materia2;
	@Autowired
	private IMatriculaS iMatriculaService;
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1AcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		this.general1.setNombre("Andres");
		this.general1.setApellido("Benavides");
		
		System.out.println(this.general1);
		System.out.println(this.general2);
		
		System.out.println("-----------");		
		this.general2.setNombre("chysus");
		
		System.out.println(this.general1);
		System.out.println(this.general2);
		
		System.out.println("--------------------#######################------------------");
		
		
		this.materia1.setNombre("mike");	
		this.materia1.setApellido("wasausky");
		
		System.out.println(this.materia1);
		System.out.println(this.materia2);
		
		System.out.println("-----------");		
		System.out.println("--------------------#######################------------------");
		
		Matricula matricula1 = new Matricula();
        matricula1.setEstudiante(new Estudiante());
        matricula1.setMateria(new ArrayList<Materia>());
        matricula1.setNumero("13123");

        this.iMatriculaService.incertar(matricula1);
		
		
	}
}
