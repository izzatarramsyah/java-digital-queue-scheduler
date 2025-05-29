package com.example.digital_queue_scheduler;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class DigitalQueueSchedulerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DigitalQueueSchedulerApplication.class, args);
	}

}
