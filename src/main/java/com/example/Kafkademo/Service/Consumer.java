package com.example.Kafkademo.Service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {

    @KafkaListener(topics = "codedecode-topic", groupId = "group_id")//fault tolerance,scalibi
    public void listenToTopic(String message) {
        System.out.println("Message received from topic : " + message);
    }
}
