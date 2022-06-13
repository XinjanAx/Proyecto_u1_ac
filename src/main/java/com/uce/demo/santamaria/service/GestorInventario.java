package com.uce.demo.santamaria.service;

import java.math.BigDecimal;

public class GestorInventario {
	
	private double pv;
	
	public BigDecimal calculoPV (BigDecimal pc) {
		
		pv = pc.doubleValue() + pc.doubleValue()*(0.10) + pc.doubleValue()*(0.12);
		
		return new BigDecimal(pv);	
	}	
}
