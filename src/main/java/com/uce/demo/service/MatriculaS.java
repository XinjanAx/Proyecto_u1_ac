package com.uce.demo.service;


import com.uce.demo.modelo.Matricula;

public class MatriculaS implements IMatriculaS{


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
