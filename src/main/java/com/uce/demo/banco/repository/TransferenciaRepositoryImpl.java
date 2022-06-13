package com.uce.demo.banco.repository;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

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

	@Override
	public List<Transferencia> consultar(String cuenta, LocalDateTime fechaInicio, LocalDateTime fechaFin) {
		List<Transferencia> listaConsultada = new ArrayList<>();
        Transferencia trans1 = new Transferencia();
        trans1.setFechaTransferencia(LocalDateTime.now());
        trans1.setMontoTransferir(new BigDecimal(100));
        trans1.setNumeroCuentaDestino("1234");
        trans1.setNumeroCuentaOrigen("12567");
        listaConsultada.add(trans1);
        return listaConsultada;
	}



	
}
