package com.example.digital_queue_scheduler.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.digital_queue_scheduler.entity.QueueEntry;

public interface QueueEventRepository extends JpaRepository<QueueEntry, Long> {
    
    Optional<QueueEntry> findFirstByCalledFalseOrderByQueueNumberAsc();

}
