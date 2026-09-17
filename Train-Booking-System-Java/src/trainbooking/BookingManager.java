package trainbooking;

import java.util.Scanner;

public class BookingManager {

    private Train train;
    private Scanner sc;

    public BookingManager(Train train, Scanner sc) {

        this.train = train;
        this.sc = sc;
    }

    // Book a seat
    public void bookSeat() {

        train.displayAvailableSeats();

        System.out.print("\nEnter seat number: ");
        int seat = sc.nextInt();
        sc.nextLine();

        if (!Validator.validSeat(seat)) {
            System.out.println("Invalid seat number.");
            return;
        }

        if (!train.isSeatAvailable(seat)) {
            System.out.println("This seat is already booked.");
            return;
        }

        System.out.print("Enter passenger name: ");
        String name = sc.nextLine();

        if (!Validator.validName(name)) {
            System.out.println("Name cannot be empty.");
            return;
        }

        System.out.print("Enter age: ");
        int age = sc.nextInt();
        sc.nextLine();

        if (!Validator.validAge(age)) {
            System.out.println("Invalid age.");
            return;
        }

        System.out.print("Enter gender: ");
        String gender = sc.nextLine();

        System.out.print("Enter phone number: ");
        String phone = sc.nextLine();

        if (!Validator.validPhone(phone)) {
            System.out.println("Please enter a valid 10 digit phone number.");
            return;
        }

        System.out.print("Enter source: ");
        String source = sc.nextLine();

        System.out.print("Enter destination: ");
        String destination = sc.nextLine();

        System.out.print("Enter journey date (DD/MM/YYYY): ");
        String date = sc.nextLine();

        double fare = FareCalculator.calculateFare(age);

        String pnr = PNRGenerator.generatePNR();

        Passenger p = new Passenger(
            name,
            age,
            gender,
            phone,
            source,
            destination,
            date,
            seat,
            pnr,
            fare
        );

        train.seats[seat - 1] = p;

        System.out.println("\nSeat booked successfully!");
        System.out.println("PNR Number : " + pnr);
        System.out.println("Fare       : Rs. " + fare);
    }

    // Cancel a booking
    public void cancelBooking() {

        System.out.print("\nEnter seat number: ");
        int seat = sc.nextInt();

        if (!Validator.validSeat(seat)) {
            System.out.println("Invalid seat number.");
            return;
        }

        if (train.seats[seat - 1] == null) {
            System.out.println("This seat is not booked.");
            return;
        }

        Passenger p = train.seats[seat - 1];

        System.out.println("Passenger: " + p.name);
        System.out.println("PNR: " + p.pnr);

        System.out.print("Cancel this booking? (Y/N): ");
        char choice = sc.next().charAt(0);

        if (choice == 'Y' || choice == 'y') {

            train.seats[seat - 1] = null;

            System.out.println("Booking cancelled successfully.");

        } else {
            System.out.println("Booking was not cancelled.");
        }
    }

    // Search passenger
    public void searchPassenger() {

        sc.nextLine();

        System.out.print("\nEnter passenger name or PNR: ");
        String search = sc.nextLine();

        boolean found = false;

        for (int i = 0; i < Train.TOTAL_SEATS; i++) {

            Passenger p = train.seats[i];

            if (p != null) {

                if (p.name.equalsIgnoreCase(search) ||
                    p.pnr.equalsIgnoreCase(search)) {

                    System.out.println("\nPassenger Found!");
                    Ticket.printTicket(p);

                    found = true;
                }
            }
        }

        if (!found) {
            System.out.println("Passenger not found.");
        }
    }

    // Modify booking
    public void modifyBooking() {

        sc.nextLine();

        System.out.print("\nEnter PNR: ");
        String pnr = sc.nextLine();

        Passenger p = findByPNR(pnr);

        if (p == null) {
            System.out.println("Booking not found.");
            return;
        }

        System.out.println("\nCurrent Details:");
        System.out.println("Name        : " + p.name);
        System.out.println("Phone       : " + p.phone);
        System.out.println("Source      : " + p.source);
        System.out.println("Destination : " + p.destination);

        System.out.print("\nEnter new phone number: ");
        String phone = sc.nextLine();

        if (!Validator.validPhone(phone)) {
            System.out.println("Invalid phone number.");
            return;
        }

        System.out.print("Enter new source: ");
        String source = sc.nextLine();

        System.out.print("Enter new destination: ");
        String destination = sc.nextLine();

        p.phone = phone;
        p.source = source;
        p.destination = destination;

        System.out.println("Booking details updated successfully.");
    }

    public Passenger findByPNR(String pnr) {

        for (int i = 0; i < Train.TOTAL_SEATS; i++) {

            if (train.seats[i] != null &&
                train.seats[i].pnr.equalsIgnoreCase(pnr)) {

                return train.seats[i];
            }
        }

        return null;
    }

    // Print ticket
    public void printTicket() {

        System.out.print("\nEnter seat number: ");
        int seat = sc.nextInt();

        if (!Validator.validSeat(seat)) {
            System.out.println("Invalid seat number.");
            return;
        }

        Passenger p = train.seats[seat - 1];

        if (p == null) {
            System.out.println("This seat is not booked.");
            return;
        }

        Ticket.printTicket(p);
    }
}