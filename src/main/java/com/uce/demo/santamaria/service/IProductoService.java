package com.uce.demo.santamaria.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import com.uce.demo.santamaria.modelo.Producto;

public interface IProductoService {
	
	public Producto incertarProducto(String nombre,String cantidad, BigDecimal valor,LocalDateTime fechaIngreso);
	public void actualizarProducto (Producto p);
	public Producto buscarProducto (String nombre);
	public void eliminar (String nombre);

}
