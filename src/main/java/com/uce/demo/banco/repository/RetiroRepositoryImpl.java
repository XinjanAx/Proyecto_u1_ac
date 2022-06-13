package com.uce.demo.banco.repository;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

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

	@Override
	public List<Retiro> consultar(String cuenta, LocalDateTime fechaInicio, LocalDateTime fechaFin) {
		List<Retiro> listaRetiros = new ArrayList<>();
        Retiro ret1 = new Retiro();
        ret1.setFechaRetiro(LocalDateTime.of(2022, 12, 20, 13, 34, 10));
        ret1.setMonto(new BigDecimal(25));
        ret1.setCuentaRetiro("1652");

        listaRetiros.add(ret1);

        return listaRetiros;
	}

}
