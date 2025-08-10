package com.example.kafka.service;

import com.example.kafka.model.Subject;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class ProducerService {

    private static final String TOPIC = "learn-subject";

    private final KafkaTemplate<String, Subject> kafkaTemplate;

    public ProducerService(KafkaTemplate<String, Subject> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendSubject(Subject subject) {
        kafkaTemplate.send(TOPIC, subject);
        System.out.println("Sent message: " + subject);
    }
}
