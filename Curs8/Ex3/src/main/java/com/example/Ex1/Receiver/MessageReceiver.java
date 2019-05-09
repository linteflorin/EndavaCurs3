package com.example.Ex1.Receiver;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class MessageReceiver {

    @JmsListener(destination = "${destination.queue}")
    public void receiveMessage(String msg){

        System.out.println("Message Recevied by listener 2:" + msg);
        System.out.println();
        System.out.println();

    }
}
