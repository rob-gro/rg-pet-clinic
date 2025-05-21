# Spring Pet Clinic

Spring Pet Clinic is a reference application showcasing Spring Boot best practices for building robust Java
applications. The project demonstrates a real-world veterinary clinic management system with a clean, layered
architecture and modern development approaches.

## 🚀 Features

### 👨‍👩‍👧‍👦 Owner Management

- **Register Owners**: Add new pet owners with contact information
- **Owner Search**: Find owners by last name
- **Owner Details**: View and update owner information
- **Owner Listing**: Browse all registered pet owners

### 🐶 Pet Management

- **Add Pets**: Register pets for specific owners
- **Pet Types**: Categorize pets (dog, cat, bird, etc.)
- **Pet Profiles**: Track pet information and birth dates
- **Pet Updates**: Modify pet details as needed

### 👩‍⚕️ Veterinarian Management

- **Vet Directory**: Maintain list of clinic veterinarians
- **Specialties**: Track veterinarian specializations
- **Vet Listing**: View all veterinarians and their specialties

### 📅 Visit Management

- **Schedule Visits**: Book appointments for pets
- **Visit History**: Track pet visit history with descriptions
- **Visit Details**: Record treatment information

## 🛠 Technologies

- **Framework**: Spring Boot
- **Web Layer**: Spring MVC
- **Data Layer**: Spring Data JPA
- **Template Engine**: Thymeleaf
- **Database**:
    - H2 (development/testing)
    - MySQL (production option)
- **UI**: Bootstrap CSS
- **Testing**: JUnit, Spring Test, Mockito
- **Build Tool**: Maven
- **Validation**: Spring Validation
- **Logging**: SLF4J with Logback

## 🏗️ Architecture

### Layered Architecture

- **Presentation Layer**: Controllers and Thymeleaf views
- **Service Layer**: Business logic and transaction management
- **Data Access Layer**: Repositories for database operations
- **Domain Layer**: Entity classes representing the business domain

### Design Patterns

- **MVC Pattern**: Clean separation of Model, View, and Controller
- **Dependency Injection**: Core Spring principle for loose coupling
- **Repository Pattern**: Data access abstraction
- **DTO Pattern**: Data Transfer Objects for specific view requirements

## 📊 Domain Model

The application follows a rich domain model with the following key entities:

- **Person**: Base class with common person attributes
- **Owner**: Pet owners extending the Person class
- **Pet**: Animals belonging to owners
- **PetType**: Classification of different types of pets
- **Vet**: Veterinarians extending the Person class
- **Specialty**: Specialized skills of veterinarians
- **Visit**: Record of pet examinations

## 📁 Project Structure

### Key Components

#### Controllers

- **OwnerController**: Handling owner-related requests
- **PetController**: Managing pet operations
- **VetController**: Displaying veterinarian information
- **VisitController**: Scheduling and managing visits

#### Services

- **OwnerService**: Business logic for owner operations
- **PetService**: Pet-related functionality
- **VetService**: Veterinarian management
- **VisitService**: Visit scheduling and history

#### Repositories

- **OwnerRepository**: Data access for owners
- **PetRepository**: Data access for pets
- **VetRepository**: Data access for veterinarians
- **VisitRepository**: Data access for visits

#### Views

- Thymeleaf templates organized by entity
- Fragments for layout consistency
- Form templates for data entry
- List templates for data display

## 🌐 User Interface

- **Home Page**: Entry point with navigation options
- **Owner Pages**: Search, registration, details, and pets
- **Vet Pages**: Directory of veterinarians
- **Error Pages**: Custom error handling
- **Responsive Design**: Mobile-friendly layout with Bootstrap

## 🔧 Configuration

- **Application Properties**: Core configuration settings
- **Database Configuration**: Connection settings for different environments
- **Internationalization**: Support for multiple languages
- **Logging Configuration**: Customizable logging levels

## 🚀 Running the Application

1. Clone the repository
2. Build with Maven: `./mvnw clean install`
3. Run the application: `./mvnw spring-boot:run`
4. Access the application at `http://localhost:8080`

## 💾 Database Configuration

### H2 Console (Development)

- Available at `/h2-console` when running with the default profile
- JDBC URL: `jdbc:h2:mem:testdb`
- Username: `sa` (no password)

### MySQL Configuration (Optional)

- Configure in `application-mysql.properties`
- Create a database named `petclinic`
- Update connection settings as needed

## 🧪 Testing

- **Unit Tests**: Testing individual components in isolation
- **Integration Tests**: Testing component interactions
- **MockMVC Tests**: Testing web layer without a server
- **Test Data**: Sample data for consistent testing

## 🔧 Development Tools

- **Spring Boot DevTools**: Auto-restart during development
- **Spring Boot Actuator**: Application monitoring and metrics
- **Spring Boot Admin** (optional): Enhanced monitoring UI

---

Spring Pet Clinic serves as a reference implementation demonstrating Spring Boot best practices, clean architecture, and
modern Java development techniques. It provides a solid foundation for learning Spring or for building similar
domain-driven applications.
