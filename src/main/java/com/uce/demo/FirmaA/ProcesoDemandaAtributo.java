package com.uce.demo.FirmaA;

import java.time.LocalDate;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProcesoDemandaAtributo {
	
	private LocalDate fechaJuicio;
	@Autowired
	private Demandante dte;
	@Autowired
	private Demandado ddo;
	
	public void demandar(LocalDate fecha,String idE,String nombreE,String apellidoE,String ciudadE, String Causa, int edadE,
			                String idO,String nombreO,String apellidoO,String ciudadO, int edadO) {
		
		this.dte.setId(idE);
		this.dte.setNombre(nombreE);
		this.dte.setApellido(apellidoE);
		this.dte.setCiudad(ciudadE);
		this.dte.setEdad(edadE);
		
		this.ddo.setId(idO);
		this.ddo.setNombre(nombreO);
		this.ddo.setApellido(apellidoO);
		this.ddo.setCiudad(ciudadO);
		this.ddo.setEdad(edadO);
		
		this.dte.setCausa(Causa);
		this.ddo.setDelito(Causa);
		
		this.fechaJuicio = fecha;
		
		System.out.println("");
		System.out.println( "Demanda en el sistema Judicla (Atributo)");
	}

	@Override
	public String toString() {
		return "ProcesoDemandaAtributo [fechaJuicio=" + fechaJuicio + ", " + dte + ", " + ddo + "]";
	}


	
	
	
	

}
