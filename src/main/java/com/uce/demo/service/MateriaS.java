package com.uce.demo.service;


import com.uce.demo.modelo.Materia;

public class MateriaS implements IMateriaS{

	
	@Override
	public void incertar(Materia e) {
		// TODO Auto-generated method stub
		System.out.println("se inserto una materia");
	}

	@Override
	public Materia buscar(String id) {
		System.out.println("se ha encontrado la materia: "+ id);
		return null;
	}

	@Override
	public void actualizar(Materia e) {
		// TODO Auto-generated method stub
		System.out.println("se actualizo materia");
	}

	@Override
	public void eliminar(String id) {
		// TODO Auto-generated method stub
		System.out.println("se elimino la materia: "+id);
	}

}
