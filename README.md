Task Service - Microservices (Week 6)

Overview
Task Service is a Spring Boot microservice that manages tasks.
It uses MySQL for persistence and includes validation and exception handling.

Features
- Create tasks
- Fetch all tasks
- MySQL database integration
- JPA and Hibernate ORM
- Input validation using NotBlank
- Global exception handling

Tech Stack
- Java 17
- Spring Boot
- MySQL
- Spring Data JPA
- Maven

Run Application
mvn spring-boot:run

API Endpoints

Add Task
POST /tasks

Request Body
{
  "task": "Complete Week 6"
}

Get Tasks
GET /tasks

Validation
- Task cannot be empty

Database
- Database name: microservices_db
- Table: task

Architecture

Client (Postman)
      |
      v
Task Service (8082)
      |
      v
MySQL Database
