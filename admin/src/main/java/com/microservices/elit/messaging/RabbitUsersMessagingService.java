package com.microservices.elit.messaging;

import org.springframework.amqp.AmqpException;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessagePostProcessor;
import org.springframework.amqp.core.MessageProperties;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservices.elit.model.UsersCRUD;

@Service
public class RabbitUsersMessagingService
        {
  
  private RabbitTemplate rabbit;
  
  @Autowired
  public RabbitUsersMessagingService(RabbitTemplate rabbit) {
    this.rabbit = rabbit;
  }
  
  public void sendUsers(UsersCRUD test) {
	try {  
	new Queue("Users.queue");}
	catch(Exception e) {}
    rabbit.convertAndSend("Users.queue", test);
  }
  
}