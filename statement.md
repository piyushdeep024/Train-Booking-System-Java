# Statement of Purpose and Project Overview

## Train Booking System – CSE Project

**Institution:** VIT Bhopal University  
**Department:** Computer Science and Engineering  
**Submitted By:** Piyush Deep  
**Registration Number:** 25BAI11280  
**Course:** CSE Project  
**Academic Year:** 2026-2027

---

## 1. Project Title

**Train Booking System: A Modular Java-Based Console Application for Passenger and Seat Booking Management**

---

## 2. Executive Summary

The **Train Booking System** is a Java-based console application designed to manage basic train reservation operations. The system provides a simple menu-driven interface through which users can view available seats, book seats, display booked seats, cancel bookings, print tickets, search passenger details, modify bookings, and view booking statistics.

The project is implemented using multiple Java classes to keep different responsibilities separate. It demonstrates important programming and software engineering concepts such as **Object-Oriented Programming (OOP), modular design, input validation, error handling, data management, fare calculation, PNR generation, and functional testing**.

The application is designed as an academic project to demonstrate how Java can be used to build a practical reservation management system with a clear workflow and organized code structure.

---

## 3. Statement of Purpose

### 3.1 Problem Definition

Manual or poorly organized train booking processes can make it difficult to maintain passenger information, track available seats, calculate fares, and manage cancellations or modifications.

A simple computerized system can help organize these operations by providing a structured workflow for entering passenger details, checking seat availability, creating bookings, generating PNR numbers, calculating fares, and managing existing reservations.

The project addresses the need for a basic train booking application that can:

- Manage passenger and booking information.
- Display available and booked seats.
- Validate passenger and seat details before booking.
- Calculate fare based on passenger age.
- Generate a PNR number for each booking.
- Allow bookings to be cancelled or modified.
- Provide ticket and passenger search functionality.
- Display basic booking statistics.
- Handle invalid user inputs without terminating unexpectedly.

---

### 3.2 Project Objectives

The primary objectives of the Train Booking System are:

#### 1. Apply Object-Oriented Programming

- Use separate Java classes for different responsibilities.
- Encapsulate passenger, train, ticket, and booking-related data.
- Organize the application into reusable and understandable components.

#### 2. Implement Booking Management

- Allow users to book available seats.
- Store passenger and journey information.
- Display booked seats.
- Cancel existing bookings.
- Modify existing booking details.

#### 3. Implement Fare and PNR Management

- Calculate fare according to passenger age.
- Generate a PNR number for successful bookings.
- Display fare and PNR information on the ticket.

#### 4. Implement Validation and Error Handling

- Validate passenger name and age.
- Validate phone numbers.
- Validate seat numbers.
- Prevent booking of unavailable seats.
- Handle invalid menu choices and incorrect input types.

#### 5. Implement Testing

- Use a separate `TestModule.java`.
- Test fare calculation.
- Test valid and invalid seat numbers.
- Test valid phone number input.
- Display PASS/FAIL test results.

#### 6. Develop a User-Friendly Console Interface

- Provide a simple menu-driven interface.
- Keep the interaction easy to understand.
- Return the user to the main menu after completing an operation.

---

## 3.3 Project Scope

### Functional Scope

The system includes the following major functions:

- Display available seats.
- Book a seat.
- Store passenger information.
- Calculate passenger fare.
- Generate a PNR number.
- Display booked seats.
- Cancel a booking.
- Print ticket details.
- Search passenger information.
- Modify booking details.
- Display booking statistics.
- Run validation and functional tests.
- Exit the application safely.

### Technical Scope

- **Programming Language:** Java
- **Programming Approach:** Object-Oriented Programming
- **Interface:** Console-based menu system
- **Data Storage:** In-memory data structures
- **Testing:** Custom Java test module
- **Version Control:** Git and GitHub
- **Target Environment:** Windows / systems with a Java JDK

### Out of Scope

The current version does not include:

- Permanent database storage.
- Online payment integration.
- Real railway reservation APIs.
- Online user accounts.
- Graphical user interface.
- Email or SMS ticket notifications.

These can be considered future enhancements.

---

## 4. System Overview

### 4.1 High-Level Architecture

The system follows a modular class-based architecture:

```text
                ┌──────────────────────┐
                │        User          │
                └──────────┬───────────┘
                           │
                           ▼
                ┌──────────────────────┐
                │      Main.java       │
                │   Menu & User Input  │
                └──────────┬───────────┘
                           │
             ┌─────────────┼─────────────┐
             ▼             ▼             ▼
      ┌────────────┐ ┌────────────┐ ┌──────────────┐
      │   Train    │ │  Booking   │ │  Validator   │
      │ Management │ │  Manager   │ │              │
      └────────────┘ └─────┬──────┘ └──────────────┘
                            │
              ┌─────────────┼─────────────┐
              ▼             ▼             ▼
       ┌─────────────┐ ┌────────────┐ ┌─────────────┐
       │  Passenger  │ │   Ticket   │ │    Fare     │
       │    Data     │ │ Management │ │ Calculator  │
       └─────────────┘ └────────────┘ └─────────────┘
                            │
                            ▼
                    ┌───────────────┐
                    │ PNR Generator │
                    └───────────────┘
                            │
                            ▼
                    ┌───────────────┐
                    │  Statistics   │
                    └───────────────┘
```

---

### 4.2 Key Components

**1. Main Application**

- `Main.java` controls the application.
- Displays the main menu.
- Accepts user choices.
- Calls the required operations.
- Handles invalid input.

**2. Passenger Management**

- `Passenger.java` stores passenger details.
- Includes information such as name, age, gender, phone, source, destination, journey date, seat number, PNR, and fare.

**3. Train & Seat Management**

- `Train.java` manages train and seat information.
- Keeps track of available and booked seats.

**4. Booking Management**

- `BookingManager.java` handles booking operations.
- Supports booking, cancellation, searching, modification, booked-seat display, and ticket-related operations.

**5. Ticket Management**

- `Ticket.java` stores and displays ticket information.

**6. Fare Calculation**

- `FareCalculator.java` calculates fare based on passenger age.

**7. Input Validation**

- `Validator.java` checks user input before it is processed.

**8. PNR Generation**

- `PNRGenerator.java` creates PNR numbers for bookings.

**9. Statistics**

- `Statistics.java` displays basic information about current bookings.

**10. Testing**

- `TestModule.java` tests important functions of the application.

---

## 5. Technical Implementation

### 5.1 Technology Stack

| Component | Technology |
|-----------|-----------|
| Programming Language | Java |
| Programming Paradigm | Object-Oriented Programming |
| User Interface | Console-Based Menu |
| Data Storage | In-Memory Data |
| Validation | Custom Java Validation Methods |
| Testing | `TestModule.java` |
| Version Control | Git & GitHub |
| Development Tools | VS Code / Command Prompt |

---

### 5.2 Project Structure

```text
Train-Booking-System-Java/
│
├── .gitignore
├── README.md
│
└── src/
    └── trainbooking/
        ├── Main.java
        ├── Passenger.java
        ├── Train.java
        ├── BookingManager.java
        ├── Ticket.java
        ├── FareCalculator.java
        ├── Validator.java
        ├── PNRGenerator.java
        ├── Statistics.java
        └── TestModule.java
```

---

### 5.3 Main System Operations

#### Operation 1: Display Available Seats

- Shows seats that are currently free.
- Helps the user select an available seat for booking.

#### Operation 2: Book a Seat

- Takes passenger and journey details.
- Validates the entered information.
- Checks seat availability.
- Calculates fare.
- Generates a PNR.
- Stores the booking.

#### Operation 3: Display Booked Seats

- Displays seats that are currently occupied.

#### Operation 4: Cancel Booking

- Finds an existing booking.
- Removes the booking.
- Makes the seat available again.

#### Operation 5: Print Ticket

- Finds the passenger booking.
- Displays passenger, journey, seat, PNR, and fare information.

#### Operation 6: Search Passenger

- Searches stored passenger information.
- Displays matching booking details.

#### Operation 7: Modify Booking

- Finds an existing booking.
- Allows relevant booking details to be updated.

#### Operation 8: Booking Statistics

- Displays basic statistics about current bookings.

#### Operation 9: Run Tests

- Executes the functions in `TestModule.java`.
- Displays the result of each test.

---

## 6. Features and Functionality

### Feature 1: Seat Management

- View available seats.
- View booked seats.
- Validate seat numbers.
- Prevent duplicate seat bookings.

### Feature 2: Passenger Management

- Store passenger name, age, gender, and phone number.
- Store source, destination, and journey date.
- Associate passenger details with a seat and PNR.

### Feature 3: Booking Management

- Create new bookings.
- Cancel existing bookings.
- Search for passengers.
- Modify booking details.

### Feature 4: Fare Calculation

The system uses age-based fare calculation:

| Age Group | Fare |
|---|---:|
| Below 5 years | ₹0 |
| 5–12 years | ₹250 |
| 13–59 years | ₹500 |
| 60 years and above | ₹350 |

### Feature 5: PNR Generation

- A PNR is generated when a booking is successfully created.
- The PNR is associated with the passenger's booking.

### Feature 6: Ticket Display

- Displays passenger details.
- Displays journey details.
- Displays seat number.
- Displays PNR.
- Displays calculated fare.

### Feature 7: Input Validation

- Checks passenger name.
- Checks valid age.
- Checks 10-digit phone number.
- Checks valid seat number.
- Handles invalid menu input.

### Feature 8: Testing

- Tests normal fare calculation.
- Tests child fare calculation.
- Tests senior fare calculation.
- Tests valid seat numbers.
- Tests invalid seat numbers.
- Tests valid phone numbers.

---

## 6.2 User Interactions

```text
User
  |
  v
Start Application
  |
  v
Display Main Menu
  |
  +--> [1] Display Available Seats
  |          |
  |          └──> Show available seats
  |
  +--> [2] Book a Seat
  |          |
  |          ├──> Enter passenger details
  |          ├──> Validate input
  |          ├──> Check seat availability
  |          ├──> Calculate fare
  |          ├──> Generate PNR
  |          └──> Confirm booking
  |
  +--> [3] Display Booked Seats
  |
  +--> [4] Cancel Booking
  |          |
  |          ├──> Find booking
  |          ├──> Cancel booking
  |          └──> Make seat available
  |
  +--> [5] Print Ticket
  |
  +--> [6] Search Passenger
  |
  +--> [7] Modify Booking
  |
  +--> [8] Booking Statistics
  |
  +--> [9] Run Tests
  |
  +--> [10] Exit
             |
             v
            END
```

---

## 7. Project Significance

### 7.1 Educational Value

This project provides practical experience in:

- **Object-Oriented Programming:** Using classes and objects to model a real-world booking system.
- **Modular Programming:** Dividing the application into multiple meaningful classes.
- **Input Validation:** Checking data before processing it.
- **Error Handling:** Managing invalid user input.
- **Data Management:** Maintaining passenger and booking information.
- **Problem Solving:** Implementing booking, cancellation, searching, and modification logic.
- **Testing:** Verifying important functions using a dedicated test module.
- **Version Control:** Maintaining the project using Git and GitHub.

### 7.2 Real-World Applicability

The concepts used in this project can be applied to:

- Railway reservation systems.
- Bus ticket booking systems.
- Flight reservation systems.
- Hotel reservation systems.
- Event seat booking systems.
- Other reservation and resource management applications.

### 7.3 Scalability and Extension

The current modular structure allows future improvements such as:

- Connecting the system to a database.
- Adding multiple trains and routes.
- Adding different seat classes.
- Adding user authentication.
- Adding payment functionality.
- Developing a GUI or web interface.

---

## 8. Methodology

### 8.1 Development Approach

#### Phase 1: Requirement Analysis

- Identified the main requirements of a basic train booking system.
- Defined booking, passenger, seat, ticket, and cancellation operations.
- Identified the need for input validation and testing.

#### Phase 2: System Design

- Divided the system into multiple Java classes.
- Defined responsibilities for each class.
- Designed the menu-driven workflow.

#### Phase 3: Core Implementation

- Implemented passenger and train classes.
- Implemented booking and ticket operations.
- Added fare calculation and PNR generation.
- Added search, cancellation, and modification functionality.

#### Phase 4: Validation and Error Handling

- Added checks for invalid age, phone number, seat number, and passenger name.
- Added handling for invalid menu choices and incorrect input types.

#### Phase 5: Testing

- Created `TestModule.java`.
- Tested fare calculation.
- Tested seat validation.
- Tested phone number validation.
- Checked PASS/FAIL results.

#### Phase 6: Version Control

- Organized the project using a package structure.
- Uploaded the source code to GitHub.
- Added `.gitignore` to exclude generated compiled files.

---

### 8.2 Quality Assurance

### Testing Strategy

- Test fare calculation for different age groups.
- Test valid seat numbers.
- Test invalid seat numbers.
- Test valid phone numbers.
- Test invalid user input.
- Test booking and cancellation operations manually through the console.

### Code Quality

- Used separate classes for different responsibilities.
- Used meaningful class and method names.
- Included comments where useful.
- Used validation before processing important input.
- Maintained a proper Java package structure.

---

## 9. Expected Outcomes

### 9.1 Learning Outcomes

After completing this project, the student will be able to:

- ✓ Apply Object-Oriented Programming concepts in Java.
- ✓ Design a modular Java application.
- ✓ Implement a real-world booking workflow.
- ✓ Work with classes, objects, methods, and collections.
- ✓ Implement input validation and error handling.
- ✓ Implement basic testing and validation.
- ✓ Use Git and GitHub for project version control.
- ✓ Document a software project using Markdown.

---

## 9.2 Deliverables

### Code Artifacts

- Complete Java source code.
- 10 meaningful Java classes.
- Organized `trainbooking` package.
- `.gitignore` file.
- Testing module.

### Documentation Artifacts

- `README.md`
- `statement.md`

### Supporting Materials

- System architecture diagram.
- Workflow diagram.
- Use Case Diagram.
- Class Diagram.
- Sequence Diagram.
- Project screenshots.
- Testing results.

---

## 10. Functional Requirements

The system provides the following functional requirements:

1. The user shall be able to view available seats.
2. The user shall be able to book an available seat.
3. The system shall validate passenger information.
4. The system shall calculate the passenger fare.
5. The system shall generate a PNR for a successful booking.
6. The user shall be able to view booked seats.
7. The user shall be able to cancel a booking.
8. The user shall be able to print ticket information.
9. The user shall be able to search for passenger details.
10. The user shall be able to modify booking information.
11. The user shall be able to view booking statistics.
12. The user shall be able to run system tests.

---

## 11. Non-Functional Requirements

### 11.1 Usability

The system should provide a simple and understandable menu-driven console interface.

### 11.2 Reliability

The system should maintain correct seat and booking information during normal operation.

### 11.3 Maintainability

The use of separate classes makes the source code easier to understand and modify.

### 11.4 Error Handling

Invalid inputs should be detected and appropriate messages should be displayed instead of allowing the application to fail unexpectedly.

### 11.5 Resource Efficiency

The application is a lightweight console program and does not require external libraries or large system resources.

---

## 12. Conclusion

The **Train Booking System** is a modular Java console application that demonstrates how fundamental Java and software engineering concepts can be combined to solve a practical reservation problem.

The system manages passengers, seats, bookings, tickets, fares, PNR numbers, cancellations, modifications, searches, statistics, and testing. Its modular class structure makes the application easier to understand, maintain, and extend.

Future versions can improve the system by adding permanent database storage, multiple trains and routes, authentication, payment integration, and a graphical or web-based interface.

---

## Author Information

**Student:** Piyush Deep  
**Registration Number:** 25BAI11280  
**Institution:** Vellore Institute of Technology (VIT) Bhopal  
**Department:** Computer Science and Engineering  
**Course:** CSE Project  
**Academic Year:** 2026–2027

---

**Project:** Train Booking System  
**Technology:** Java  
**Version Control:** Git & GitHub
