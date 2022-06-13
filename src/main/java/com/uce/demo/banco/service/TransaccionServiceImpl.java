package com.uce.demo.banco.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.demo.banco.modelo.Deposito;
import com.uce.demo.banco.modelo.Retiro;
import com.uce.demo.banco.modelo.Transferencia;
import com.uce.demo.banco.repository.IDepositoRepository;
import com.uce.demo.banco.repository.IRetiroRepository;
import com.uce.demo.banco.repository.ITransferenciaRepository;
import com.uce.demo.banco.to.TransaccionTo;

@Service
public class TransaccionServiceImpl implements ITransaccionService {

//	@Autowired
//	private ITransaccionService iTranfereciaService;
//	@Autowired
//	private IDepositoService iDepositoService;
//	@Autowired
//	private IRetiroService iRetiroService;
//
//	@Autowired
//	private ITransferenciaRepository iTransferenciaRepository;
//	@Autowired
//	private IDepositoRepository iDepositoRepository;
//	@Autowired
//	private IRetiroRepository iRetiroRepository;

	@Override
	public void transferencia(String origen, String destino, BigDecimal monto) {
		// TODO Auto-generated method stub
//		this.iTranfereciaService.transferencia(origen, destino, monto);
	}

	@Override
	public void deposito(String id, String destino, BigDecimal monto) {

//		this.iDepositoService.realizarDeposito(id, destino, monto);

	}

	@Override
	public void retiro(String id,String ctaRetiro, String numTarjeta, BigDecimal monto) {

//		this.iRetiroService.realizarRetiro(id,ctaRetiro,numTarjeta, monto);

	}

	@Override
	public List<TransaccionTo> consultar(String cuenta, LocalDateTime fechaInicio, LocalDateTime fechaFin) {
//		List<Transferencia> listaTrans = this.iTransferenciaRepository.consultar(cuenta, fechaInicio, fechaFin);
//		List<Deposito> listaDepo = this.iDepositoRepository.consultar(cuenta, fechaInicio, fechaFin);
//		List<Retiro> listaRet = this.iRetiroRepository.consultar(cuenta, fechaInicio, fechaFin);
//
//		// Vamos a unir todas las listas
//		List<TransaccionTo> listaFinal = new ArrayList<>();
//
//		for (Transferencia t : listaTrans) {
//			TransaccionTo transaccionTo = this.trasformar(t);
//			listaFinal.add(transaccionTo);
//		}
//
//		for (Deposito d : listaDepo) {
//			TransaccionTo transaccionTo = this.transformar(d);
//			listaFinal.add(transaccionTo);
//		}
//
//		for (Retiro r : listaRet) {
//			TransaccionTo transaccionTo = this.transformar(r);
//			listaFinal.add(transaccionTo);
//		}

		return null;   //cambio
		
	}

	private TransaccionTo trasformar(Transferencia transferencia) {

		TransaccionTo tranTo = new TransaccionTo();
//		tranTo.setFecha(transferencia.getFechaTransferencia());
//		tranTo.setMonto(transferencia.getMontoTransferir());
//		tranTo.setTipo("T");

		return tranTo;

	}

	private TransaccionTo transformar(Deposito deposito) {

		TransaccionTo tranTo = new TransaccionTo();
//		tranTo.setFecha(deposito.getFechaDeposito());
//		tranTo.setMonto(deposito.getMonto());
//		tranTo.setTipo("D");

		return tranTo;
	}

	private TransaccionTo transformar(Retiro retiro) {

		TransaccionTo tranTo = new TransaccionTo();
//		tranTo.setFecha(retiro.getFechaRetiro());
//		tranTo.setMonto(retiro.getMonto());
//		tranTo.setTipo("R");

		return tranTo;

	}
}