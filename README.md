# Book Review Application (In Progress)

## Project Overview
The Book Review application is designed to allow users to browse books and see their reviews and rating (while registered users will be able to leave reviews/rating).
This app is a work in progress and will expand over time to support advanced features, user roles, and security.

## Technologies Used
- **Java 17** - The main programming language for the backend.
- **Spring Boot** - Framework for building and managing Java-based applications.
- **Spring Data JPA** - For seamless integration with relational databases.
- **Auth0** (planned) - To handle secure user authentication, registration, and role management.
- **Maven** - For project and dependency management.
- **React** (planned) - Planned frontend framework for building a dynamic, single-page application (SPA) interface.
- **MySQL** - For data persistence, storing information on books, reviews, and user roles.

## Features (Planned and In-Progress)
- **Book and Review Management**: Non-registered Users will be able to browse a collection of books, read reviews, see the rating. Registered users will bve abel to leave and edit (or delete) their reviews and ratings.
- **User Authentication**: Using Auth0 for secure login and registration. User passwords will be securely hashed to ensure privacy.
- **Role-Based Access**: Roles such as `ADMIN` and `USER` will be implemented to restrict access to certain functionalities and improve security.

## Architecture
This application will follow a layered architecture:
- **Controllers**: Will handle HTTP requests and manage communication between the frontend and the backend logic.
- **Service Layer**: Will contain the core business logic for managing books, reviews, and user roles.
- **Repository Layer**: Uses Spring Data JPA to interact with the database for persistent storage.
- **DTOs (Data Transfer Objects)**: Will facilitate data transfer between layers.

## Data Model (Current)
The application currently includes three tables with the following relationships:
- **Book**: Stores information about each book, with one-to-many mapping to `Review`, so each book can have multiple reviews.
- **Review**: Stores user reviews and ratings for books, with a many-to-one mapping to `Book` and many-to-one mapping to `User`.
- **User**: Stores information about user and their roles (`ADMIN` and `USER` as enumeration to represent these values), with one-to-many mapping to `Review`, so each user can review multiple books.

## Database Configuration
The application uses MySQL as the primary database.
