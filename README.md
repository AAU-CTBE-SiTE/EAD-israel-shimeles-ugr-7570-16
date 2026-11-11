# Lab 6: Aspect-Oriented Programming (AOP) in Spring Boot


* Name: Israel Shimeles
* ID: UGR/7570/16


---

## Overview
This laboratory exercise implements Aspect-Oriented Programming (AOP) within the existing Spring Boot CRUD application. The goal is to cleanly separate cross-cutting concerns—specifically logging execution times and method tracking—from core business logic inside the controller layer.

---

## Implementation Details

### 1. Dependencies Added
* Integrated spring-boot-starter-aop into pom.xml to enable Spring's runtime weaving and proxy-based AOP features.

### 2. Logging Aspect (LoggingAspect.java)
* Created a component aspect targeting the ActorController class.
* Pointcut: Intercepts all public execution methods inside ActorController.
* **Advice (@Before):** Logs incoming method calls prior to execution alongside their signature names.
* **Advice (@AfterReturning):** Triggers upon successful method completion to log output results.
---
