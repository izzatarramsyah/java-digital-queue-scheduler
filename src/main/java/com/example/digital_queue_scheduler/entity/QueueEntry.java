package com.example.digital_queue_scheduler.entity;

import java.time.LocalDateTime;

import org.hibernate.annotations.Immutable;

import lombok.*;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Immutable
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Table(name = "queue_entry", schema = "digital_queue")
public class QueueEntry {
    
    @Id 
    private Long id;

    @ManyToOne(fetch = FetchType.EAGER)
@   JoinColumn(name = "queue_id")
    private Queue queue;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    private Integer queueNumber;

    private LocalDateTime joinedAt;

    private Boolean called = false;


}

