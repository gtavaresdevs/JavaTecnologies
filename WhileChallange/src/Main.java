public class Main {
    public static void main(String[] args) {
        int number =4;
        int finishNumber = 20;
        int counter = 0;
        while (number <= finishNumber) {
            number++;
            if (isEvenNumber(number)) {counter++;}
            if (!isEvenNumber(number)){continue;}
            System.out.println("Even number " + number);

        }
        System.out.println("Counter is " + counter);
    }
    public static boolean isEvenNumber (int number) {
        return (number % 2) == 0;
    }
}
