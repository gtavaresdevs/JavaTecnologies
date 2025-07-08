public class Main {
    public static void main(String[] args) {
//        BankAccount gabrielBankAccount = new BankAccount("123456789",1000.01,"Gabriel","gtavaresdev@gmail.com","(62)981998712");
        BankAccount gabrielBankAccount = new BankAccount();
        System.out.println("Account number: " + gabrielBankAccount.getAccountNumber());
        System.out.println("Email: " + gabrielBankAccount.getEmail());
        System.out.println("Phone number: " + gabrielBankAccount.getPhoneNumber());
        System.out.println("Your current balance is: $"+ gabrielBankAccount.getAccountBalance());
        gabrielBankAccount.withdrawFunds(250.56);
        System.out.println("  ");
        gabrielBankAccount.depositFunds(777.44);
        System.out.println("  ");
        gabrielBankAccount.withdrawFunds(10.99);
    }
}
