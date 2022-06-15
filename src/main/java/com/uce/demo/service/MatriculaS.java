package com.uce.demo.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.demo.modelo.Matricula;
import com.uce.demo.modelo.ProfesorGeneral;
import com.uce.demo.modelo.ProfesorMateria;
import com.uce.demo.repository.IMatriculaR;


@Service
public class MatriculaS implements IMatriculaS{

	@Autowired
	private IMatriculaR iMatriculaRepo;
	
	@Autowired
	private ProfesorGeneral pGeneral;
	@Autowired
	private ProfesorMateria pMateria;
	
	@Override
	public void incertar(Matricula e) {
		System.out.println("Di desde Service Single:"+this.pGeneral);
		System.out.println("Di desde Service Proto:"+this.pMateria);
		
		this.iMatriculaRepo.incertar(e);
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
