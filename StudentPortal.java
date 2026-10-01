import java.util.Scanner;

public class StudentPortal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        StudentManager manager = new StudentManager();

        int choice;

        do {

            System.out.println("\n==============================");
            System.out.println("     STUDENT PORTAL SYSTEM");
            System.out.println("==============================");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Search Student");
            System.out.println("4. Edit Student");
            System.out.println("5. Delete Student");
            System.out.println("6. Exit");
            System.out.println("==============================");

            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

                case 1:

                    System.out.print("Enter Student ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Enter Student Name: ");
                    String name = scanner.nextLine();

                    System.out.print("Enter Course: ");
                    String course = scanner.nextLine();

                    System.out.print("Enter Email: ");
                    String email = scanner.nextLine();

                    Student student = new Student(id, name, course, email);

                    manager.addStudent(student);

                    break;

                case 2:

                    manager.displayStudents();

                    break;

                case 3:

                    System.out.println("\n1. Search by ID");
                    System.out.println("2. Search by Name");

                    System.out.print("Enter search choice: ");
                    int searchChoice = scanner.nextInt();
                    scanner.nextLine();

                    if (searchChoice == 1) {

                        System.out.print("Enter Student ID: ");
                        int searchId = scanner.nextInt();
                        scanner.nextLine();

                        manager.searchById(searchId);

                    } else if (searchChoice == 2) {

                        System.out.print("Enter Student Name: ");
                        String searchName = scanner.nextLine();

                        manager.searchByName(searchName);

                    } else {

                        System.out.println("Invalid search choice.");
                    }

                    break;

                case 4:

                    System.out.print("Enter Student ID to edit: ");
                    int editId = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Enter New Name: ");
                    String newName = scanner.nextLine();

                    System.out.print("Enter New Course: ");
                    String newCourse = scanner.nextLine();

                    System.out.print("Enter New Email: ");
                    String newEmail = scanner.nextLine();

                    manager.editStudent(
                            editId,
                            newName,
                            newCourse,
                            newEmail
                    );

                    break;

                case 5:

                    System.out.print("Enter Student ID to delete: ");
                    int deleteId = scanner.nextInt();
                    scanner.nextLine();

                    manager.deleteStudent(deleteId);

                    break;

                case 6:

                    System.out.println("Thank you for using Student Portal!");

                    break;

                default:

                    System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 6);

        scanner.close();
    }
}