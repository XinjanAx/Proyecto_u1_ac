package com.uce.demo.repository;


import org.springframework.stereotype.Repository;

import com.uce.demo.modelo.Matricula;

@Repository
public class MatriculaR implements IMatriculaR
{

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
		System.out.println("se acuslizo la matricula "+ e);
	}

	@Override
	public void eliminar(String id) {
		// TODO Auto-generated method stub
		System.out.println("se elimino la matricula "+id);
	}


}
