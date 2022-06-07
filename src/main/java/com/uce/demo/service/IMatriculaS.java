package com.uce.demo.service;

import com.uce.demo.modelo.Matricula;

public interface IMatriculaS {
	//CRUD
//	C:crear/incertar
	public void incertar(Matricula e);
	
//	R: read/buscar
	public Matricula buscar(String id);
	
//	U:upgrade/actualizar
	public void actualizar (Matricula e);
	
//	D:delete/eliminar
	public void eliminar (String id);

}
