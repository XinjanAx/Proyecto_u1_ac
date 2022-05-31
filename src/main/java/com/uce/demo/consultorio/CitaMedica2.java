package com.uce.demo.consultorio;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CitaMedica2 {
	
	private LocalDateTime fechaCita;

	private Doctor doc;		// a los set @Autowired

	private Paciente pasiente;   // a los set @Autowired
	

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

	public Doctor getDoc() {
		return doc;
	}

	public Paciente getPasiente() {
		return pasiente;
	}
	@Autowired
	public void setDoc(Doctor doc) {
		this.doc = doc;
	}
	@Autowired
	public void setPasiente(Paciente pasiente) {
		this.pasiente = pasiente;
	}

	@Override
	public String toString() {
		return "CitaMedica [fechaCita=" + fechaCita + ", doc=" + doc + ", pasiente=" + pasiente + "]";
	}
	
	
	
}
