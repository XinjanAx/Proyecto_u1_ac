package com.uce.demo.repository;

import com.uce.demo.modelo.Estudiante;

public interface IEstudianteRepository {
//CRUD
//	C:crear/incertar
	public void incertar(Estudiante e);
	
//	R: read/buscar
	public Estudiante buscar(String apellido);
	
//	U:upgrade/actualizar
	public void actualizar (Estudiante e);
	
//	D:delete/eliminar
	public void eliminar (String id);
}
