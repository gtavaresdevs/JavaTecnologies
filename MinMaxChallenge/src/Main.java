import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // scan user input
        Scanner scanner = new Scanner(System.in);
        // define min max variables as double and loop counter
        double max = 0;
        double min = 0;
        int loopCount = 0;
        // create condition upon user input
        while (true) {
            // ask for number or any character and waits for input
            System.out.println("Enter a number, or any character to exit:");
            String nextEntry = scanner.nextLine();
            // validation upon min max, if loop count is 0 and valid number less than min will equal valid num
            // Validation upon min max, if loop count is 0 or validNum greater than max then max equal valid num
            // if fallback does not exit loop count adds 1.
            // Catch NFE and break from while loop
            try {
                // Assigns user input to variable
                double validNum = Double.parseDouble(nextEntry);
                if (loopCount == 0 || validNum < min) {
                    min = validNum;
                }
                if (loopCount == 0 || validNum > max) {
                    max = validNum;
                }
                loopCount++;
            } catch (NumberFormatException nfe) {
                break;
            }
        }
        if (loopCount >0) {
            System.out.println("min = " + min + ", max = " + max);
        }
        else {
            System.out.println("No valid data entered");
        }
    }
}
