package com.uce.demo.santamaria.repository;

import com.uce.demo.santamaria.modelo.Producto;

public interface IProductoRepository {
	
	public void incertarProducto(Producto p);
	public void actualizarProducto (Producto p);
	public Producto buscarProducto (String nombre);
	public void eliminar (String nombre);
}
