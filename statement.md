# Train Booking System – Java Console Application

## Student Details

**Name:** Piyush Deep  
**Registration Number:** 25BAI11280  
**Institution:** VIT Bhopal   
**Submitted To:** Dr. Kamlesh Chandravanshi  
**Department:** CSE (AIML)   
**Course:** CSE Project  
**Academic Year:** 2026–2027  

---

# 1. Introduction

The Train Booking System is a Java-based console application made to handle basic train ticket booking activities. The main idea of this project is to provide a simple system where a user can book a seat, cancel a booking, check booked seats, search for a passenger, and print ticket details.

I developed this project using Java and divided the program into different classes so that each part of the system has a specific responsibility. This makes the code easier to understand, test, and modify.

The project is designed as a console application, so the user interacts with it through a menu and enters the required information using the keyboard.

---

# 2. Problem Definition

Managing train bookings manually can become difficult when there are many passengers and seats. It is easy to make mistakes while checking seat numbers, calculating fares, or keeping track of cancelled and booked tickets.

The purpose of this project is to create a small Java application that handles these basic operations in an organized way.

The system keeps track of passenger information, seat numbers, PNR numbers, journey details, and fares.

---

# 3. Objectives

The main objectives of this project are:

- To create a simple train booking system using Java.
- To allow users to book and cancel seats.
- To display available and booked seats.
- To generate a PNR number for each booking.
- To calculate fares according to passenger age.
- To validate important user inputs.
- To allow passenger searching and booking modification.
- To display basic booking statistics.
- To test important parts of the application.

---

# 4. Scope of the Project

The project focuses on the basic functions required in a train reservation system.

The application can:

- Display available seats.
- Book a seat.
- Display booked seats.
- Cancel a booking.
- Print ticket details.
- Search for a passenger.
- Modify booking information.
- Display booking statistics.
- Run basic tests.

This is a console-based academic project. It does not use a database, online payment system, login system, or real railway reservation API.

---

# 5. Functional Requirements

The main functional requirements of the system are:

### 5.1 Seat Management

The system should keep track of seats and show which seats are available or already booked.

### 5.2 Ticket Booking

The user can enter passenger details and select a seat. After successful booking, the system creates a ticket and generates a PNR number.

### 5.3 Booking Cancellation

A booking can be cancelled using the available booking information. The cancelled seat becomes available again.

### 5.4 Passenger Search

The system provides an option to search for passenger booking details.

### 5.5 Booking Modification

The user can modify supported booking details instead of creating a completely new booking.

### 5.6 Fare Calculation

The fare is calculated according to the passenger's age.

The current fare rules are:

| Age | Fare |
|---|---:|
| Under 5 | ₹0 |
| 5–12 | ₹250 |
| 13–59 | ₹500 |
| 60 and above | ₹350 |

### 5.7 PNR Generation

A unique-looking PNR is generated for a booking in the format:

`PNR + six random digits`

---

# 6. Non-Functional Requirements

The project also follows some basic non-functional requirements.

### 6.1 Usability

The program uses a simple menu so that a user can select an operation easily.

### 6.2 Reliability

Input validation and seat checking are used to reduce common booking errors.

### 6.3 Maintainability

Different tasks are separated into different Java classes. This makes it easier to change one part without changing the whole program.

### 6.4 Error Handling

The program checks inputs such as age, phone number, passenger name, and seat number before processing them.

---

# 7. System Design

The application follows a simple class-based design.

The main flow of the program is:

```text
Start
  |
  v
Display Main Menu
  |
  +----> Book Ticket
  |
  +----> Display Available Seats
  |
  +----> Display Booked Seats
  |
  +----> Cancel Booking
  |
  +----> Print Ticket
  |
  +----> Search Passenger
  |
  +----> Modify Booking
  |
  +----> Booking Statistics
  |
  +----> Run Tests
  |
  +----> Exit
  |
  v
End
```

The `Main` class handles the menu and connects the user with the other classes.

---

# 8. Project Structure

```text
Train-Booking-System-Java/
├── .gitignore
├── README.md
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

All Java files are placed inside the `trainbooking` package.

---

# 9. Description of Classes

## 9.1 Passenger.java

This class stores passenger information such as:

- Name
- Age
- Gender
- Phone number
- Source
- Destination
- Journey date
- Seat number
- PNR
- Fare

It mainly represents the passenger and their booking details.

## 9.2 Train.java

This class handles train and seat-related information. It helps the system keep track of the seats available for booking.

## 9.3 BookingManager.java

This is one of the main classes of the project. It handles operations such as booking, cancellation, searching, displaying bookings, and modifying booking information.

## 9.4 Ticket.java

This class represents the ticket and is used when ticket information needs to be displayed.

## 9.5 FareCalculator.java

This class calculates the fare based on the passenger's age.

## 9.6 Validator.java

This class checks user inputs before they are accepted by the system.

For example:

- Passenger name should not be empty.
- Age should be between 1 and 100.
- Phone number should contain 10 digits.
- Seat number should be within the valid range.

## 9.7 PNRGenerator.java

This class generates a PNR using the prefix `PNR` followed by six random digits.

## 9.8 Statistics.java

This class is used to show basic information about the current bookings.

## 9.9 TestModule.java

This class contains simple tests for checking whether important functions are working correctly.

## 9.10 Main.java

This is the starting point of the application. It displays the menu and takes input from the user.

---

# 10. Technical Implementation

The project is implemented in **Java** and uses object-oriented programming concepts.

Some of the concepts used are:

- Classes and objects
- Encapsulation
- Methods
- Constructors
- Conditional statements
- Loops
- Collections/data structures used for storing bookings
- Input validation
- Exception/error handling
- Modular programming

The classes are kept separate instead of putting the complete program into one large Java file.

---

# 11. Basic Working of the System

When the program starts, the user sees the main menu.

For example:

```text
===== TRAIN BOOKING SYSTEM =====
1. Display Available Seats
2. Book a Seat
3. Display Booked Seats
4. Cancel Booking
5. Print Ticket
6. Search Passenger
7. Modify Booking
8. Booking Statistics
9. Run Tests
10. Exit
```

The user selects an option by entering its number.

For booking a ticket, the program takes passenger information, checks the entered values, checks the selected seat, calculates the fare, generates a PNR, and stores the booking.

---

# 12. Booking Flow

The basic booking process is:

```text
Enter Passenger Details
        |
        v
Validate Input
        |
        v
Check Seat Availability
        |
        v
Calculate Fare
        |
        v
Generate PNR
        |
        v
Create Ticket
        |
        v
Save Booking
        |
        v
Display Booking Details
```

If the input is not valid or the selected seat is already booked, the system does not complete the booking and shows an appropriate message.

---

# 13. Input Validation

Input validation is included to avoid common mistakes.

The system checks:

### Name
The passenger name should not be empty.

### Age
The age should be between 1 and 100.

### Phone Number
The phone number should contain 10 digits.

### Seat Number
The seat number should be inside the valid seat range and should not already be booked.

These checks make the booking process safer and reduce incorrect data.

---

# 14. Fare Calculation

The fare is calculated using the passenger's age.

Example:

```text
Passenger age = 25
Fare = ₹500
```

Another example:

```text
Passenger age = 10
Fare = ₹250
```

For a passenger below 5 years:

```text
Fare = ₹0
```

For a senior passenger aged 60 or above:

```text
Fare = ₹350
```

The calculation is kept in a separate `FareCalculator` class so it can be changed easily later.

---

# 15. Testing

A separate `TestModule` is included in the project.

The current test module checks six cases:

| Test | Expected Result |
|---|---|
| Normal fare for age 25 | ₹500 |
| Child fare for age 10 | ₹250 |
| Senior fare for age 65 | ₹350 |
| Valid seat number 10 | PASS |
| Invalid seat number 55 | PASS |
| Valid phone number 9876543210 | PASS |

The test option can be selected from the main menu.

Expected result:

```text
Tests Passed: 6
Tests Failed: 0
```

These tests mainly check the fare calculation and input validation logic.

---

# 16. How to Run the Project

The project can be run using the Java compiler from the project folder.

Compile:

```cmd
javac -d out src\trainbooking\*.java
```

Run:

```cmd
java -cp out trainbooking.Main
```

The application then opens in the command prompt.

---

# 17. Error Handling

The program handles common input problems instead of directly accepting every value.

Examples include:

- Invalid age
- Invalid phone number
- Empty passenger name
- Invalid seat number
- Selecting a seat that is already booked
- Trying to cancel or search for a booking that does not exist

This prevents many basic runtime and booking errors.

---

# 18. Advantages

Some advantages of this project are:

- Simple and easy-to-use menu.
- Clear separation of classes.
- Basic validation is included.
- Fare calculation is handled separately.
- PNR generation is automated.
- Booking and cancellation can be performed from the same application.
- The project is easy to extend with more features.

---

# 19. Current Limitations

There are some limitations because this is a small console-based academic project.

- It does not use a database.
- Bookings are not permanently stored after the program closes.
- There is no online payment option.
- There is no user login or authentication.
- It is not connected to a real railway reservation system.
- It does not provide a graphical user interface.

---

# 20. Future Enhancements

The project can be improved in the future by adding:

- Database support using MySQL or another database.
- A graphical or web-based interface.
- User login and authentication.
- Online payment integration.
- Multiple trains and routes.
- Better seat selection.
- Permanent booking history.
- Email/SMS ticket confirmation.
- More detailed reports and statistics.

---

# 21. Project Outcome

The final application demonstrates how Java can be used to build a small but complete booking system.

The project covers the complete basic flow from entering passenger information to booking a seat, calculating the fare, generating a PNR, and displaying ticket information.

It also helped in understanding how a larger program can be divided into smaller classes instead of keeping all the logic in one file.

---

# 22. Learning from the Project

While working on this project, I got practical experience with:

- Java programming
- Object-oriented programming
- Creating and using multiple classes
- Input validation
- Handling user input
- Designing a menu-driven application
- Basic testing
- Organizing a Java project
- Using GitHub to maintain the project

One of the main things I learned is that separating the code into different classes makes the project easier to understand and maintain.

---

# 23. Deliverables

The project includes:

1. Java source code.
2. `README.md` documentation.
3. `statement.md` project statement.
4. `.gitignore` file.
5. Basic test module.
6. Project folder structure.
7. GitHub repository containing the source code.

---

# 24. Conclusion

The Train Booking System is a Java console application developed to demonstrate the basic working of a train reservation system.

It supports important operations such as seat booking, cancellation, passenger search, ticket printing, fare calculation, PNR generation, and booking statistics.

The project is simple, but it covers several important Java programming concepts and shows how different classes can work together to solve a practical problem.

With database support, a graphical interface, authentication, and payment features, the same basic project can be developed into a more complete booking application.

---

# 25. References

- Java programming concepts and standard Java documentation.
- VIT Bhopal project guidelines.
- Class notes and learning resources used during development.
- GitHub documentation for repository management.

---

## Author

**Piyush Deep**  
B.Tech CSE (AIML)  
VIT Bhopal  
Registration No.: 25BAI11280
