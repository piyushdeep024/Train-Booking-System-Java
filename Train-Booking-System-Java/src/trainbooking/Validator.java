package trainbooking;

public class Validator {

    public static boolean validSeat(int seat) {

        return seat >= 1 && seat <= Train.TOTAL_SEATS;
    }

    public static boolean validAge(int age) {

        return age > 0 && age <= 100;
    }

    public static boolean validPhone(String phone) {

        return phone.matches("\\d{10}");
    }

    public static boolean validName(String name) {

        return !name.trim().isEmpty();
    }
}