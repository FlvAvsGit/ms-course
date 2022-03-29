package com.flavio.hrpayroll.service;

import org.springframework.stereotype.Service;

import com.flavio.hrpayroll.entities.Payment;

@Service
public class PaymentService {
	
	public Payment getPayment(Long workerId, Integer days) {
		Payment pay =  new Payment("Teste", 150.00, days);
		return pay;
	}
}
