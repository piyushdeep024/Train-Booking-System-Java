package trainbooking;

public class Statistics {

    public static void showStatistics(Train train) {

        int booked = 0;
        int children = 0;
        int adults = 0;
        int seniorCitizens = 0;

        double totalCollection = 0;

        for (int i = 0; i < Train.TOTAL_SEATS; i++) {

            Passenger p = train.seats[i];

            if (p != null) {

                booked++;
                totalCollection += p.fare;

                if (p.age < 13) {
                    children++;
                }
                else if (p.age >= 60) {
                    seniorCitizens++;
                }
                else {
                    adults++;
                }
            }
        }

        int available = Train.TOTAL_SEATS - booked;

        double percentage =
            (booked * 100.0) / Train.TOTAL_SEATS;

        System.out.println("\n----- Booking Statistics -----");
        System.out.println("Total Seats      : " + Train.TOTAL_SEATS);
        System.out.println("Booked Seats     : " + booked);
        System.out.println("Available Seats  : " + available);
        System.out.println("Children         : " + children);
        System.out.println("Adults           : " + adults);
        System.out.println("Senior Citizens  : " + seniorCitizens);
        System.out.println("Total Collection : Rs. " + totalCollection);
        System.out.println("Seats Filled     : " + percentage + "%");
    }
}