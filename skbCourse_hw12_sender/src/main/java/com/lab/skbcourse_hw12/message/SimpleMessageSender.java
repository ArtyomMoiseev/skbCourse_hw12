package com.lab.skbcourse_hw12.message;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

@Component
public class SimpleMessageSender {

    private final JmsTemplate jmsTemplate;

    @Autowired
    public SimpleMessageSender(JmsTemplate jmsTemplate) {
        this.jmsTemplate = jmsTemplate;
    }

    public void SendNumberMessage(String message) {
        jmsTemplate.convertAndSend("numbers", message);
    }
}
