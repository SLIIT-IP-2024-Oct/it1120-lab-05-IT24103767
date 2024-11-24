import java.util.Scanner;

public class IT24103767Lab5Q3 {
    // Constants 
    public static final double ROOM_CHARGE_PER_DAY = 48000.00;
    public static final int DISCOUNT_THRESHOLD_1 = 3;
    public static final int DISCOUNT_THRESHOLD_2 = 5;
    public static final double DISCOUNT_RATE_1 = 10.0;
    public static final double DISCOUNT_RATE_2 = 20.0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter start date (day):");
        int startDate = scanner.nextInt();
        if (startDate < 1 || startDate > 31) {
            System.out.println("Error: Start date must be between 1 and 31.");
            scanner.close();
            return;
        }
        System.out.println("Enter end date (day):");
        int endDate = scanner.nextInt();
        if (endDate < 1 || endDate > 31) {
            System.out.println("Error: End date must be between 1 and 31.");
            scanner.close();
            return;
        }
        if (startDate >= endDate) {
            System.out.println("Error: Start date must be less than end date.");
            scanner.close();
            return;
        }
        int numDaysReserved = endDate - startDate;
        double discountRate = 0.0;
        if (numDaysReserved >= DISCOUNT_THRESHOLD_2) {
            discountRate = DISCOUNT_RATE_2;
        } else if (numDaysReserved >= DISCOUNT_THRESHOLD_1) {
            discountRate = DISCOUNT_RATE_1;
        }
        double totalAmount = numDaysReserved * ROOM_CHARGE_PER_DAY;
        double discountAmount = totalAmount * (discountRate / 100);
        double totalAmountToBePaid = totalAmount - discountAmount;
        System.out.println("Number of days reserved: " + numDaysReserved);
        System.out.printf("Total amount to be paid: %.2f%n", totalAmountToBePaid);

        scanner.close();
    }
}
