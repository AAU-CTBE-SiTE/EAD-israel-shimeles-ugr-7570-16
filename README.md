# Lab 9: Microservices (customer_service & order_service)

- Student Name: Israel Shimeles
- Student ID: ugr/7570/16
- Course: Enterprise Application Development (EAD)
- Branch: lab-9

## Project Structure

This repository contains two separate Spring Boot services inside microservice_projects:

- customer_service/ — Runs on port 8080 and uses an H2 database.
- order_service/ — Runs on port 9090 and uses MongoDB.

## Running the Services

1. Start MongoDB locally for order_service.
2. Run customer_service (port 8080).
3. Run order_service (port 9090).

## Endpoints

- Customers: http://localhost:8080/api/customers
- Orders: http://localhost:9090/api/orders
