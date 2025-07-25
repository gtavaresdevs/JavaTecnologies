public class Test3211 {
    public static void main(String[] args) {
        for (int counter = 1; counter <= 5; counter++) {
            System.out.println(counter);
            System.out.println("10,000% at " + counter + "%" +" interest = " + calculateInterest(10000.0, counter));
        }
        System.out.println("");
        System.out.println("------------------");
        System.out.println("");
        for (double rate = 7.5; rate <= 10; rate += 0.25) {
            double interestAmount = calculateInterest(100.00,rate);
            if (interestAmount > 8.5) {
                break;
            }
            System.out.println("$100,0 at " + rate + "%" +" interest = " + interestAmount);
        }

    }
    public static double calculateInterest (double amount, double interestRate) {
        return (amount* (interestRate/100));
    }

}
