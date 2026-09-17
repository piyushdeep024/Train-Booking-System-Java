package trainbooking;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Train train = new Train();

        BookingManager booking =
                new BookingManager(train, sc);

        int choice = 0;

        do {

            System.out.println("\n================================");
            System.out.println("       TRAIN BOOKING SYSTEM");
            System.out.println("================================");
            System.out.println("1. Display Available Seats");
            System.out.println("2. Book a Seat");
            System.out.println("3. Display Booked Seats");
            System.out.println("4. Cancel Booking");
            System.out.println("5. Print Ticket");
            System.out.println("6. Search Passenger");
            System.out.println("7. Modify Booking");
            System.out.println("8. Booking Statistics");
            System.out.println("9. Run Tests");
            System.out.println("10. Exit");
            System.out.println("================================");

            try {

                System.out.print("Enter your choice: ");
                choice = sc.nextInt();

                switch (choice) {

                    case 1:
                        train.displayAvailableSeats();
                        break;

                    case 2:
                        booking.bookSeat();
                        break;

                    case 3:
                        train.displayBookedSeats();
                        break;

                    case 4:
                        booking.cancelBooking();
                        break;

                    case 5:
                        booking.printTicket();
                        break;

                    case 6:
                        booking.searchPassenger();
                        break;

                    case 7:
                        booking.modifyBooking();
                        break;

                    case 8:
                        Statistics.showStatistics(train);
                        break;

                    case 9:
                        TestModule.runTests();
                        break;

                    case 10:
                        System.out.println(
                            "Thank you for using Train Booking System!"
                        );
                        break;

                    default:
                        System.out.println(
                            "Invalid choice. Please try again."
                        );
                }

            } catch (InputMismatchException e) {

                System.out.println(
                    "Invalid input. Please enter numbers only."
                );

                sc.nextLine();
            }

        } while (choice != 10);

        sc.close();
    }
}