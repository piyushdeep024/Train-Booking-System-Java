package trainbooking;

public class Train {

    public static final int TOTAL_SEATS = 50;

    Passenger[] seats = new Passenger[TOTAL_SEATS];

    public boolean isSeatAvailable(int seatNumber) {

        if (seatNumber < 1 || seatNumber > TOTAL_SEATS) {
            return false;
        }

        return seats[seatNumber - 1] == null;
    }

    public void displayAvailableSeats() {

        System.out.println("\n----- Available Seats -----");

        int count = 0;

        for (int i = 0; i < TOTAL_SEATS; i++) {

            if (seats[i] == null) {

                System.out.print((i + 1) + " ");
                count++;

                if (count % 10 == 0) {
                    System.out.println();
                }
            }
        }

        if (count == 0) {
            System.out.println("No seats are available.");
        }

        System.out.println("\nTotal Available Seats: " + count);
    }

    public void displayBookedSeats() {

        System.out.println("\n----- Booked Seats -----");

        boolean found = false;

        for (int i = 0; i < TOTAL_SEATS; i++) {

            if (seats[i] != null) {

                Passenger p = seats[i];

                System.out.println(
                    "Seat: " + p.seatNumber +
                    " | Name: " + p.name +
                    " | PNR: " + p.pnr
                );

                found = true;
            }
        }

        if (!found) {
            System.out.println("No seats are currently booked.");
        }
    }
}