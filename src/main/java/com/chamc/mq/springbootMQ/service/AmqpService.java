package com.chamc.mq.springbootMQ.service;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;


@Service
public class AmqpService {
	
	@RabbitListener(queues = "hello-queue")
	public void consumeTest(String user) {
		System.out.println("收到了:" + user);
	}
}
