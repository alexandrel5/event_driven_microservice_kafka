# Event-Driven Microservices with Apache Kafka

> A robust, scalable event-driven microservices architecture built with modern backend patterns and Apache Kafka for asynchronous inter-service communication.

## 🏗️ Architecture Overview

This project demonstrates a distributed event-driven system where independent microservices communicate primarily through message streams using kafka. This approach decouples services, enhances system resilience, and improves scalability.

```
+------------------+          Produces Events        +------------------+
|                  | ------------------------------> |                  |
|  Microservice    |                                 |   Apache Kafka   |
|    Products      |                                 |  Message Broker  |
|   (Producer)     |                                 |                  |
|                  | <------------------------------ |                  |
+------------------+          Consumes Events        +------------------+
                                                                |
                                                                | Routes to Topics
                                                                v
                                                       +------------------+
                                                       |                  |
                                                       |  Microservice    |
                                                       |      Email       |
                                                       |   (Consumer)     |
                                                       |                  |
                                                       +------------------+

```

## 🚀 Key Features

* **Event-Driven Design:** Loosely coupled microservices communicating via asynchronous event streams.

* **Apache Kafka Integration:** High-throughput, low-latency fault-tolerant message streaming.

* **Scalability & Resilience:** Services can scale independently, and failures in one consumer do not cascade or block the producer.

* **Dockerized Environment:** Fully containerized setup for quick spinning up of brokers and services locally.

## 🛠️ Technology Stack

* **Messaging / Streaming:** Apache Kafka, KRaft

* **Backend Framework:**  *Spring Boot* 

* **Language:** *Java 17*

* **Containerization:** Docker & Docker Compose

## 📂 Project Structure

```
event_driven_microservice_kafka/
├── docker-compose.yml       # Infrastructure orchestration (Kafka, Zookeeper)
├── products-producer/       # Microservice responsible for publishing events
├── email-consumer/          # Microservice responsible for consuming and processing events
└── README.md                # Project documentation

```

## 
