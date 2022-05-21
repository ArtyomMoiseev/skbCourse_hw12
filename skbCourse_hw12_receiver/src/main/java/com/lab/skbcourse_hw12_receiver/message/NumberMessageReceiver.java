package com.lab.skbcourse_hw12_receiver.message;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class NumberMessageReceiver {

    @JmsListener(destination = "numbers")
    public void processNumberMessage(String content) {
        System.out.println(String.format("Received message: %s", content));
    }
}
