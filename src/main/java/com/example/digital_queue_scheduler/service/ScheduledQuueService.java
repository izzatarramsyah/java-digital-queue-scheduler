package com.example.digital_queue_scheduler.service;

import java.time.LocalDateTime;
import java.util.Optional;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import com.example.digital_queue_scheduler.dto.QueueEventDTO;
import com.example.digital_queue_scheduler.entity.QueueEntry;
import com.example.digital_queue_scheduler.kafka.QueueEventProducer;
import com.example.digital_queue_scheduler.repository.QueueEventRepository;

@Service
public class ScheduledQuueService  {
    
    private final QueueEventProducer eventProducer;
    private final QueueEventRepository queueEventRepository;

    public ScheduledQuueService(QueueEventProducer eventProducer, QueueEventRepository queueEventRepository) {
        this.eventProducer = eventProducer;
        this.queueEventRepository = queueEventRepository;
    }
    
    @Scheduled(cron = "0 * * * * *") 
    public void callNextInQueue() {
        callNextQueue();
    }

    private void callNextQueue() {
        Optional<QueueEntry> next = queueEventRepository.findFirstByCalledFalseOrderByQueueNumberAsc();

        if (!next.isEmpty()) {
            QueueEntry queueEntry = next.get();

            QueueEventDTO queueEventDTO = new QueueEventDTO(
                "QUEUE_CALLING",  
                queueEntry.getUser().getId(),
                queueEntry.getUser().getFullname(),
                queueEntry.getQueue().getId(),
                queueEntry.getQueueNumber(),
                queueEntry.getJoinedAt()
            );
            eventProducer.SendQueueEvent(queueEventDTO);

        }

    }

}
