import java.util.Scanner;

public class IT24103767Lab5Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the number of new members introduced:");
        int New_Members = scanner.nextInt();
        
        if (New_Members < 0) {
            System.out.println("Error: Number of new members must be greater than or equal to 0.");
        } else {
            switch (New_Members) {
                case 0:
                    System.out.println("No Prize");
                    break;
                case 1:
                    System.out.println("Pen");
                    break;
                case 2:
                    System.out.println("Umbrella");
                    break;
                case 3:
                    System.out.println("Bag");
                    break;
                case 4:
                    System.out.println("Travelling Chair");
                    break;
                default:
                    System.out.println("Headphone");
                    break;
            }
        }
        
        scanner.close();
    }
}
