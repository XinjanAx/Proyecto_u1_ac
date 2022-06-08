package com.uce.demo.service;

import org.springframework.stereotype.Service;

import com.uce.demo.modelo.Estudiante;

@Service
public class EstudianteServiceImpl implements IEstudianteService{

	@Override
	public void incertarEstudiante(Estudiante e) {
		// TODO Auto-generated method stub
		System.out.println("se inserto un nuevos Estudiante");
	}

	@Override
	public Estudiante buscarPorApellido(String apellido) {
		System.out.println("se ha encontrado en la base el estudiante: "+ apellido);
        Estudiante e = new Estudiante();
        e.setApellido(apellido);
        return e;
	}

	@Override
	public void actualizarEstudiante(Estudiante e) {
		// TODO Auto-generated method stub
		System.out.println("se actualizo");
	}

	@Override
	public void eliminarEstudiante(String id) {
		// TODO Auto-generated method stub
		System.out.println("se elimino a: "+id);
	}

}
