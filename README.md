# BookHaven - Hotel Booking Application

## Overview
BookHaven is a hotel booking application built with Spring Boot for the backend and React for the frontend. This application allows users to browse hotels, book rooms, and make payments using Stripe.

## Features

### Backend Features
- **Authentication:** JWT-based authentication with role-based access control.
- **Hotel Management:** CRUD operations for hotels.
- **Room Management:** CRUD operations for rooms.
- **Booking Management:** Create, update, and cancel bookings.
- **Payment Management:** Stripe integration for payment processing.
- **Inventory Management:** Manage room availability and pricing.
- **Pricing Strategies:** Dynamic pricing based on various strategies.

### Frontend Features (Planned)
- **User Authentication:** Login and signup pages.
- **Hotel Browsing:** Search and filter hotels.
- **Room Booking:** Select dates and rooms.
- **Payment Processing:** Stripe checkout for payments.
- **Admin Dashboard:** Manage hotels, rooms, and bookings.

## Technologies

### Backend
- **Framework:** Spring Boot
- **Database:** PostgreSQL
- **Authentication:** JWT
- **Payment Processing:** Stripe
- **Documentation:** SpringDoc OpenAPI

### Frontend (Planned)
- **Framework:** React
- **Styling:** CSS Modules / React Bootstrap
- **State Management:** React Context / Redux
- **Routing:** React Router

## Getting Started

### Prerequisites
- Java 25
- Maven
- PostgreSQL
- Node.js (for frontend)

### Installation

#### Backend
1. Clone the repository:
   ```bash
   git clone https://github.com/yourusername/BookHaven.git
   ```
2. Navigate to the backend directory:
   ```bash
   cd BookHaven
   ```
3. Configure the database and environment variables in `src/main/resources/application.yaml`:
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

   frontend:
     url: http://localhost:3000

   stripe:
     secret:
       key: yourstripekey
     webhook:
       secret: yourwebhooksecret
   ```
   Replace `yourpassword`, `yoursecretkey`, `yourstripekey`, and `yourwebhooksecret` with your actual values.
4. Run the application:
   ```bash
   mvn spring-boot:run
   ```

#### Frontend (Planned)
1. Navigate to the frontend directory:
   ```bash
   cd frontend
   ```
2. Install dependencies:
   ```bash
   npm install
   ```
3. Run the application:
   ```bash
   npm start
   ```

## API Documentation

### Swagger UI
- **URL:** `http://localhost:8080/api/v1/swagger-ui.html`
- **Purpose:** Interactive API documentation.

### OpenAPI Specification
- **URL:** `http://localhost:8080/api/v1/v3/api-docs`
- **Purpose:** OpenAPI specification for the API.

## Deployment

### Backend
1. Build the application:
   ```bash
   mvn clean install
   ```
2. Deploy the JAR file to a server (e.g., AWS, Heroku).
3. Configure the database and other environment variables.

### Frontend (Planned)
1. Build the application:
   ```bash
   npm run build
   ```
2. Deploy the `build` folder to a static hosting service (e.g., Vercel, Netlify).

## Video Demonstration

### YouTube Video
- **URL:** [![BookHaven Demo](https://img.youtube.com/vi/YOUR_VIDEO_ID/0.jpg)](https://www.youtube.com/watch?v=YOUR_VIDEO_ID)
- **Purpose:** Demonstration of the BookHaven application.

Replace `YOUR_VIDEO_ID` with the actual YouTube video ID.

## Contributing

### Guidelines
- Fork the repository.
- Create a new branch for your feature or bug fix.
- Commit your changes with descriptive commit messages.
- Push your changes to your fork.
- Submit a pull request.

### Code of Conduct
- Be respectful and inclusive.
- Follow the project's coding standards.
- Document your code and changes.

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.

## Contact

For questions or feedback, please contact:
- **Email:** your.email@example.com
- **GitHub:** [yourusername](https://github.com/yourusername)

## Acknowledgments

- Thanks to the Spring Boot and React communities for their excellent documentation and support.
- Special thanks to the contributors and maintainers of the third-party libraries used in this project.
