public class BankAccount {
    private String accountNumber;
    private double accountBalance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public BankAccount() {
        this("543211", 550.00,"Tavares","Default address", "Default phone number");
        System.out.println("Empty constructor called");
    }
    public BankAccount(String accountNumber, double accountBalance, String customerName, String email, String phoneNumber) {
        System.out.println("Constructor was successfully called!");
        this.accountNumber =  accountNumber;
        this.accountBalance = accountBalance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public void depositFunds (double depositAmount){
        // Add funds to account
        accountBalance += depositAmount;
        // Return confirmation message
        System.out.print("Deposit of $" + depositAmount + " made. New balance is $" + this.accountBalance);
    }
    public void withdrawFunds (double withdrawAmount) {
        //Remove funds from account and prevent from withdrawing if amount is negative

        if (this.accountBalance - withdrawAmount < 0) {
           System.out.print("Your balance is $" + this.accountBalance + ". You can't withdraw the amount you chosen.");
        }
        //Add and Return confirmation message
        else {
            this.accountBalance -= withdrawAmount;
            System.out.print("You successfully withdrew $" + withdrawAmount + ". Your remaining balance is $" + this.accountBalance);
        }
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
