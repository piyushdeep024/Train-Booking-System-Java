package trainbooking;

public class Ticket {

    public static void printTicket(Passenger p) {

        System.out.println("\n========== TRAIN TICKET ==========");
        System.out.println("Train        : VIT Express");
        System.out.println("Train Number : 12345");
        System.out.println("----------------------------------");
        System.out.println("PNR          : " + p.pnr);
        System.out.println("Name         : " + p.name);
        System.out.println("Age          : " + p.age);
        System.out.println("Gender       : " + p.gender);
        System.out.println("Phone        : " + p.phone);
        System.out.println("From         : " + p.source);
        System.out.println("To           : " + p.destination);
        System.out.println("Journey Date : " + p.journeyDate);
        System.out.println("Seat Number  : " + p.seatNumber);
        System.out.println("Fare         : Rs. " + p.fare);
        System.out.println("==================================");
    }
}