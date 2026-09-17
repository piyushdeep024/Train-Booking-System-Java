package trainbooking;

public class Passenger {

    String name;
    int age;
    String gender;
    String phone;
    String source;
    String destination;
    String journeyDate;
    int seatNumber;
    String pnr;
    double fare;

    public Passenger(String name, int age, String gender, String phone,
                     String source, String destination, String journeyDate,
                     int seatNumber, String pnr, double fare) {

        this.name = name;
        this.age = age;
        this.gender = gender;
        this.phone = phone;
        this.source = source;
        this.destination = destination;
        this.journeyDate = journeyDate;
        this.seatNumber = seatNumber;
        this.pnr = pnr;
        this.fare = fare;
    }
}