package com.microservices.elit.messaging;


import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservices.elit.model.MontantCRUD;




@Service
public class RabbitMaintenanceMessagingService
        {
  
  private RabbitTemplate rabbit;
  
  @Autowired
  public RabbitMaintenanceMessagingService(RabbitTemplate rabbit) {
    this.rabbit = rabbit;
  }
  
  public void sendQtPrix(MontantCRUD test) {
	try {  
	new Queue("Montant.queue");}
	catch(Exception e) {}
    rabbit.convertAndSend("Montant.queue", test);
  }
  
}