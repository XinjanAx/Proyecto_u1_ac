package com.uce.demo.service;


import org.springframework.beans.factory.annotation.Lookup;

import com.uce.demo.modelo.Materia;
import com.uce.demo.modelo.ProfesorGeneral;

public interface IMateriaS {
	//CRUD
//	C:crear/incertar
	public void incertar(Materia e);
	
//	R: read/buscar
	public Materia buscar(String id);
	
//	U:upgrade/actualizar
	public void actualizar (Materia e);
	
//	D:delete/eliminar
	public void eliminar (String id);


}

