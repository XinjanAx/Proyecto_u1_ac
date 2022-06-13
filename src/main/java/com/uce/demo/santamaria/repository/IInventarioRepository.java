package com.uce.demo.santamaria.repository;


import java.time.LocalDateTime;

import com.uce.demo.santamaria.modelo.Inventario;
import com.uce.demo.santamaria.modelo.Producto;

public interface IInventarioRepository {
	
	public void ingresarInventario(Inventario i);
	public void incertarProducto(Producto p);
	public void actualizarInventario (Inventario i);
	public void eliminar();
	public void reporteFecha(LocalDateTime filtrado);
	public void verInventario();
	
}
