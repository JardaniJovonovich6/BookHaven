# BookHaven Backend - Brain Document

## Overview
BookHaven is a hotel booking application built with Spring Boot. This document provides a high-level overview of the backend structure, features, and dependencies.

## File Structure

```
src/
├── main/
│   ├── java/app/aman/BookHaven/
│   │   ├── advice/               # Exception handling and global responses
│   │   ├── config/               # Configuration classes
│   │   ├── controller/           # REST API controllers
│   │   ├── dto/                  # Data Transfer Objects
│   │   ├── entity/               # JPA entities
│   │   │   └── enums/           # Enumerations
│   │   ├── repository/           # JPA repositories
│   │   ├── security/             # Security configuration
│   │   ├── service/              # Service interfaces
│   │   │   └── impl/            # Service implementations
│   │   └── strategy/             # Pricing strategies
│   └── resources/
│       └── application.yaml     # Application configuration
└── test/                        # Test classes
```

## Features

### 1. Authentication
- **Endpoints:**
  - `POST /api/v1/auth/login` - User login
  - `POST /api/v1/auth/signup` - User signup
- **Security:**
  - JWT-based authentication
  - Role-based access control (GUEST, HOTEL_MANAGER)

### 2. Hotel Management
- **Endpoints:**
  - `GET /api/v1/hotels` - List all hotels
  - `GET /api/v1/hotels/{id}` - Get hotel details
  - `POST /api/v1/hotels` - Create a new hotel (Admin only)
  - `PUT /api/v1/hotels/{id}` - Update hotel details (Admin only)
  - `DELETE /api/v1/hotels/{id}` - Delete a hotel (Admin only)

### 3. Room Management
- **Endpoints:**
  - `GET /api/v1/rooms` - List all rooms
  - `GET /api/v1/rooms/{id}` - Get room details
  - `POST /api/v1/rooms` - Create a new room (Admin only)
  - `PUT /api/v1/rooms/{id}` - Update room details (Admin only)
  - `DELETE /api/v1/rooms/{id}` - Delete a room (Admin only)

### 4. Booking Management
- **Endpoints:**
  - `POST /api/v1/bookings` - Create a new booking
  - `GET /api/v1/bookings/{id}` - Get booking details
  - `PUT /api/v1/bookings/{id}` - Update booking details
  - `DELETE /api/v1/bookings/{id}` - Cancel a booking
  - `POST /api/v1/bookings/{id}/payments` - Initiate payment for a booking

### 5. Payment Management
- **Endpoints:**
  - `POST /api/v1/payments/webhook` - Stripe webhook for payment processing
  - `GET /api/v1/payments/success` - Payment success page
  - `GET /api/v1/payments/failure` - Payment failure page

### 6. Inventory Management
- **Endpoints:**
  - `GET /api/v1/inventory` - List all inventory
  - `GET /api/v1/inventory/{id}` - Get inventory details
  - `POST /api/v1/inventory` - Create a new inventory (Admin only)
  - `PUT /api/v1/inventory/{id}` - Update inventory details (Admin only)
  - `DELETE /api/v1/inventory/{id}` - Delete an inventory (Admin only)

### 7. Pricing Strategies
- **Strategies:**
  - Base Pricing
  - Holiday Pricing
  - Occupancy Pricing
  - Surge Pricing
  - Urgency Pricing

## Authentication Features

### 1. JWT Authentication
- **Token Generation:**
  - JWT tokens are generated upon successful login.
  - Tokens are signed with a secret key and have an expiration time.

### 2. Role-Based Access Control
- **Roles:**
  - `GUEST`: Default role for users.
  - `HOTEL_MANAGER`: Role for hotel managers with additional privileges.

### 3. Security Configuration
- **Security Filters:**
  - JWT authentication filter to validate tokens.
  - Authorization filter to check user roles.

## Third-Party Dependencies

### 1. Stripe
- **Purpose:** Payment processing.
- **Integration:**
  - Stripe webhook for payment processing.
  - Stripe checkout session for payment initiation.

### 2. PostgreSQL
- **Purpose:** Database for storing application data.
- **Integration:**
  - JPA/Hibernate for database operations.
  - Hibernate naming strategy for database schema.

### 3. Lombok
- **Purpose:** Reduce boilerplate code.
- **Integration:**
  - Annotations for getters, setters, constructors, etc.

### 4. ModelMapper
- **Purpose:** Object mapping between entities and DTOs.
- **Integration:**
  - Mapping between entities and DTOs in service layers.

### 5. SpringDoc OpenAPI
- **Purpose:** API documentation.
- **Integration:**
  - Auto-generated API documentation using Swagger UI.

## API Documentation

### 1. Swagger UI
- **URL:** `/api/v1/swagger-ui.html`
- **Purpose:** Interactive API documentation.

### 2. OpenAPI Specification
- **URL:** `/api/v1/v3/api-docs`
- **Purpose:** OpenAPI specification for the API.

## Deployment

### 1. Local Deployment
- **Steps:**
  1. Clone the repository.
  2. Configure the database and environment variables in `application.yaml`:
     ```yaml
     spring:
       application:
         name: BookHaven

       datasource:
         url: jdbc:postgresql://localhost:5432/RestRentals
         username: postgres
         password: yourpassword

       jpa:
         hibernate:
           ddl-auto: update
         show-sql: false
         properties:
           hibernate:
             format_sql: true

     server:
       servlet:
         context-path: /api/v1

     jwt:
       secretKey: yoursecretkey

     stripe:
       secret:
         key: yourstripekey
       webhook:
         secret: yourwebhooksecret
     ```
     Replace `yourpassword`, `yoursecretkey`, `yourstripekey`, and `yourwebhooksecret` with your actual values.
  3. Run the application using `mvn spring-boot:run`.

### 2. Production Deployment
- **Steps:**
  1. Build the application using `mvn clean install`.
  2. Deploy the JAR file to a server (e.g., AWS, Heroku).
  3. Configure the database and other environment variables.

## Video Demonstration

### 1. YouTube Video
- **URL:** [![BookHaven Demo](https://img.youtube.com/vi/YOUR_VIDEO_ID/0.jpg)](https://www.youtube.com/watch?v=YOUR_VIDEO_ID)
- **Purpose:** Demonstration of the BookHaven application.

Replace `YOUR_VIDEO_ID` with the actual YouTube video ID.

## Conclusion

This document provides a high-level overview of the BookHaven backend project. It includes the file structure, features, authentication, third-party dependencies, and deployment instructions. For more details, refer to the individual files and the API documentation.

## Contact

For questions or feedback, please contact:
- **Email:** ashaw8176@gmail.com
- **GitHub:** [JardaniJovonovich6](https://github.com/JardaniJovonovich6)
