package com.example.Kafkademo.Service;

import org.hibernate.annotations.SecondaryRow;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class Producer {

        @Autowired
        KafkaTemplate<String,String> kafkaTemplate;

        public void sendMessageToTopic(String message)
        {
            kafkaTemplate.send("codedecode-topic",message);
        }

}
