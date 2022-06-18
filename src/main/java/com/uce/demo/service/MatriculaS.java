package com.uce.demo.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Service;

import com.uce.demo.modelo.Matricula;
import com.uce.demo.modelo.ProfesorGeneral;
import com.uce.demo.modelo.ProfesorMateria;
import com.uce.demo.repository.IMatriculaR;


@Service
public class MatriculaS implements IMatriculaS{

    @Autowired
    private IMatriculaR matriculaRepository;

    @Autowired
    private ProfesorGeneral profesorGenearl;
    @Autowired
    private ProfesorMateria profesorMateria;

    @Lookup
    public ProfesorGeneral obtenerProfesorG() {
        return null;
    }

    @Lookup
    public ProfesorMateria obtenerProfesorM() {

        ProfesorMateria profesorM = new ProfesorMateria();
        profesorM.setApellido("Tapia");
        profesorM.setNombre("Fito");
        return profesorM;
    }
	
	
	@Override
	public void incertar(Matricula e) {
		   System.out.println("DI desde Service SINGLETON\n" + this.profesorGenearl);
	        System.out.println("DI desde Service PROTOTYPE\n" + this.profesorMateria);

	        System.out.println("DI un metodo Genaral: " + this.obtenerProfesorG());
	        System.out.println("DI un metodo Materia: " + this.obtenerProfesorM());
	        this.matriculaRepository.incertar(e);
	}

	@Override
	public Matricula buscar(String id) {
		System.out.println("se encontro la matricula "+id);
		return null;
	}

	@Override
	public void actualizar(Matricula e) {
		// TODO Auto-generated method stub
		System.out.println("se actualizo la matricula "+ e);
	}

	@Override
	public void eliminar(String id) {
		// TODO Auto-generated method stub
		System.out.println("se elimino la matricula "+id);
	}

}
