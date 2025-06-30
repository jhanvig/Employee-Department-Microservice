## 🧩 Spring Boot Microservices Project: Employee-Department Management

This project demonstrates a microservices architecture using **Spring Boot**, consisting of multiple services communicating with each other through a **Service Registry** and **API Gateway**.

### 🏗️ Architecture Overview

This system is composed of the following services:

| Service            | Description                                                                 |
|--------------------|-----------------------------------------------------------------------------|
| **Service Registry** (Eureka) | Acts as a service discovery server where all services register.        |
| **Config Server**           | Centralized configuration server to externalize service settings. |
| **Department Service**      | Handles department-related CRUD operations.                        |
| **Employee Service**        | Handles employee-related CRUD operations.                          |
| **API Gateway**             | Acts as a unified entry point for routing requests to services.   |

---

## 🚀 How to Run the Project

### ✅ Prerequisites

- Java 17+
- Maven 3.8+
- Internet connection (for dependency download)
- Git

### ⬇️ Clone the Repository

```bash
git clone https://github.com/your-username/your-repo-name.git
cd your-repo-name
```

## 📂 Project Structure
springboot-microservices/
│
├── api-gateway/
├── config-server/
├── department-service/
├── employee-service/
├── service-registry/

## 🧪 Service Startup Order
Start the services in the following order:

1) Service Registry (Eureka)

2) Config Server

3) Department Service

4) Employee Service

5) API Gateway

Each service can be started by navigating into its folder and running:

bash
``./mvnw spring-boot:run``

or (Windows):
bash
``mvn spring-boot:run``

## 🔗 API Endpoints
Example endpoints via API Gateway:

GET /employees/...

POST /employees/...

GET /departments/...

POST /departments/...

## 🛠️ Tech Stack
Java 17

Spring Boot

Spring Cloud (Eureka, Config)

Spring Web

Spring Data JPA

Maven

👤 Author
Jhanvi Gopal

📧 jhanugopal11@gmail.com

🌐 LinkedIn - www.linkedin.com/in/jhanvi-gopal

