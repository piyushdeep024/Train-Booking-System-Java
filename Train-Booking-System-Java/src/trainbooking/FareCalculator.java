package trainbooking;

public class FareCalculator {

    public static double calculateFare(int age) {

        double fare = 500;

        if (age < 5) {
            return 0;
        }

        if (age <= 12) {
            return 250;
        }

        if (age >= 60) {
            return 350;
        }

        return fare;
    }
}