public class Main {
    public static void main(String[] args) {
        int counter = 0;
        int sumOfNumber = 0;
        for (int i = 1; i<=1000; i++) {
            if (i%3 == 0 && i%5 == 0) {
                counter++;
                System.out.println("Number that can be divided by 3 and 5: " + i);
                sumOfNumber += i;
            }
            if(counter == 5) {
                break;
            }
        }
        System.out.println("Sum of numbers after 5 are found: " + sumOfNumber);
    }
}
