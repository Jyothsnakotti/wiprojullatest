package com.example.kafka.controller;

import com.example.kafka.model.Subject;
import com.example.kafka.service.ProducerService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/produce")
public class ProducerController {

    private final ProducerService producerService;

    public ProducerController(ProducerService producerService) {
        this.producerService = producerService;
    }

    @PostMapping
    public String sendSubject(@RequestBody Subject subject) {
        producerService.sendSubject(subject);
        return "Message sent to Kafka";
    }
}
