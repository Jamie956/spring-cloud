package com.example.demo.mq;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Producer {
	@Autowired
	private AmqpTemplate ampqTemplate;

	public void send(String message) {
		ampqTemplate.convertAndSend("fanoutExchange", "", message);
	}
}
