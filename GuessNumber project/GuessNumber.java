// GuessNumber game Project
import java.util.Random;
import java.util.Scanner;
public class GuessNumber {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sca = new Scanner(System.in);

        int number =rand.nextInt(10)+1; 
        int guess;

        System.out.println("Guess the number between 1 to 10");
        do{
            System.out.println("Enter your guess");
            guess = sca.nextInt();

            if(guess >number ){
                System.out.println("TOO HIGH");
            }else if(guess< number){
                System.out.println("TOO low");
            }else {
                System.out.println("Correct you win");
            }
        }while(guess!=number);
        sca.close();
    }
    
}
