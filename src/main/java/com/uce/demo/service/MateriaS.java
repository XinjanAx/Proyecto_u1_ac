package com.uce.demo.service;


import org.springframework.stereotype.Service;
import com.uce.demo.modelo.Materia;


@Service
public class MateriaS implements IMateriaS{

	
	@Override
	public void incertar(Materia e) {
		// TODO Auto-generated method stub
		System.out.println("se inserto una materia "+ e);
	}

	@Override
	public Materia buscar(String id) {
		System.out.println("se ha encontrado la materia: "+ id);
		return null;
	}

	@Override
	public void actualizar(Materia e) {
		// TODO Auto-generated method stub
		System.out.println("se actualizo materia "+ e);
	}

	@Override
	public void eliminar(String id) {
		// TODO Auto-generated method stub
		System.out.println("se elimino la materia: "+id);
	}

}
