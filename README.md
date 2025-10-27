#  Spring Boot Microservices Architecture  
### Featuring API Gateway | Service Registry (Eureka) | Admin Server | Multiple Microservices

---

##  Overview

This project demonstrates a **microservices-based architecture** built with **Spring Boot**.  
It includes key components like:

- **API Gateway (Spring Cloud Gateway):** Central entry point for routing client requests.  
- **Service Registry (Eureka Server):** Enables service discovery and dynamic scaling.  
- **Admin Server (Spring Boot Admin):** Monitors all registered microservices in real-time.  
- **Microservices ( Welcome-Service, Greet-Service):** Each handling a specific business domain.

This architecture ensures **loose coupling, scalability, and easy monitoring** of distributed systems.

---

---

## ⚙️ Tech Stack

| Component | Technology Used |
|------------|-----------------|
| Language | Java 17+ |
| Framework | Spring Boot 3.x |
| Service Registry | Spring Cloud Netflix Eureka |
| API Gateway | Spring Cloud Gateway |
| Monitoring | Spring Boot Admin |
| Database | MySQL|
| Build Tool | Maven |
| IDE |  STS |


---

##  Microservices Overview

| Service | Description | Port |
|----------|--------------|------|
| **Service Registry (Eureka)** | Central registry for all services | `8761` |
| **API Gateway** | Routes client requests to microservices | `8080` |
| **Admin Server** | Real-time monitoring dashboard | `9090` |
| **Welcome Service** | Manages users and authentication | `8081` |
| **Greet Service** | Handles product catalog and inventory | `8082` |

---




