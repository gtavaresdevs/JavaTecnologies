import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Initialize counter
        int counter =1;
        // Initialize sum
        double sum = 0;
        // Ask for input number until counter reaches 5
        while (counter <= 5) {
            System.out.println("Enter number #" + counter + ":");
            // Get user input
            String nextNumber = scanner.nextLine();
            // Try catch block to prevent input other than numeric
            try {
                double number = Double.parseDouble(nextNumber);
                counter++;
                sum += number;
            } catch (NumberFormatException nfe) {
                System.out.println("Invalid Number");
            }
        }
        System.out.println("Sum of numbers is: " + sum);
    }
}
