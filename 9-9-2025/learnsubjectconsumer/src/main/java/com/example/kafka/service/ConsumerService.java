package com.example.kafka.service;

import com.example.kafka.model.Subject;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class ConsumerService {

    @KafkaListener(topics = "learn-subject", groupId = "subject-group")
    public void consumeSubject(Subject subject) {
        System.out.println("Consumed Subject: " + subject);
    }
}
