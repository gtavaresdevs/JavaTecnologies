public class Main {
    public static void main(String[] args) {
        Employee gabriel = new Employee("Gabriel", "05/08/1996", "10/02/2024");
        System.out.println(gabriel);
        System.out.println("Age = " + gabriel.getAge());
        System.out.println("Pay = " + gabriel.collectPay());
        SalariedEmployee joe = new SalariedEmployee("Joe","11/11/1990","10/02/2025",65000);
        System.out.println(joe);
        System.out.println("Joe's Paycheck = $" + joe.collectPay());
        joe.retire();
        System.out.println("Joe's Pension check = $" + joe.collectPay());
        HourlyEmployee mary = new HourlyEmployee("Mary", "05/05/1970", "03/03/2021",15);
        System.out.println(mary);
        System.out.println("Mary's Paycheck = $" + mary.collectPay());
        System.out.println("Mary's Holiday Pay = $" + mary.getDoublePay());
    }
}
