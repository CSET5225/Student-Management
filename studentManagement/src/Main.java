import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the maximum number of students: ");
        int capacity = scanner.nextInt();
        scanner.nextLine();

        SMS studentSystem = new SMS(capacity);

        boolean exit = false;
        while (!exit) {
            System.out.println("\nChoose an operation:");
            System.out.println("1. Add Student");
            System.out.println("2. Delete Student");
            System.out.println("3. Search Student");
            System.out.println("4. Display Students");
            System.out.println("5. Sort Students");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    studentSystem.addStudent(scanner);
                    break;
                case 2:
                    studentSystem.deleteStudent(scanner);
                    break;
                case 3:
                    studentSystem.searchStudent(scanner);
                    break;
                case 4:
                    studentSystem.displayStudents();
                    break;
                case 5:
                    studentSystem.sortStudents(scanner);
                    break;
                case 6:
                    exit = true;
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number from 1 to 6.");
            }
        }
    }
}