package com.uce.demo.consultorio;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CitaMedica {

//1)Inyeccion por atributos
//@Autowired
	private LocalDateTime fechaCita;
	private Doctor doc;
	private Paciente pasiente;
	
//2)Inyeccion por constructor
	public CitaMedica(Doctor doc, Paciente pasiente) {
		super();
		this.doc = doc;
		this.pasiente = pasiente;
	}

	public String agendar(LocalDateTime fechaCita,String nombreP, String aellidoP,
							String ciudadP, int edadP,String nombreD, String apellidoD){
		
		this.pasiente.setNombre(nombreP);
		this.pasiente.setApellido(aellidoP);
		this.pasiente.setEdad(edadP);
		this.pasiente.setCiudad(ciudadP);
		
		this.doc.setNombre(nombreD);
		this.doc.setApellido(apellidoD);
		
		this.fechaCita = fechaCita;
		
		return "Cita adendada";
	}
	
	@Override
	public String toString() {
		return "CitaMedica [fechaCita=" + fechaCita + ", doc=" + doc + ", pasiente=" + pasiente + "]";
	}
	
	
	
}
