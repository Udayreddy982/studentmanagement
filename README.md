# 🧑‍🏫 Student Management System - Spring Boot CRUD Project

This is a full-stack **Spring Boot REST API** project for managing student data. It includes basic CRUD operations (Create, Read, Update, Delete) and uses:

* Java 17+
* Spring Boot
* Spring Data JPA
* MySQL
* Swagger UI for API testing
* Postman (for manual testing)

---

## 📌 Features

✅ Add a new student
✅ View all students
✅ Get student by ID
✅ Update student information
✅ Delete a student
✅ Swagger UI for easy testing
✅ MySQL database integration

---

## 📦 Technologies Used

* **Spring Boot**
* **Java**
* **Spring Data JPA**
* **MySQL**
* **Swagger (OpenAPI 3)**
* **Lombok**
* **Postman** (for API testing)
* **IntelliJ IDEA**

---

## ⚙️ Setup Instructions

1. Clone the project:

   ```bash
   git clone https://github.com/Udayreddy982/studentmanagement.git
   cd studentmanagement
   ```

2. Create a database in MySQL:

   ```sql
   CREATE DATABASE student_db;
   ```

3. Configure `application.properties`:

   ```
   spring.datasource.url=jdbc:mysql://localhost:3306/student_db
   spring.datasource.username=your_mysql_username
   spring.datasource.password=your_mysql_password
   spring.jpa.hibernate.ddl-auto=update
   ```

4. Run the app from IntelliJ or terminal:

   ```
   mvn spring-boot:run
   ```

---

## 🔗 API Endpoints

| Method | Endpoint         | Description          |
| ------ | ---------------- | -------------------- |
| GET    | `/students`      | Get all students     |
| GET    | `/students/{id}` | Get student by ID    |
| POST   | `/students`      | Add a new student    |
| PUT    | `/students/{id}` | Update student by ID |
| DELETE | `/students/{id}` | Delete student by ID |

---

## 🔍 Swagger UI

To test APIs in browser:

```
http://localhost:8080/swagger-ui/index.html
```

---

## 🦪 Sample JSON for POST

```json
{
  "name": "John Doe",
  "age": 22,
  "email": "john@example.com",
  "course": "Computer Science"
}
```

---

## 👨‍💼 Author

**Uday Kiran Reddy**
📧 [GitHub - Udayreddy982](https://github.com/Udayreddy982)

---

## 📃 License

This project is for educational and personal portfolio use.
