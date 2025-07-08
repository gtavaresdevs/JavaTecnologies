public class DigitSumChallange {
    public static void main(String[] args) {
        System.out.println("Sum of digits is: " + sumDigits(1234));
    }
    public static int sumDigits (int number){
        int sum =0;
        if (number >=0 ){
            while (number >9) {
                sum += (number %10);
                number = number/10;
            }
            sum += number;
            return sum;
        }
        return -1;
    }
}
