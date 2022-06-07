package com.uce.demo.service;


import org.springframework.stereotype.Service;

import com.uce.demo.modelo.Matricula;
@Service
public class MatriculaS implements IMatriculaS{


	@Override
	public void incertar(Matricula e) {
		// TODO Auto-generated method stub
		System.out.println("se incerto la matricula "+ e);
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
