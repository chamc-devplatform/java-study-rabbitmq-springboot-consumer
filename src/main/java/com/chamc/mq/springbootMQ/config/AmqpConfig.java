package com.chamc.mq.springbootMQ.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AmqpConfig {
	
	public @Bean(name = "queue") Queue queue() {
		return new Queue("hello-queue", false);
	}
	
	public @Bean DirectExchange exchange() {
		return new DirectExchange("hello-direct", false ,true);
	}
	
	public @Bean Binding bindExchangeQueue(@Qualifier("queue") Queue queue, DirectExchange exchange) {
		return BindingBuilder.bind(queue).to(exchange).with("hello-route");
	}
}
