package com.uce.demo.service;

import com.uce.demo.modelo.Estudiante;

public interface IEstudianteService {
	
//CRUD
//	C:crear/incertar
	public void incertarEstudiante(Estudiante e);
	
//	R: read/buscar
	public Estudiante buscarPorApellido(String apellido);
	
//	U:upgrade/actualizar
	public void actualizarEstudiante (Estudiante e);
	
//	D:delete/eliminar
	public void eliminarEstudiante (String id);

}
