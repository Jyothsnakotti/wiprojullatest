package com.wipro.payment_ms.kafka;
 
import com.wipro.payment_ms.model.PaymentRequest;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
 
@Service
public class KafkaConsumerService {
 
    private final KafkaTemplate<String, String> kafkaTemplate;
 
    private static final String T2_TOPIC = "T2";
 
    public KafkaConsumerService(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }
 
    @KafkaListener(topics = "T1", groupId = "payment-group", containerFactory = "kafkaListenerContainerFactory")
    public void consumePaymentRequest(PaymentRequest paymentRequest) {
        System.out.println("Received payment request: " + paymentRequest.getBookingId());
 
        boolean paymentSuccess = simulatePayment(paymentRequest);
 
        String result = paymentRequest.getBookingId() + ":" + (paymentSuccess ? "SUCCESS" : "FAILED");
 
        kafkaTemplate.send(T2_TOPIC, result);
        System.out.println("Sent payment status to T2: " + result);
    }
 
    private boolean simulatePayment(PaymentRequest request) {
        return Math.random() < 0.8;
    }
}