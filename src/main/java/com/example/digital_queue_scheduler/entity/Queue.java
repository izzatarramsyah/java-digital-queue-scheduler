package com.example.digital_queue_scheduler.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Table(name = "queue", schema = "digital_queue")
public class Queue {
    
    @Id @GeneratedValue
    private Long id;

    private String name;

    private String description;

    private Boolean active = true;

}
