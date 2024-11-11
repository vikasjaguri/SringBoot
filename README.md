# Enterprise-App-Dev-SpringBoot
Projects developed using Spring Boot for the course 'Programming for Enterprise Application Development'. Includes database connectivity, CRUD operations, and more.

# Spring Core and Spring JDBC Projects

This repository contains two distinct projects focused on exploring Spring Core and Spring JDBC concepts in Java. Each folder contains practical implementations of various Spring features and functionality.

## 1. **SpringCore1**

This project demonstrates the core features of the Spring Framework, including dependency injection, bean management, and other foundational concepts. The project is divided into the following packages:

### Packages:
- **Autowiring**: Demonstrates Spring’s autowiring mechanism, which automatically injects dependencies into beans.
- **Annotation**: Explores Spring annotations for configuring beans and dependencies.
- **Expressional Language (SpEL)**: Implements Spring Expression Language (SpEL) for working with dynamic expressions within Spring beans.
- **Standalone Collection**: Illustrates the use of collections (List, Set, Map) in Spring with bean configuration.
- **Stereotype**: Demonstrates the use of Spring stereotypes (`@Component`, `@Repository`, `@Service`, `@Controller`) for managing components in a Spring application.
- **Simple Spring Core**: Basic demonstration of Spring Core concepts, including bean creation and dependency injection.
- **Constructor Injection**: Shows how to inject dependencies into Spring beans via constructors.
- **Spring Core Lifecycle**: Explains the lifecycle of Spring beans, including the initialization and destruction callbacks.

## 2. **SpringJdbc2**

This project demonstrates database connectivity using Spring JDBC. It showcases the integration of Java applications with relational databases through Spring's JDBC module.

### Features:
- **Java Database Connectivity**: Establishes a connection to a relational database using Spring JDBC.
- **DAO (Data Access Object)**: Implements the DAO design pattern to separate the data access logic from business logic.
- **Entity Classes**: Represents the data model in the form of entity classes corresponding to the database schema.

### Key Components:
- **Database Connectivity Files**: Contains configuration files for setting up database connections (e.g., using `DataSource`).
- **DAO Layer**: Encapsulates the data access logic using `JdbcTemplate` and related classes for executing SQL queries.
- **Entity Classes**: Represents data from the database as Java objects, with fields corresponding to database columns.

## How to Run

1. **Clone the repository**:
   ```bash
   git clone https://github.com/your-username/your-repository-name.git
   ```

2. **Set up the necessary database for the Spring JDBC project**.

3. **Run the SpringCore1 modules** using a Spring-supported IDE like IntelliJ or Eclipse:
   - Import the project.
   - Configure the necessary dependencies (Spring, JDBC, etc.).
   - Run the individual modules as needed.

4. **For SpringJdbc2**:
   - Ensure the database is properly set up with the appropriate schema.
   - Run the project and test the DAO operations (Insert, Update, Delete, Fetch).

## Dependencies

- Java 8+ 
- Spring Framework (Core, JDBC)
- MySQL or any relational database for Spring JDBC
- Maven or Gradle for dependency management

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.
