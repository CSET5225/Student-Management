import java.util.Scanner;
public class SMS {
    private final Student[] students;
    private int size;
    private final int capacity;

    public SMS(int capacity) {
        this.capacity = capacity;
        students = new Student[capacity];
        size = 0;
    }

    public void addStudent(Scanner scanner) {
        if (size < capacity) {
            System.out.println("\nEnter student information:");
            System.out.print("ID: ");
            int id = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Name: ");
            String name = scanner.nextLine();

            System.out.print("Age: ");
            int age = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Grade: ");
            String grade = scanner.nextLine();

            students[size++] = new Student(id, name, age, grade);
            System.out.println("Student added successfully.");
        } else {
            System.out.println("Cannot add student. Student list is full.");
        }
    }

    public void deleteStudent(Scanner scanner) {
        System.out.println("Enter the details of the student to delete:");
        System.out.print("ID (or enter -1 to skip): ");
        int deleteID = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        System.out.print("Name (or press enter \"\" to skip): ");
        String deleteName = scanner.nextLine();

        System.out.print("Age (or enter -1 to skip): ");
        int deleteAge = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        System.out.print("Grade (or press enter \"\" to skip): ");
        String deleteGrade = scanner.nextLine();

        int index = searchStudent(deleteID, deleteName, deleteAge, deleteGrade);
        if (index != -1) {
            deleteStudentAtIndex(index);
            System.out.println("Student deleted successfully.");
        } else {
            System.out.println("Student not found.");
        }
    }

    private void deleteStudentAtIndex(int index) {
        for (int i = index; i < size - 1; i++) {
            students[i] = students[i + 1];
        }
        size--;
    }

    public void searchStudent(Scanner scanner) {
        System.out.println("Enter the details of the student to search:");
        System.out.print("ID (or enter -1 to skip): ");
        int searchID = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        System.out.print("Name (or press enter \"\" to skip): ");
        String searchName = scanner.nextLine();

        System.out.print("Age (or enter -1 to skip): ");
        int searchAge = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        System.out.print("Grade (or press enter \"\" to skip): ");
        String searchGrade = scanner.nextLine();

        int index = searchStudent(searchID, searchName, searchAge, searchGrade);
        if (index != -1) {
            System.out.println("Student found at index " + index);
            System.out.println("ID: " + students[index].ID + ", Name: " + students[index].name + ", Age: " + students[index].age + ", Grade: " + students[index].grade);
        } else {
            System.out.println("Student not found.");
        }
    }

    public int searchStudent(int searchID, String searchName, int searchAge, String searchGrade) {
        for (int i = 0; i < size; i++) {
            boolean idMatch = (searchID == -1 || students[i].ID == searchID);
            boolean nameMatch = (searchName.isEmpty() || students[i].name.equals(searchName));
            boolean ageMatch = (searchAge == -1 || students[i].age == searchAge);
            boolean gradeMatch = (searchGrade.isEmpty() || students[i].grade.equals(searchGrade));

            if (idMatch && nameMatch && ageMatch && gradeMatch) {
                return i; // Return index of student if found
            }
        }
        return -1; // Return -1 if student not found
    }

    public void displayStudents() {
        if (size == 0) {
            System.out.println("Student list is empty.");
        } else {
            System.out.println("List of students:");
            for (int i = 0; i < size; i++) {
                System.out.println("ID: " + students[i].ID + ", Name: " + students[i].name + ", Age: " + students[i].age + ", Grade: " + students[i].grade);
            }
        }
    }

    public void sortStudents(Scanner scanner) {
        System.out.println("Choose the sorting criteria:");
        System.out.println("1. Sort by ID");
        System.out.println("2. Sort by Name");
        System.out.println("3. Sort by Age");
        System.out.println("4. Sort by Grade");
        System.out.println("5. Exit");

        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        switch (choice) {
            case 1:
                sortAlgorithms.bubbleSortByID(students, size);
                System.out.println("Students sorted by ID.");
                break;
            case 2:
                sortAlgorithms.bubbleSortByName(students, size);
                System.out.println("Students sorted by Name.");
                break;
            case 3:
                sortAlgorithms.bubbleSortByAge(students, size);
                System.out.println("Students sorted by Age.");
                break;
            case 4:
                sortAlgorithms.bubbleSortByGrade(students, size);
                System.out.println("Students sorted by Grade.");
                break;
            case 5:
                System.out.println("Exiting sorting menu.");
                break;
            default:
                System.out.println("Invalid choice.");
        }
    }
}