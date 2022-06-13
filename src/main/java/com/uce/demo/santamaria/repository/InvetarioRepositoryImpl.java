package com.uce.demo.santamaria.repository;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.uce.demo.santamaria.modelo.Inventario;
import com.uce.demo.santamaria.modelo.Producto;


@Repository
public class InvetarioRepositoryImpl implements IInventarioRepository{

	private Inventario inventario = new Inventario();
	private Inventario inventarioFiltrado = new Inventario();
	
	@Override
	public void incertarProducto(Producto p) {
		// TODO Auto-generated method stub
		this.inventario.addProfucto(p);
	}

	@Override
	public void ingresarInventario(Inventario i) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actualizarInventario(Inventario i) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminar() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void verInventario() {
		// TODO Auto-generated method stub
		System.out.println(this.inventario.toString());
	}
	
		@Override
	public void reporteFecha(LocalDateTime filtrado) {
		// TODO Auto-generated method stub		
		for(Producto p : this.inventario.getInventario()){
			if(p.getFechaIngreso().isAfter(filtrado)) {
				this.inventarioFiltrado.addProfucto(p);
			}
		}
		System.out.println("\nFriltrado por fecha: "+filtrado);
		System.out.println(this.inventarioFiltrado.toString());	
	}
	

}
