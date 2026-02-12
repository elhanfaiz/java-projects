import java.util.ArrayList;
import java.util.Scanner ;
public class TodoList {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        ArrayList<String> tasks = new ArrayList<>();
        int choice;
        do{
            System.out.println("/n1. Add Task :");
            System.out.println("2. View tasks :");
            System.out.println("3. Exist");
            System.out.println("Enter your choice ");

            choice = sca.nextInt();
            sca.nextLine();

            if(choice ==1){
                System.out.println("Enter task :");
                tasks.add(sca.nextLine());
            }else if(choice ==2){
                System.out.println("Tasks");
                for(int i=0; i<tasks.size(); i++){
                    System.out.println((i+1)+ "."+tasks.get(i));
                }
            }
        }while(choice!=3);
        sca.close();
    }
    
}
