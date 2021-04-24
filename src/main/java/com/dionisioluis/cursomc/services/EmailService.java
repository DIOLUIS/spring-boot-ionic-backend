package com.dionisioluis.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import com.dionisioluis.cursomc.domain.Pedido;

public interface EmailService {
	
	void sendOrderConfimationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);

}
