package com.uce.demo;



import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import com.uce.demo.modelo.*;
import com.uce.demo.service.*;


@SpringBootApplication
public class ProyectoU1AcApplication implements CommandLineRunner{
	
	@Autowired
    private IEstudianteService estudianteService;
	@Autowired
    private IMateriaS materiaS;
	@Autowired
    private IMatriculaS matriculaS;
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1AcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		
		Estudiante e1 = new Estudiante();
        e1.setNombre("Lennin");
        e1.setApellido("Zhindon");
        e1.setId("1835482241");
        this.estudianteService.incertarEstudiante(e1);



        //Usar los 3 metodos restantes
        e1.setId("1727099999");
        this.estudianteService.actualizarEstudiante(e1);
        this.estudianteService.buscarPorApellido("Zhindon");
        this.estudianteService.eliminarEstudiante("0987654321");
        
        System.out.println();
        //
        Materia m1 = new Materia();
        m1.setNombre("Inteligencia analoga");
        m1.setSemestre("7mo");
               
        this.materiaS.incertar(m1);
        this.materiaS.buscar("Algebra");
        m1.setNombre("Programacion");
        this.materiaS.actualizar(m1);
        this.materiaS.eliminar("Programacion");
        
        System.out.println();
        
        Materia m2 = new Materia();
        m2.setNombre("Algebra");
        m2.setSemestre("5to");
        
        Matricula mtr1 = new Matricula();
        mtr1.setEstudiante(e1);
        mtr1.setNumero("e-3546+4");
        
        List<Materia> materiasL = new ArrayList<Materia>(); 
        materiasL.add(m1);
        materiasL.add(m2);
        
        mtr1.setMateria(materiasL);
        
        this.matriculaS.incertar(mtr1);
        this.matriculaS.buscar("e-3546+4");
        mtr1.setNumero("f-65941+j");
        this.matriculaS.actualizar(mtr1);
        this.matriculaS.eliminar("f-65941+j");
        
		
	}

}
