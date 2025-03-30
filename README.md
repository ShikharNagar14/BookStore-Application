# BookStore-Application
This project demonstrates the implementation of a secure book store API using Spring Boot 3.0 and JSON Web Tokens (JWT). It provides features like user authentication, role-based access control, and book management operations.

# Features
1.User registration and login with JWT authentication

2.Password encryption using BCrypt

3.Role-based authorization with Spring Security

4.CRUD operations for managing books

5.Customized error handling

6.Search and filter books by title, author, category, and rating

# Technologies
1.Spring Boot 3.0
2.Spring Security
3.JSON Web Tokens (JWT)
4.Maven
5.PostgreSQL / MySQL

# Getting Started
To run this project, you need to have the following installed on your system:
JDK 17+
Maven 3+
PostgreSQL / MySQL

# Steps to Set Up and Run
Clone the repository
git clone https://github.com/ShikharNagar14/bookstore-application
Configure the database
Create a database named bookstore_api in PostgreSQL or MySQL.
Update the application.properties file with your database credentials:

# properties
spring.datasource.url=jdbc:mysql://localhost:3306/bookstore_api
spring.datasource.username=root
spring.datasource.password=yourpassword
spring.jpa.hibernate.ddl-auto=update

# Build the project
mvn clean install
Run the project
mvn spring-boot:run

# API Endpoints
Authentication APIs
1.Register a new user
POST = http://localhost:8080/api/auth/register
Request Body (JSON)
json

{
  "firstname": "Shikhar",
  "lastname": "nagar"
  "email" : "shikharnagar1@gmail.com"
  "password" : "password123",
  "role": "USER"
}
Login and get JWT token
http
POST = http://localhost:8080/api/auth/login
Request Body (JSON)
json
{
  "email": "shikharnagar1@gmail.com",
  "password": "password123"
}
Response (JSON)
json
{
  "token": "your-jwt-token"
}
POST /api/auth/register


1.Get all books
GET http://localhost:8080/api/books/all/books
2.Get book by ID
GET http://localhost:8080/api/books/{id}

3.Add a new book (Requires Authentication)
POST http://localhost:8080/api/books/save
Request Body (JSON)
Example:
{
  "title": "Spring Boot Guide",
  "author": "John Doe",
  "category": "Technology",
  "price": 29.99,
  "rating": 4.5
}

4.Update a book by ID (Requires Authentication)

PUT http://localhost:8080/api/books/update/{id}
Example:
PUT http://localhost:8080/api/books/update/1
{
  "title": "Updated Book Title",
  "author": "Updated Author",
  "category": "Updated Category",
  "price": 35.99,
  "rating": 4.8
}

5.Delete a book by ID (Requires Authentication)
DELETE http://localhost:8080/api/books/delete/{id}
Example:
DELETE http://localhost:8080/api/books/delete/1

6.Search & Filter APIs
Search books by title
GET http://localhost:8080/api/books/search/book?title={title}
Example:
GET http://localhost:8080/api/books/search/book?title=spring

7. Filter books by author, category, or rating
GET http://localhost:8080/api/books/filter/books?author={author}&category={category}&rating={rating}
Example:
GET http://localhost:8080/api/books/filter/books?author=John%20Doe&category=Technology&rating=4.5
