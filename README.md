# Task Management System

## Project Overview

This project is a full-stack Task Management System developed as part of the Backend Developer Intern Assignment. The application provides secure user authentication, task management functionality, RESTful APIs, database integration, and a simple frontend interface for interacting with the backend services.

The system demonstrates backend development concepts such as authentication, authorization, CRUD operations, database management, API documentation, validation, and scalable project architecture.

---

## Technologies Used

### Backend

* Java 17
* Spring Boot 3
* Spring Security
* Spring Data JPA
* MySQL
* JWT Authentication
* Maven
* Swagger/OpenAPI

### Frontend

* React.js (Vite)
* Axios
* HTML5
* CSS3

### Database

* MySQL

---

## Features

### Authentication & Authorization

* User Registration
* User Login
* Password Encryption using BCrypt
* JWT Token Generation
* Role-Based Access (USER / ADMIN)

### Task Management

* Create Task
* View Tasks
* Update Task
* Delete Task

### API Features

* RESTful API Design
* Input Validation
* Exception Handling
* API Versioning
* Swagger Documentation

### Frontend Features

* User Registration Form
* User Login Form
* Dashboard
* Task Display
* API Integration using Axios
* Responsive User Interface

---

## Project Structure

### Backend

```text
src/main/java

config
controller
dto
entity
repository
security
service
```

### Frontend

```text
src

pages
 ├── Register.jsx
 ├── Login.jsx
 ├── Dashboard.jsx

App.jsx
App.css
```

---

## Database Schema

### Users Table

| Column   | Type    |
| -------- | ------- |
| id       | BIGINT  |
| name     | VARCHAR |
| email    | VARCHAR |
| password | VARCHAR |
| role     | VARCHAR |

### Tasks Table

| Column      | Type    |
| ----------- | ------- |
| id          | BIGINT  |
| title       | VARCHAR |
| description | VARCHAR |
| status      | VARCHAR |
| user_id     | BIGINT  |

Relationship:

* One User can have multiple Tasks
* Many Tasks belong to one User

---

## API Endpoints

### Authentication

#### Register User

```http
POST /api/auth/register
```

#### Login User

```http
POST /api/auth/login
```

---

### Tasks

#### Get All Tasks

```http
GET /api/tasks
```

#### Create Task

```http
POST /api/tasks
```

#### Update Task

```http
PUT /api/tasks/{id}
```

#### Delete Task

```http
DELETE /api/tasks/{id}
```

---

## Running the Backend

### Clone Repository

```bash
git clone <repository-url>
```

### Configure Database

Create a MySQL database:

```sql
CREATE DATABASE taskmanager;
```

Update application.properties:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/taskmanager
spring.datasource.username=root
spring.datasource.password=YOUR_PASSWORD
```

### Run Application

```bash
mvn spring-boot:run
```

Backend runs on:

```text
http://localhost:8089
```

---

## Running the Frontend

Navigate to frontend folder:

```bash
cd task-management-frontend
```

Install dependencies:

```bash
npm install
```

Run application:

```bash
npm run dev
```

Frontend runs on:

```text
http://localhost:5173
```

---

## API Documentation

Swagger UI:

```text
http://localhost:8089/swagger-ui/index.html
```

---

## Security Implementation

* Password hashing using BCrypt
* JWT-based authentication
* Protected API access
* Role-based authorization
* Input validation and sanitization

---

## Scalability Considerations

The project is designed with a layered architecture that can be extended for large-scale applications.

Future improvements include:

* Redis Caching
* Docker Containerization
* Microservices Architecture
* API Gateway
* Load Balancing
* Centralized Logging
* CI/CD Pipeline Integration
* Kubernetes Deployment

---

## Future Enhancements

* Task Priority Management
* Task Categories
* Task Due Dates
* Email Notifications
* File Attachments
* Team Collaboration Features
* Real-time Updates using WebSockets

---

## Author

Anushka Singh

B.Tech CSE (Cloud Computing & Virtualization)

Galgotias University

Backend Developer Intern Assignment Submission
# React + Vite

This template provides a minimal setup to get React working in Vite with HMR and some ESLint rules.

Currently, two official plugins are available:

- [@vitejs/plugin-react](https://github.com/vitejs/vite-plugin-react/blob/main/packages/plugin-react) uses [Oxc](https://oxc.rs)
- [@vitejs/plugin-react-swc](https://github.com/vitejs/vite-plugin-react/blob/main/packages/plugin-react-swc) uses [SWC](https://swc.rs/)

## React Compiler

The React Compiler is not enabled on this template because of its impact on dev & build performances. To add it, see [this documentation](https://react.dev/learn/react-compiler/installation).

## Expanding the ESLint configuration

If you are developing a production application, we recommend using TypeScript with type-aware lint rules enabled. Check out the [TS template](https://github.com/vitejs/vite/tree/main/packages/create-vite/template-react-ts) for information on how to integrate TypeScript and [`typescript-eslint`](https://typescript-eslint.io) in your project.
