📌 Spring Boot GraphQL Example Project
📖 Overview

This project demonstrates how to build a GraphQL API with Spring Boot.
It provides User and Order entities with CRUD operations using GraphQL queries and mutations.

🚀 Features

✅ Spring Boot + GraphQL integration

✅ User & Order management

✅ GraphQL schema-based API

✅ Query & Mutation support

✅ H2 / MySQL database support

✅ Follows clean architecture (Controller → Service → Repository → Entity)

🏗️ Project Structure
src/main/java/com/example/graphql
│── Controller/     # GraphQL Resolvers (Query + Mutation)
│── Entity/         # JPA Entities (User, Order)
│── Repository/     # Spring Data JPA Repositories
│── Service/        # Business Logic Layer
│── resources/
    ├── application.properties
    └── schema.graphqls  # GraphQL schema

🔧 Tech Stack

Java 17+

Spring Boot 3+

Spring GraphQL

Spring Data JPA

H2 / MySQL (configurable)
