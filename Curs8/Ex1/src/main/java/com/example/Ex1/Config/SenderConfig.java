package com.example.Ex1.Config;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.core.JmsTemplate;

@Configuration
public class SenderConfig {

    @Value("${activemq.broker-url}")
    private String brokerUrl;

    @Bean
    public ActiveMQConnectionFactory senderActiveMQConnectionFactory(){
        ActiveMQConnectionFactory activeMQConnectionFactory =new ActiveMQConnectionFactory();
        activeMQConnectionFactory.setBrokerURL(brokerUrl);
        return activeMQConnectionFactory;
    }

    @Bean
    public JmsTemplate jmsTemplate(){

        JmsTemplate jmsTemplate = new JmsTemplate(senderActiveMQConnectionFactory());
        jmsTemplate.setPubSubDomain(true);

        return jmsTemplate;

    }
}
