package com.uce.demo.repository;

import org.springframework.stereotype.Repository;

import com.uce.demo.modelo.Estudiante;

@Repository
public class EstudianteRepositoryImpl implements IEstudianteRepository {

	@Override
	public void incertar(Estudiante e) {
		// TODO Auto-generated method stub
		System.out.println("se inserto");
	}

	@Override
	public Estudiante buscar(String apellido) {
		// TODO Auto-generated method stub
		System.out.println("se encontro a: "+apellido);
		return null;
	}

	@Override
	public void actualizar(Estudiante e) {
		// TODO Auto-generated method stub
		System.out.println("se actualizo");
	}

	@Override
	public void eliminar(String id) {
		// TODO Auto-generated method stub
		System.out.println("se elimino a: "+id);
	}

}
