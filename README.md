# Digital Queue Scheduler

A backend scheduling service built with Spring Boot. Designed to work alongside the Digital Queue App, this service is responsible for periodically processing queue data and simulating real-time queue progression. It leverages **event-driven architecture** using **Kafka** and is secured using **JWT authentication**. This project serves as a sandbox to explore background job scheduling, Kafka consumers, and service-to-service integration in a distributed system.

---

## 📦 Tech Stack

- **Java Spring Boot 17**
- **Spring Scheduling**
- **Apache Kafka**
- **PostgreSQL**

---

## 🔧 Features

- ⏰ **Queue Auto-Progression** : Automatically calls the next user in the queue at scheduled intervals.
- 📣 **Kafka Consumer Integration** : Listens to events from the main app to stay in sync with queue state.
- 🔄 **Service-to-Service Messaging** : Seamlessly works with the core Digital Queue App through Kafka events.

---

## 🚀 Getting Started

### Prerequisites
- **Java 17** or higher
- **Maven**
- **PostgreSQL**
- **Kafka Broker running locally or via Docker**

### Installation

1. **Clone the repository:**
    ```bash
    git clone https://github.com/izzatarramsyah/java-digital-queue-scheduler
    cd java-digital-queue-scheduler
    ```

2. **Configure the database and Kafka:**
    - Create a new PostgreSQL database.
    - Ensure Kafka is running (you can use Docker for this).
    - Update the **`application.properties`** file with your PostgreSQL and Kafka configuration.

3. **Build and run the project:**
    ```bash
    mvn clean install
    mvn spring-boot:run
    ```

4. **Verify the scheduler is running:**
    - The app will log scheduled tasks and Kafka event handling to the console.

---
