package com.uce.demo.santamaria.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.demo.santamaria.modelo.Producto;


@Service
public class ProductoServiceImpl implements IProductoService{
	
 
	
	@Override
	public Producto incertarProducto(String nombre, String cantidad, BigDecimal valor, LocalDateTime fechaIngreso) {
		
		
		
		GestorInventario gestorI = new GestorInventario();
		Producto p= new Producto();
		
		p.setNombre(nombre);
		p.setCantidad(cantidad);
		p.setValor(gestorI.calculoPV(valor));
		p.setFechaIngreso(fechaIngreso);
		
		return p;
	}

	@Override
	public void actualizarProducto(Producto p) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Producto buscarProducto(String nombre) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void eliminar(String nombre) {
		// TODO Auto-generated method stub
		
	}

}
