package com.example.digital_queue_scheduler.kafka;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import com.example.digital_queue_scheduler.dto.QueueEventDTO;


@Component
public class QueueEventProducer {
    
    private final KafkaTemplate<String, QueueEventDTO> kafkaTemplate;

    public QueueEventProducer(KafkaTemplate<String, QueueEventDTO> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void SendQueueEvent(QueueEventDTO queueEventDOT) {
        kafkaTemplate.send("queue.event", queueEventDOT);
    }
    
}
