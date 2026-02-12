import java.util.Scanner ;
class Book{
    int id;
    String title;
    String author;
    boolean isIssued;

    // Constructor
    Book(int id , String title , String author){
        this.id=id;
        this.title=title;
        this.author=author;
        this.isIssued = false;
    }
}
public class LibraryManagementSystem {
static Book[] books =new Book[10];
static int count =0;

public static void main(String[] args) {

    Scanner sca = new Scanner(System.in);
    int choice;

    while (true) {
        System.out.println("\n===== Library Management System =====");
        System.out.println("1. Add Book");
        System.out.println("2. View Books");
        System.out.println("3. Issue Book");
        System.out.println("4. Return Book");
        System.out.println("5. Exit");
        System.out.print("Enter choice: ");

        if (!sca.hasNextInt()) {      
            System.out.println("Please enter a number only!");
            sca.next();               
            continue;
        }

        choice = sca.nextInt();

        switch (choice) {
            case 1:
                addBooks(sca);
                break;
            case 2:
                viewBooks();
                break;
            case 3:
                issueBooks(sca);
                break;
            case 4:
                returnBooks(sca);
                break;
            case 5:
                System.out.println("Exiting Library System...");
                sca.close();
                return;   
            default:
                System.out.println("Invalid choice! Try again.");
        }
    }
}

// Add Book
static void addBooks(Scanner sca){
    if(count>=books.length){
        System.out.println("Library is full !");
        return ;
    }
    System.out.println("Enter Book ID :");
    int id = sca.nextInt();
    sca.nextLine();

    System.out.println("Enter Book title");
    String title = sca.nextLine();
    System.out.println("Enter Author Name :");
    String author = sca.nextLine();
    books[count] =new Book(id , title , author);
    count++;
    System.out.println("Books added Successfully");

}
// view Book
static void viewBooks(){
    if(count==0){
        System.out.println("No books avaliable");
        return ;
    }
    System.out.println("/n-----Book List-----");
        for (int i = 0; i < count; i++) {
            System.out.println(
                "ID: " + books[i].id +
                ", Title: " + books[i].title +
                ", Author: " + books[i].author +
                ", Issued: " + (books[i].isIssued ? "Yes" : "No")
            );
    }
}
// Issued Book
static void issueBooks(Scanner sca){
    System.out.print("Enter Book ID to issue: ");
        int id = sca.nextInt();

        for (int i = 0; i < count; i++) {
            if (books[i].id == id) {
                if (!books[i].isIssued) {
                    books[i].isIssued = true;
                    System.out.println("Book issued successfully!");
                } else {
                    System.out.println("Book already issued!");
                }
                return;
}
}
System.out.println("Book not found");
}
// Return book
static void returnBooks(Scanner sca){
    System.out.println("Enter book ID to return");
    int id = sca.nextInt();

    for (int i = 0; i < count; i++) {
            if (books[i].id == id) {
                if (books[i].isIssued) {
                    books[i].isIssued = false;
                    System.out.println("Book returned successfully!");
                } else {
                    System.out.println("Book was not issued!");
                }
                return;
            }
        }
        System.out.println("Book not found!");
    }
}



