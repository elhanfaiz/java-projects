import java.util.Scanner;
class BankAccount{
    private double balance;
    // Fixed pin for authentication
    private final int pin =123;
    
    // Method to verify entered PIN
    public boolean authenticate(int enteredpin){
        return enteredpin == pin;
    }
    // Money Deposit Method
    public void deposit(double amount){
        if(amount >0){
            balance +=amount ;
            System.out.println("Deposit Successsfull !");
        }else{
            System.out.println("Invalid deposit amount !");
        }
    }
    // Money withdraw Method
    public void withdraw(double amount){
        if(amount<=0){
            System.out.println("Invalid withdrawal amount !");
        }else if(amount>balance){
            System.out.println("Insufficient balance !");
        }else{
            balance-=amount;
            System.out.println("Withdrawal Successful");
        }
    }
    //Method to display current balance
    public void checkBalance(){
        System.out.println("Current Balance :"+balance);
    }

}
// Main class
public class ATMSystem {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        BankAccount account = new BankAccount();
        int attempts =0;
        boolean accessGranted = false ;

    // User gets maximum 3 attempts to enter correct PIN
    while(attempts <3){
        System.out.println("Enter your 4-digit pin :");
        int enteredpin = sca.nextInt();
        if(account.authenticate(enteredpin)){
            accessGranted =true ;
            break ;
        }else{
            attempts++;
            System.out.println("Incorrect pin ! Attempts left: "+(3-attempts));
        }
    }
    if(!accessGranted){
        System.out.println("Card blocked ! Too many incorrect attempts");
        sca.close();
        return ;
    }
    int choice ;
    // ATM Menu
    do{
        System.out.println("/n-----ATM Menu------");
        System.out.println("1. check Balance");
        System.out.println("2. Deposit");
        System.out.println("3.Withdraw");
        System.out.println("4.Exit");
        System.out.println("Choose option");
        choice = sca.nextInt();

        switch(choice){
            case 1:
                account.checkBalance();
                break;
            case 2:
                System.out.println("Enter amount to depost ");
                double depositAmount = sca.nextDouble();
                account.deposit(depositAmount);
                break;
            case 3:
                System.out.println("Enter amount to withdraw");
                double withdrawAmount = sca.nextDouble();
                account.withdraw(withdrawAmount);
                break;
            case 4:
                System.out.println("Thank you for using ATM .");
                break;
            default:
                System.out.println("Invalid option ! try again");
        }

    }while(choice!=4);
    sca.close();
    }
    
}
