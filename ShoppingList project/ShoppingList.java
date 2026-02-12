// ShoppingList Project
import java.util.Scanner;
public class ShoppingList{
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        System.out.println("Enter your items ");
        int n = sca.nextInt();
        sca.nextLine();
        String[] items = new String[n];

        for(int i=0; i<items.length; i++){
            System.out.println("Enter items"+(i+1)+ " :");
            items[i]=sca.nextLine();
        }

        System.out.println("/nthe shopping list");
        for(int i=0; i<items.length; i++){
            System.out.println((i+1)+" ."+items[i]);
        }
        sca.close();
    }
}