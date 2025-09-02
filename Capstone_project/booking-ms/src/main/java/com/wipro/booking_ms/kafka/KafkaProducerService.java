package com.wipro.booking_ms.kafka;
 
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
import com.wipro.booking_ms.model.PaymentRequest;
 
@Service
public class KafkaProducerService {
 
    private static final Logger logger = LoggerFactory.getLogger(KafkaProducerService.class);
    private static final String TOPIC = "T1";
 
    private final KafkaTemplate<String, PaymentRequest> kafkaTemplate;
 
    public KafkaProducerService(KafkaTemplate<String, PaymentRequest> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }
 
    public void sendPaymentRequest(PaymentRequest request) {
        logger.info("Sending payment request to Kafka topic {}: {}", TOPIC, request);
        kafkaTemplate.send(TOPIC, request);
    }
}