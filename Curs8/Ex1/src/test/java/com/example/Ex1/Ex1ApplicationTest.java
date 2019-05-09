package com.example.Ex1;

import com.example.Ex1.Sender.MessageSender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest

public class Ex1ApplicationTest {

    @Value(("${destination.queue}"))
    private String destination;

    @Autowired
    private MessageSender sender;

    @Test
    public void testReceive() throws Exception {
        sender.send(destination,"Hello Spring Jms ActiveMQ!");
    }
}