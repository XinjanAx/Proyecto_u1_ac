package com.uce.demo.santamaria.service;

import java.time.LocalDateTime;

import com.uce.demo.santamaria.modelo.Inventario;
import com.uce.demo.santamaria.modelo.Producto;

public interface IInventarioService{
	
	public void añadirProductoI(Producto p);
	public void crearInvetario(Inventario i);
	public void actualizarInventario (Inventario i);
	public void eliminar();
	public void verInventario();
	public void reporteFecha(LocalDateTime filtrado);
	
}
