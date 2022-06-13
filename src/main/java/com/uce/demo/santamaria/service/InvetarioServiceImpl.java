package com.uce.demo.santamaria.service;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.demo.santamaria.modelo.Inventario;
import com.uce.demo.santamaria.modelo.Producto;
import com.uce.demo.santamaria.repository.IInventarioRepository;

@Service
public class InvetarioServiceImpl implements IInventarioService{
	
	@Autowired
	private IInventarioRepository  invetarioR;
	
	@Override
	public void añadirProductoI(Producto p) {
		
		this.invetarioR.incertarProducto(p);
	}

	@Override
	public void crearInvetario(Inventario i) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actualizarInventario(Inventario i) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminar() {
			
	}

	@Override
	public void verInventario() {
		this.invetarioR.verInventario();	
	}

	@Override
	public void reporteFecha(LocalDateTime filtrado) {
		this.invetarioR.reporteFecha(filtrado);
	}
	
	

}
