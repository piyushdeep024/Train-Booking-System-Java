package trainbooking;

public class TestModule {

    public static void runTests() {

        System.out.println("\n========== TESTING ==========");

        int passed = 0;
        int failed = 0;

        // Test 1: Normal fare
        if (FareCalculator.calculateFare(25) == 500) {
            System.out.println("Test 1 - Normal Fare: PASS");
            passed++;
        } else {
            System.out.println("Test 1 - Normal Fare: FAIL");
            failed++;
        }

        // Test 2: Child fare
        if (FareCalculator.calculateFare(10) == 250) {
            System.out.println("Test 2 - Child Fare: PASS");
            passed++;
        } else {
            System.out.println("Test 2 - Child Fare: FAIL");
            failed++;
        }

        // Test 3: Senior citizen fare
        if (FareCalculator.calculateFare(65) == 350) {
            System.out.println("Test 3 - Senior Citizen Fare: PASS");
            passed++;
        } else {
            System.out.println("Test 3 - Senior Citizen Fare: FAIL");
            failed++;
        }

        // Test 4: Valid seat
        if (Validator.validSeat(10)) {
            System.out.println("Test 4 - Valid Seat: PASS");
            passed++;
        } else {
            System.out.println("Test 4 - Valid Seat: FAIL");
            failed++;
        }

        // Test 5: Invalid seat
        if (!Validator.validSeat(55)) {
            System.out.println("Test 5 - Invalid Seat: PASS");
            passed++;
        } else {
            System.out.println("Test 5 - Invalid Seat: FAIL");
            failed++;
        }

        // Test 6: Phone validation
        if (Validator.validPhone("9876543210")) {
            System.out.println("Test 6 - Phone Validation: PASS");
            passed++;
        } else {
            System.out.println("Test 6 - Phone Validation: FAIL");
            failed++;
        }

        System.out.println("------------------------------");
        System.out.println("Tests Passed : " + passed);
        System.out.println("Tests Failed : " + failed);
        System.out.println("Total Tests  : " + (passed + failed));
        System.out.println("==============================");
    }
}