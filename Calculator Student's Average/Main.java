//  Calculate a Student's Average
import java.util.Scanner;

public class Main{
    static char gradeFunction(double avg){
        if(avg>=90) return 'A';
        else if(avg>=80) return 'B';
        else if(avg>=70) return 'C';
        else if(avg >=60) return 'D';
        else return 'F';
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many grades(1 to 5) ?");
        int count = scanner.nextInt();

        if(count <1 || count>5){
            System.out.println("Invalid number . you must enter between 1 and 5");
            scanner.close();
            return ;
        }
        double sum =0.0;

        // read each grade

        for(int i=1 ; i<=count; i++){
            System.out.println("Enter grade"+ i +" :");
            double grade = scanner.nextDouble();
            sum +=grade;
        }

        double avg = sum / count;
        System.out.println("Average :" + avg);
        System.out.println("Letter grade :" +gradeFunction(avg));
        scanner.close();
    }


}