package com.uce.demo.banco.repository;

import java.time.LocalDateTime;
import java.util.List;
import com.uce.demo.banco.modelo.Retiro;

public interface IRetiroRepository {
	
		public void incertar(Retiro r);
		public void actualizar (Retiro r);
		public Retiro buscar (String id);
		public void eliminar (String id);
		public List<Retiro> consultar(String cuenta, LocalDateTime fechaInicio, LocalDateTime fechaFin);

}
