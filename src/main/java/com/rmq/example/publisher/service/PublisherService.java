package com.rmq.example.publisher.service;

import com.fasterxml.jackson.core.io.JsonEOFException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.rmq.example.publisher.model.QueueMessage;
import jakarta.annotation.PostConstruct;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PublisherService {

    ObjectMapper objectMapper;
    @Autowired
    private RabbitTemplate rabbitTemplate;


    public void   publishText(String message, String queueName){
        System.out.println(message);
        rabbitTemplate.convertAndSend(queueName, message);

    }

    public void publishJsonMessage(String message, String queueName) {
        QueueMessage msgObject =  (QueueMessage) jsonToObject(message, QueueMessage.class);
        rabbitTemplate.convertAndSend(queueName, jsonToNode(msgObject));

    }
    private JsonNode jsonToNode(String jsonObject){
        return objectMapper.valueToTree(jsonObject);


    }
    private Object JsonObject(String JsonString, Class<?> clazz){
        try{
            return objectMapper.readValue(JsonString, clazz);
        }catch (JsonEOFException e){
           throw new RuntimeException(e);
        }
        @PostConstruct
        public void init() {
            ObjectMapper = new ObjectMapper();
        }
    }
}
