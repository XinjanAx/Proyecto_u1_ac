package com.uce.demo.banco.repository;

import org.springframework.stereotype.Repository;

import com.uce.demo.banco.modelo.Retiro;

@Repository
public class RetiroRepositoryImpl implements IRetiroRepository{

	@Override
	public void incertar(Retiro r) {
		// TODO Auto-generated method stub
		System.out.println("Se incerto un returo "+r);
	}

	@Override
	public void actualizar(Retiro r) {
		// TODO Auto-generated method stub
		System.out.println("Se actualizo el retiro "+r);
	}
	
	@Override
	public Retiro buscar(String id) {
		// TODO Auto-generated method stub
		Retiro rNew = new Retiro();
		rNew.setId(id);
		System.out.println("Se econtro el retiro: "+ rNew);
		return rNew;
	}


	@Override
	public void eliminar(String id) {
		// TODO Auto-generated method stub
		System.out.println("Se elimino el retiro:"+id);
	}

}
