import java.util.Scanner;

public class IT24103767Lab5Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the first integer:");
        int Num1 = scanner.nextInt();
        
        System.out.println("Enter the second integer:");
        int Num2 = scanner.nextInt();
        
        System.out.println("Enter the third integer:");
        int Num3 = scanner.nextInt();
        
        int smallest = Num1;
        int largest = Num1;
        
        if (Num2 < smallest) {
            smallest = Num2;
        }
        
        if (Num3 < smallest) {
            smallest = Num3;
        }
        
        if (Num2 > largest) {
            largest = Num2;
        }
        
        if (Num3 > largest) {
            largest = Num3;
        }
        
        System.out.println("The smallest number is: " + smallest);
        System.out.println("The largest number is: " + largest);
        
        scanner.close();
    }
}
