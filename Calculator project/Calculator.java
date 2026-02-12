
// Simple Calculator Project .
import java.util.Scanner;
public class Calculator {
    // Method for addition
      static double add(double a , double b){
        return a+b ;
      }
      // Method for subtraction
      static double subtract(double a , double b){
        return a-b;
      }
      // Method for multiplication
      static double multiply(double a , double b){
        return a*b;
      }
      // Method for division
      static double divide(double a , double b){
        if (b==0){
            System.out.println("Error : Cannot divide by zero");
            return 0;
        }
        return a/b;
      }
      public static void main(String[] args){
        Scanner sca = new Scanner(System.in);
        int choice;
        do{
            System.out.println("/n Calculator Menu :");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3.Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exist");
            System.out.println("Choose an option :");
              choice = sca.nextInt();
               if(choice >=1 && choice <=4){
                System.out.println("Enter first number :");
                     double num1= sca.nextDouble();
                     System.out.println("Enter second number :");
                     double num2 = sca.nextDouble();
                     double result =0;
                     switch(choice){
                        case 1:
                            result = add(num1 , num2);
                            break;
                        case 2:
                            result = subtract(num1 ,num2);
                            break;
                        case 3:
                            result = multiply(num1, num2);
                            break;
                        case 4:
                            result = divide(num1 , num2);  
                            break;

                     }
                     System.out.println("Result:"+result);
                         }
                         else if(choice !=5){
                            System.out.println("Invalid choice ! Try again.");
                         }

        }while(choice!=5);
        System.out.println("Calculator closed .");
        sca.close();

      }
    
}
