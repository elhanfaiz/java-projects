import java.util.Scanner ;
import java.util.ArrayList;

class Employee{
    int id;
    String name;
    double salary;

    // constructor
    Employee(int id , String name , double salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
    }
}
public class EmployeeManagementSystem {
 static ArrayList<Employee> employees= new ArrayList<>();
 static Scanner sca = new Scanner(System.in);
 public static void main(String[] args) {
    int choice ;

    do{
        System.out.println("/n-----Employee Management System");
        System.out.println("1.Add Employee");
        System.out.println("2.view all Employee");
        System.out.println("3.Search Employee by ID");
        System.out.println("4. update Salary");
        System.out.println("5. Delete Employee");
        System.out.println("6. Exist");
        System.out.println("Enter choice");
        choice=sca.nextInt();

        switch(choice){
            case 1 -> addEmployee();
            case 2 -> viewEmployees();
            case 3 -> searchEmployee();
            case 4 -> updateSalary();
            case 5 -> deleteEmployee();
            case 6 -> System.out.println("Existing System.");
            default -> System.out.println("Invalid choice");
        }

    }while(choice!=6);
 }  
 // Add Employee 
 static void addEmployee(){
    System.out.println("Enter Employee ID");
    int id = sca.nextInt();
    sca.nextLine();

    System.out.println("Enter Employee Name");
    String name = sca.nextLine();

    System.out.println("Enter Salary");
    double salary = sca.nextDouble();
    employees.add(new Employee(id ,name , salary));
    System.out.println("Employee added Successfully!");
 } 
 // view all Empoyee
 static void viewEmployees(){
    if(employees.isEmpty()){
        System.out.println("No Employee found");
        return ;

    }
    System.out.println("/n----Employee List------");
    for(Employee e : employees){
        System.out.println("ID :"+e.id+",Name:"+e.name+",salary:"+e.salary);
    }
 }
 // Search Employee
 static void searchEmployee(){
    System.out.println("Enter Employee ID to search:");
    int id = sca.nextInt();
    for(Employee e : employees){
        if(e.id==id){
            System.out.println("Employee Found :");
            System.out.println("Name :"+e.name);
            System.out.println("salary :"+e.salary);
            return ;
        }
    }
    System.out.println("Employee not found");
 }
 // update salary
 static void updateSalary(){
    System.out.println("Enter Employee ID to update:");
    int id = sca.nextInt();
    for(Employee e: employees){
        if(e.id == id){
            System.out.println("Enter new salary:");
            e.salary=sca.nextDouble();
            System.out.println("Salary updated Successfully!");
        }
    }
 }
 // Delete Employee
 static void deleteEmployee(){
    System.out.println("Enter Employee ID to delete:");
    int id = sca.nextInt();
    for(Employee e : employees){
        if(e.id == id){
            employees.remove(e);
            System.out.println("Employee deleted Successfully!");
            return ;
        }
    }
    System.out.println("Employee not found");
 }
}
