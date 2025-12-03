package com.rmq.example.publisher.config;

import org.springframework.amqp.rabbit.config.SimpleRabbitListenerContainerFactory;
import org.springframework.amqp.rabbit.connection.CachingConnectionFactory;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;

@Configuration
public class RabbirMQConfig {
    @Value("${rabbitmq.host}")
    private String hostName;

    @Value("${rabbitmq.port})
    private int port;

    @Value("${rabbirmq.userName}")
    private String userName;

    @Value("${rabbitmq.password}")
    private String password;

    @Value("${rabbitmq.queuename}")
    private String queueName;

    @Bean
    public CathingConnectionFactory connectionFactory() throws Exception{
        CachingConnectionFactory connectionFactory=new CachingConnectionFactory(hostName);
        connectionFactory.setUsername(userName);
        connectionFactory.setPassword(password);
        connectionFactory.setPort(port);
        return connectionFactory;

    }
    @Bean
    public RabbitTemplate rabbitTemplate() throws Exception{
        RabbitTemplate rabbitTemplate = new RabbitTemplate(connectionFactory());
        return rabbitTemplate;
    }

}
