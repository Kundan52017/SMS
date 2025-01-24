# STUDENT MANAGEMENT SYSTEM
# Student Management System (SMS)

## Key Features

- **Administrator Management**: Administrators can create, update, and delete student profiles, including personal information.
- **Authentication & Security**: Implemented client-side and server-side validation to ensure secure login and operations.
- **OTP Verification**: Uses SMTP protocol to send OTPs for verification during sensitive actions like profile deletion.
- **Session Management**: Utilizes `HttpSession` for session management, ensuring secure and consistent user experiences.

---

## Technologies Used

- **Java 17**
- **Spring Boot 3**
- **Spring MVC**
- **Spring Data JPA (Hibernate)** or **MongoDB**
- **MySQL** (Database) or **MongoDB** (optional)
- **Thymeleaf** (Frontend)
- **SMTP Email Protocol** (for OTPs)
- **Spring Boot Devtools** (for development efficiency)
- **JDBC** (for database interactions)

---

## Project Structure

src/ │ ├── main/ │ ├── java/ │ │ ├── com/ │ │ │ ├── example/ │ │ │ │ ├── controller/ # Handles HTTP requests │ │ │ │ ├── service/ # Business logic layer │ │ │ │ ├── repository/ # Database interactions (JPA/MongoDB) │ │ │ │ ├── entity/ # JPA entities or MongoDB documents │ │ │ │ └── config/ # Config classes (e.g., Email, Security) │ └── resources/ │ ├── templates/ # Thymeleaf templates (HTML views) │ ├── static/ # Static resources (CSS, JS, Images) │ └── application.properties # Application settings (Database, SMTP, etc.) └── test/ # Unit tests (if applicable)

markdown
Copy
Edit

---

## How to Run the Project

### Prerequisites

- **Java 17** or higher
- **Spring Tool Suite (STS)** or **Eclipse IDE**
- **MySQL** or **MongoDB**
- **SMTP email service** for OTP functionality

### Setup

1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/sms-project.git
Import the project into Spring Tool Suite as a Maven Project.

Update application.properties with your database and SMTP details:

properties
Copy
Edit
spring.data.mongodb.uri=mongodb://localhost:27017/sms_db
spring.datasource.username=root
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update
spring.mail.host=smtp.yourmailserver.com
spring.mail.username=your_email@example.com
spring.mail.password=your_email_password
Run the application in STS:

Right-click the project > Run As > Spring Boot App.
Access the Application
Once the application starts, open a browser and visit: http://localhost:8080

Database Setup
Create a MySQL database:
sql
Copy
Edit
CREATE DATABASE sms_db;
License
This project is licensed under the MIT License.

Contributing
Feel free to fork the repository and submit pull requests for improvements or bug fixes.

Repository Link
For more information, visit the GitHub Repository

yaml
Copy
Edit

---

This version of the `README.md` includes the content in a structured format suitable for printing on an A4 page. Simply copy the text into your `README.md` file, and it will be ready to use for your project.

Web Application 
![image](https://github.com/Kundan52017/SMS/assets/144003234/0f4c783f-8616-4f43-b14d-8685afcc60a3)


Add list of Students
![image](https://github.com/user-attachments/assets/1d688dfd-d716-4949-bebf-1e1f4ce4f0ce)
Update Students list
![image](https://github.com/user-attachments/assets/7f802ea2-9674-4700-97a2-8176447a1cc2)
 Mongodb Database
![image](https://github.com/user-attachments/assets/a2665989-9de0-4103-9c28-9a40fa05165c)







