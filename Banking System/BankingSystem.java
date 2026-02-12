import java.util.Scanner;

class BankAccount {
    private String accountHolder;
    private int accountNumber;
    private double balance;
   // Constructor
    BankAccount(String name, int accNo) {
        accountHolder = name;
        accountNumber = accNo;
        balance = 0;
    }
    // Deposit Money
    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Amount deposited successfully.");
        } else {
            System.out.println("Invalid amount!");
        }
    }
    // Withdraw Money
    void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance!");
        } else if (amount > 0) {
            balance -= amount;
            System.out.println("Amount withdrawn successfully.");
        } else {
            System.out.println("Invalid amount!");
        }
    }
    //Display amount details
    void displayAccount() {
        System.out.println("\nAccount Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}

public class BankingSystem {
    public static void main(String[] args) {

        Scanner sca = new Scanner(System.in);
        BankAccount account = null;
        int choice;

        do {
            System.out.println("\n   Banking System Menu   ");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. View Account Details");
            System.out.println("5. Exit");
            System.out.print("Choose option: ");

            choice = sca.nextInt();
            sca.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter account holder name: ");
                    String name = sca.nextLine();
                    System.out.print("Enter account number: ");
                    int accNo = sca.nextInt();
                    account = new BankAccount(name, accNo);
                    System.out.println("Account created successfully!");
                    break;

                case 2:
                    if (account == null)
                        System.out.println("Please create an account first.");
                    else {
                        System.out.print("Enter amount to deposit: ");
                        account.deposit(sca.nextDouble());
                    }
                    break;

                case 3:
                    if (account == null)
                        System.out.println("Please create an account first.");
                    else {
                        System.out.print("Enter amount to withdraw: ");
                        account.withdraw(sca.nextDouble());
                    }
                    break;

                case 4:
                    if (account == null)
                        System.out.println("Please create an account first.");
                    else
                        account.displayAccount();
                    break;

                case 5:
                    System.out.println("Thank you for using Banking System.");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 5);

        sca.close();
    }
}
