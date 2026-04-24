# Task Service

## Overview
Task Service handles task-related operations such as creating and retrieving tasks.

---

## Features
- Add Task
- View Tasks
- Stores task data in memory

---

## Port
Runs on: 8082

---

## API Endpoints

POST /tasks  
GET /tasks  

---

## How to Run

mvn spring-boot:run

Open:
http://localhost:8082

---

## Architecture Role

Task Service provides task data and is called by User Service using REST API.
