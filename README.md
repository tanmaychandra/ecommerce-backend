# 🛒 E-Commerce Backend Application

A secure and scalable **e-commerce backend application** built using **Java and Spring Boot**, focusing on authentication, authorization, and core business logic.

---

## 🚀 Features

### 🔐 Authentication & Authorization
- User Signup and Login
- JWT-based authentication
- Role-based access control (ADMIN / USER)
- Secured APIs using Spring Security

### 📦 Product Management
- View products (authenticated users)
- Add, update, delete products (ADMIN only)
- Pagination and sorting support

### 🛒 Cart Management
- Add products to cart
- View user-specific cart
- Remove items from cart

---

## 🛠️ Tech Stack
- Java
- Spring Boot
- Spring Security
- JWT (JSON Web Tokens)
- JPA / Hibernate
- MySQL (local development)
- Swagger (OpenAPI)
- Maven

---

## 🧱 Project Architecture

Controller → Service → Repository → Database

---

## 🔑 Roles & Permissions

| Role  | Access |
|------|--------|
| USER | View products, manage cart |
| ADMIN | Add, update, delete products |

---

## ▶️ Running the Project Locally

1. Clone the repository
```bash
git clone https://github.com/your-username/ecommerce-backend.git
