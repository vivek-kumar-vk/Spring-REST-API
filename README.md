# 🌱 Spring-REST-API

This project is a demo Spring Boot application that showcases basic REST API functionalities including CRUD operations on a Department entity. It utilizes Maven for dependency management and project build, and H2 as an in-memory database for persistence.

## 🚀 Getting Started

To get this project up and running on your local machine, follow these steps:

## 🏗️ Project Structure

- **src/main/java/com/spring/SpringBootBasic**: Main application package.
  - **controller**: Contains `HelloController` and `DepartmentController` for handling HTTP requests.
  - **entity**: Contains `Department` entity class.
  - **repository**: Contains `DepartmentRepository` interface for CRUD operations on the database.
  - **service**: Contains `DepartmentService` interface and its implementation `DepartmentServiceImpl` for business logic.
  - **SpringBootBasicApplication.java**: Main class to run the Spring Boot application.

- **src/main/resources**:
  - **application.properties**: Configuration properties for the application, including database configuration.

- **src/test/java/com/spring/SpringBootBasic**: Contains `SpringBootBasicApplicationTests` for testing the application.

- **pom.xml**: Maven configuration file for project build and dependency management.

- **.mvn/wrapper**: Maven wrapper files for ensuring a consistent build environment.

- **mvnw** and **mvnw.cmd**: Maven wrapper scripts for Unix-like operating systems and Windows, respectively.

## 🎉 Features

- **REST API Endpoints**: The application defines basic CRUD operations for a `Department` entity.
  - **Create**: `POST /departments`
  - **Read**: `GET /departments` and `GET /departments/{id}`
  - **Update**: `PUT /departments/{id}`
  - **Delete**: `DELETE /departments/{id}`

- **H2 Database**: Utilizes H2 in-memory database for persistence.

- **Spring Data JPA**: For repository layer abstraction.

- **Spring Boot**: For easy project setup and configuration.

## ⚙️ Configuration

- **Database Configuration**: Configured in `src/main/resources/application.properties`.
  - H2 console is enabled and accessible at `/h2-console`.

## 🛠️ Build and Dependency Management

- **Maven**: Used for managing dependencies and building the project.
- **Maven Wrapper**: Ensures a consistent build environment without requiring Maven to be installed.

## 🔗 Version Control

- **.gitignore**: Configured to exclude unnecessary files and directories from version control.

## 🤝 How to Contribute

1. Fork the repository.
2. Create a new branch for your feature.
3. Commit your changes.
4. Push to your branch.
5. Submit a pull request.

## 📝 License

This project is licensed under the Apache License, Version 2.0. See the LICENSE file for details.
