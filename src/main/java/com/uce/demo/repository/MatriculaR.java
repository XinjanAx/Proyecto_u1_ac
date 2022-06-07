package com.uce.demo.repository;

import com.uce.demo.modelo.Estudiante;
import com.uce.demo.modelo.Matricula;


public class MatriculaR implements IMatriculaR
{

	@Override
	public void incertar(Matricula e) {
		// TODO Auto-generated method stub
		System.out.println("se incerto la matricula");
	}

	@Override
	public Matricula buscar(String id) {
		System.out.println("se encontro la matricula");
		return null;
	}

	@Override
	public void actualizar(Matricula e) {
		// TODO Auto-generated method stub
		System.out.println("se elimino la matricula");
	}

	@Override
	public void eliminar(String id) {
		// TODO Auto-generated method stub
		
	}


}
