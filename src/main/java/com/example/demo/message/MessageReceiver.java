package com.example.demo.message;

import com.example.demo.customer.Customer;
import com.example.demo.email.EmailService;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;

@RabbitListener(queues = "#{autoDeletedQueue.name}")
public class MessageReceiver {
    @Autowired
    EmailService emailService;

    @RabbitHandler
    public void receive(Customer customer) {
        System.out.println(customer);
        emailService.sendMessageToCustomer(customer);
    }

}
