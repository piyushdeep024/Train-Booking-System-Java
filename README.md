# Train Booking System - CSE Project

**VIT Bhopal University**  
**Course:** Computer Science and Engineering 
**Submitted To:** Dr. Kamlesh Chandravanshi
**Student Name:** Piyush Deep  
**Registration Number:** 25BAI11280  
**Date of Submission:** September 2026  

---

## Overview

The **Train Booking System** is a Java-based console application developed to manage basic train seat booking operations.

The system provides a menu-driven interface through which users can view available seats, book a seat, display booked seats, cancel bookings, print tickets, search passengers, modify bookings, and view booking statistics.

The project demonstrates core Java and software engineering concepts including **Object-Oriented Programming (OOP), modular class design, input validation, error handling, data management, fare calculation, PNR generation, and functional testing**.

---

## Project Objectives

- Develop a functional train booking application using Java.
- Demonstrate Object-Oriented Programming concepts through multiple classes.
- Manage passenger, train, seat, and ticket information.
- Provide booking, cancellation, searching, modification, and ticket operations.
- Calculate fares according to passenger age.
- Generate a PNR number for each booking.
- Implement input validation and error handling.
- Maintain a clean and modular project structure.
- Test important functions using a separate validation test module.

---

## Features

### 1. Seat Management

- Displays available seats.
- Displays currently booked seats.
- Validates seat numbers before booking.
- Prevents booking of an already occupied seat.

### 2. Passenger & Booking Management

- Accepts passenger details such as name, age, gender, phone number, source, destination, and journey date.
- Books a selected seat.
- Cancels an existing booking.
- Searches passenger details.
- Allows booking details to be modified.

### 3. Fare Calculation

- Calculates fare based on passenger age.
- Children below 5 years have a ₹0 fare.
- Passengers aged 5–12 have a ₹250 fare.
- Passengers aged 13–59 have a ₹500 fare.
- Senior passengers aged 60 and above have a ₹350 fare.

### 4. Ticket & PNR Management

- Generates a PNR number for each booking.
- Stores booking and passenger information.
- Displays ticket details when requested.

### 5. Booking Statistics

- Displays basic statistics related to current bookings.
- Provides a quick overview of the booking status.

### 6. Input Validation & Error Handling

- Validates passenger name.
- Validates age.
- Validates 10-digit phone numbers.
- Validates seat numbers.
- Handles invalid menu input and incorrect input types.

### 7. Testing Module

- Provides a separate `TestModule.java`.
- Tests fare calculation and input validation.
- Reports PASS/FAIL results.

---

## Technical Stack

| Component | Details |
|-----------|---------|
| **Programming Language** | Java |
| **Programming Paradigm** | Object-Oriented Programming (OOP) |
| **Interface** | Console-Based Menu System |
| **Data Management** | In-Memory Java Objects / Collections |
| **Validation** | Custom validation methods |
| **Testing** | Custom `TestModule.java` |
| **Development Tools** | VS Code / Command Prompt |
| **Version Control** | Git and GitHub |

---

## System Architecture

The project follows a modular class-based architecture.

### Main Components

**Main.java**
- Controls the main application.
- Displays the menu.
- Accepts user choices.
- Calls the required system operations.

**Passenger.java**
- Stores passenger information.
- Maintains details such as name, age, gender, phone, journey details, seat number, PNR, and fare.

**Train.java**
- Manages train and seat information.
- Keeps track of available and booked seats.

**BookingManager.java**
- Handles major booking operations.
- Performs booking, cancellation, searching, modification, and ticket-related operations.

**Ticket.java**
- Represents ticket information.
- Displays passenger and booking details.

**FareCalculator.java**
- Calculates fare according to passenger age.

**Validator.java**
- Validates user input.
- Checks names, ages, phone numbers, and seat numbers.

**PNRGenerator.java**
- Generates PNR numbers for bookings.

**Statistics.java**
- Calculates and displays basic booking statistics.

**TestModule.java**
- Runs validation and functional tests for important system components.

---

## Project Structure

```text
Train-Booking-System-Java/
│
├── .gitignore
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

## Class Responsibilities

| Class | Responsibility |
|---|---|
| `Main.java` | Main menu and program control |
| `Passenger.java` | Stores passenger information |
| `Train.java` | Manages train and seat information |
| `BookingManager.java` | Handles booking-related operations |
| `Ticket.java` | Stores and displays ticket information |
| `FareCalculator.java` | Calculates passenger fare |
| `Validator.java` | Performs input validation |
| `PNRGenerator.java` | Generates PNR numbers |
| `Statistics.java` | Displays booking statistics |
| `TestModule.java` | Performs functional and validation tests |

---

## How to Run

### Prerequisites

- Java Development Kit (JDK) installed.
- Command Prompt / Terminal.
- VS Code or another Java-compatible IDE.

### Check Java Installation

```cmd
java -version
```

Check the Java compiler:

```cmd
javac -version
```

### Compile the Project

From the project root folder:

```cmd
javac -d out src\trainbooking\*.java
```

### Run the Project

```cmd
java -cp out trainbooking.Main
```

---

## Main Menu

The application provides the following menu:

```text
=============================
      TRAIN BOOKING SYSTEM
=============================

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

Enter your choice:
```

---

## Pseudocode

### Book Seat

```text
ALGORITHM bookSeat
    INPUT passenger details
    INPUT required seat number

    IF passenger details are invalid
        DISPLAY validation error
        RETURN
    END IF

    IF seat number is invalid
        DISPLAY invalid seat message
        RETURN
    END IF

    IF seat is already booked
        DISPLAY seat unavailable
        RETURN
    END IF

    CALCULATE fare using passenger age
    GENERATE PNR number
    STORE passenger and booking details
    MARK seat as booked

    DISPLAY booking successful
    DISPLAY PNR and fare
END ALGORITHM
```

### Cancel Booking

```text
ALGORITHM cancelBooking
    INPUT booking/passenger information

    SEARCH for the booking

    IF booking does not exist
        DISPLAY booking not found
        RETURN
    END IF

    REMOVE booking
    MARK seat as available

    DISPLAY cancellation successful
END ALGORITHM
```

### Fare Calculation

```text
ALGORITHM calculateFare(age)

    IF age < 5
        RETURN 0

    ELSE IF age <= 12
        RETURN 250

    ELSE IF age < 60
        RETURN 500

    ELSE
        RETURN 350
    END IF

END ALGORITHM
```

### Main Application Loop

```text
ALGORITHM main

    INITIALIZE train and booking system

    WHILE user has not selected Exit
        DISPLAY main menu
        INPUT choice

        SWITCH choice

            CASE 1:
                DISPLAY available seats

            CASE 2:
                BOOK a seat

            CASE 3:
                DISPLAY booked seats

            CASE 4:
                CANCEL booking

            CASE 5:
                PRINT ticket

            CASE 6:
                SEARCH passenger

            CASE 7:
                MODIFY booking

            CASE 8:
                DISPLAY booking statistics

            CASE 9:
                RUN tests

            CASE 10:
                EXIT program

            DEFAULT:
                DISPLAY invalid choice

        END SWITCH
    END WHILE

END ALGORITHM
```

---

## System Workflow

```text
START
   |
   v
Initialize Train Booking System
   |
   v
Display Main Menu
   |
   v
User Selects an Option
   |
   +--> 1. Display Available Seats
   |         |
   |         +--> Show available seats
   |         |
   |         +--> Return to Menu
   |
   +--> 2. Book a Seat
   |         |
   |         +--> Enter passenger details
   |         +--> Validate input
   |         +--> Check seat availability
   |         +--> Calculate fare
   |         +--> Generate PNR
   |         +--> Confirm booking
   |         |
   |         +--> Return to Menu
   |
   +--> 3. Display Booked Seats
   |         |
   |         +--> Show booked seats
   |         +--> Return to Menu
   |
   +--> 4. Cancel Booking
   |         |
   |         +--> Find booking
   |         +--> Cancel booking
   |         +--> Make seat available
   |         +--> Return to Menu
   |
   +--> 5. Print Ticket
   |         |
   |         +--> Find booking
   |         +--> Display ticket
   |         +--> Return to Menu
   |
   +--> 6. Search Passenger
   |         |
   |         +--> Search passenger
   |         +--> Display result
   |         +--> Return to Menu
   |
   +--> 7. Modify Booking
   |         |
   |         +--> Find booking
   |         +--> Update details
   |         +--> Return to Menu
   |
   +--> 8. Booking Statistics
   |         |
   |         +--> Calculate statistics
   |         +--> Display result
   |         +--> Return to Menu
   |
   +--> 9. Run Tests
   |         |
   |         +--> Execute TestModule
   |         +--> Display PASS/FAIL
   |         +--> Return to Menu
   |
   +--> 10. Exit
             |
             v
           END
```

---

## Flowchart

```text
                    ┌───────────────────┐
                    │       START       │
                    └─────────┬─────────┘
                              |
                              v
                    ┌───────────────────┐
                    │ Initialize System │
                    └─────────┬─────────┘
                              |
                              v
                    ┌───────────────────┐
                    │   Display Menu    │
                    └─────────┬─────────┘
                              |
                 ┌────────────┴────────────┐
                 |      User Choice        |
                 └────────────┬────────────┘
                              |
       ┌──────────┬───────────┼───────────┬──────────┐
       |          |           |           |          |
       v          v           v           v          v
   Available   Book Seat   Booked     Cancel      Ticket
     Seats                  Seats      Booking      Print
       |          |           |           |          |
       |          v           |           |          |
       |      Validate        |        Find Booking  |
       |          |           |           |          |
       |      Check Seat      |        Cancel       |
       |          |           |           |          |
       |      Calculate       |        Free Seat     |
       |        Fare          |           |          |
       |          |           |           |          |
       |      Generate PNR    |           |          |
       |          |           |           |          |
       └──────────┴───────────┴───────────┴──────────┘
                              |
                              v
                    ┌───────────────────┐
                    │ Return to Menu    │
                    └─────────┬─────────┘
                              |
                    ┌─────────▼─────────┐
                    │   Exit Selected?  │
                    └───────┬─────┬─────┘
                            |     |
                           NO    YES
                            |     |
                            |     v
                            |   ┌───────┐
                            |   │  END  │
                            |   └───────┘
                            |
                            └──> Menu
```

---

## Key Data and Logic

### Passenger Data

The system maintains passenger details including:

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

### Fare Rules

| Age Group | Fare |
|---|---:|
| Below 5 years | ₹0 |
| 5–12 years | ₹250 |
| 13–59 years | ₹500 |
| 60 years and above | ₹350 |

### PNR

A unique PNR is generated when a booking is successfully created.

---

## Functions and Operations Overview

| Component | Purpose |
|---|---|
| Display Available Seats | Shows free seats |
| Book a Seat | Creates a new passenger booking |
| Display Booked Seats | Shows occupied seats |
| Cancel Booking | Removes an existing booking |
| Print Ticket | Displays ticket details |
| Search Passenger | Finds passenger information |
| Modify Booking | Updates existing booking details |
| Booking Statistics | Shows booking-related statistics |
| Fare Calculator | Calculates fare based on age |
| Validator | Checks user input |
| PNR Generator | Creates booking PNR |
| Test Module | Tests important system functions |

---

## Data Flow

```text
User Input
    ↓
Input Validation
    ↓
Booking / Search / Cancel / Modify Operation
    ↓
Passenger & Seat Data Update
    ↓
Fare Calculation / PNR Generation
    ↓
Ticket or Result Display
    ↓
Return to Main Menu
```

---

## Error Handling

The system includes basic error handling and validation mechanisms.

- **Invalid Name:** Prevents empty passenger names.
- **Invalid Age:** Checks that the entered age is within the accepted range.
- **Invalid Phone Number:** Checks for a valid 10-digit phone number.
- **Invalid Seat Number:** Prevents seat numbers outside the available range.
- **Occupied Seat:** Prevents booking an already booked seat.
- **Invalid Menu Choice:** Displays an error message for unsupported choices.
- **Incorrect Input Type:** Handles invalid numeric input using Java input exception handling.
- **Missing Booking:** Displays an appropriate message when a booking cannot be found.

---

## Advantages of This Implementation

- **Modular Design:** Different responsibilities are separated into individual Java classes.
- **Easy to Understand:** Uses a simple console-based interface.
- **Input Validation:** Reduces invalid data entry.
- **Reusable Components:** Fare calculation, validation, and PNR generation are separated into their own classes.
- **Maintainability:** Individual classes can be modified without changing the complete application.
- **Testing Support:** A dedicated testing module is included.
- **Version Control:** The project is maintained using Git and GitHub.

---

## Limitations and Future Enhancements

### Current Limitations

- Booking information is stored in memory and is lost when the program is closed.
- The application currently uses a console interface.
- The project does not use a permanent database.
- The system is designed for basic booking operations rather than a complete railway reservation platform.

### Suggested Enhancements

- Add MySQL or another database for permanent storage.
- Add multiple trains and routes.
- Add train schedules and seat classes.
- Add user login and authentication.
- Add online payment functionality.
- Add a graphical user interface.
- Add booking history.
- Add email or SMS ticket confirmation.
- Add advanced reports and statistics.

---

## Testing & Validation

The project includes a `TestModule.java` class for functional and validation testing.

### Test Cases

| Test Case | Input / Condition | Expected Result |
|---|---|---|
| Test 1 | Normal fare, age 25 | ₹500 |
| Test 2 | Child fare, age 10 | ₹250 |
| Test 3 | Senior fare, age 65 | ₹350 |
| Test 4 | Valid seat number 10 | PASS |
| Test 5 | Invalid seat number 55 | PASS |
| Test 6 | Valid phone number `9876543210` | PASS |

### Running Tests

Start the program:

```cmd
java -cp out trainbooking.Main
```

Then select:

```text
9. Run Tests
```

Expected result:

```text
TEST RESULTS

Test 1: PASS
Test 2: PASS
Test 3: PASS
Test 4: PASS
Test 5: PASS
Test 6: PASS

Passed: 6
Failed: 0
```

---

## GitHub Repository

The project is maintained using Git and GitHub.

The repository contains:

- Java source files
- Organized package structure
- `.gitignore`
- Project documentation

The `.gitignore` file is used to prevent generated compiled files from being uploaded.

```gitignore
out/
*.class
.vscode/
```

---

## Conclusion

The **Train Booking System** demonstrates the implementation of a practical console-based application using Java.

The project uses multiple classes to separate responsibilities such as passenger management, train and seat management, booking operations, ticket handling, fare calculation, validation, PNR generation, statistics, and testing.

The application provides a complete basic booking workflow with input validation, error handling, and functional testing. The modular structure also provides a foundation for future improvements such as database integration, multiple trains, online payments, and a graphical user interface.

---

## References

- Oracle Java Documentation
- Java Programming concepts and Object-Oriented Programming resources
- VIT Bhopal CSE Project Guidelines
- Course material provided for the CSE Project

---

## Author Information

**Student:** Piyush Deep  
**Registration Number:** 25BAI11280  
**Institution:** Vellore Institute of Technology (VIT) Bhopal  
**Course:** Computer Science and Engineering  
**Academic Year:** 2026–2027

---

**Project:** Train Booking System  
**Technology:** Java  
**Repository:** GitHub
