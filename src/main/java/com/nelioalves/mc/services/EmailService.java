package com.nelioalves.mc.services;

import org.springframework.mail.SimpleMailMessage;

import com.nelioalves.mc.domain.Pedido;

public interface EmailService {

	void sendOrderConfirmationEmail(Pedido obj);

	void sendEmail(SimpleMailMessage msg);
}
