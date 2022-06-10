package com.uce.demo.banco.repository;

import org.springframework.stereotype.Repository;

import com.uce.demo.banco.modelo.Transferencia;

@Repository
public class TransferenciaRepositoryImpl  implements ITransferenciaRepository{

	@Override
	public void tranferir(Transferencia t) {
		// TODO Auto-generated method stub
		System.out.println("Se reaizo la tranferencia con exito: "+t);
	}

	@Override
	public void actualizarT(Transferencia t) {
		// TODO Auto-generated method stub
		System.out.println("Se actualizo la tranderencia");
	}

	@Override
	public Transferencia buscarTransferencia(String id) {
		Transferencia t = new Transferencia();
		t.setId(id);
		System.out.println("Se encontro la Tranferencia de id:"+id);
		return t;
	}

	@Override
	public void eliminarDep(String id) {
		// TODO Auto-generated method stub
		System.out.println("Se elimino la Tranferencia de id:"+id);
	}



	
}
