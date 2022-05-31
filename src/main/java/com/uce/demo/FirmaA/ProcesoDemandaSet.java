package com.uce.demo.FirmaA;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProcesoDemandaSet {

	private LocalDate fechaJuicio;

	private Demandante dte;
	private Demandado ddo;

	public ProcesoDemandaSet(Demandante dte, Demandado ddo) {
		this.dte = dte;
		this.ddo = ddo;
	}

	public void demandar(LocalDate fecha, String idE, String nombreE, String apellidoE, String ciudadE, String Causa,
			int edadE, String idO, String nombreO, String apellidoO, String ciudadO, int edadO) {

		this.dte.setId(idO);
		this.dte.setNombre(nombreE);
		this.dte.setApellido(apellidoE);
		this.dte.setCiudad(ciudadE);
		this.dte.setEdad(edadE);

		this.ddo.setId(idO);
		this.ddo.setNombre(nombreE);
		this.ddo.setApellido(apellidoE);
		this.ddo.setCiudad(ciudadE);
		this.ddo.setEdad(edadE);

		this.dte.setCausa(Causa);
		this.ddo.setDelito(Causa);

		this.fechaJuicio = fecha;
		System.out.println("");
		System.out.println( "Demanda en el sistema Judicla (Set)");
	}
	
	

	public Demandante getDte() {
		return dte;
	}

	public Demandado getDdo() {
		return ddo;
	}
	@Autowired
	public void setDte(Demandante dte) {
		this.dte = dte;
	}
	@Autowired
	public void setDdo(Demandado ddo) {
		this.ddo = ddo;
	}

	@Override
	public String toString() {
		return "ProcesoDemandaSet [fechaJuicio=" + fechaJuicio + ", " + dte + ", " + ddo + "]";
	}
}
