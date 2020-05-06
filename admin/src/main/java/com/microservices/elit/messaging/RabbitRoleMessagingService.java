package com.microservices.elit.messaging;

import org.springframework.amqp.AmqpException;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessagePostProcessor;
import org.springframework.amqp.core.MessageProperties;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservices.elit.model.RoleCRUD;

@Service
public class RabbitRoleMessagingService
        {
  
  private RabbitTemplate rabbit;
  
  @Autowired
  public RabbitRoleMessagingService(RabbitTemplate rabbit) {
    this.rabbit = rabbit;
  }
  
  public void sendRole(RoleCRUD test) {
	try {  
	new Queue("Role.queue");}
	catch(Exception e) {}
    rabbit.convertAndSend("Role.queue", test);
  }
  
}