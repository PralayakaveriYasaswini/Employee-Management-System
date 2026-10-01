import java.util.Scanner;

public class EmployeeManagementSystem {
    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("\n===== Employee Management System =====");
            System.out.println("1. Add Employee");
            System.out.println("2. View Employees");
            System.out.println("3. Search Employee");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("Add Employee selected");
                    break;
                case 2:
                    System.out.println("View Employees selected");
                    break;

                case 3:
                    System.out.println("Search Employee selected");
                    break;
                case 4:
                    System.out.println("Thank you!");
                    scanner.close();
                    return;
                default: System.out.println("Invalid choice");

            }
        }
    }
}
