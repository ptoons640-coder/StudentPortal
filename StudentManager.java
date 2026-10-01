import java.util.ArrayList;
import java.util.List;

public class StudentManager {

    private List<Student> students = new ArrayList<>();

    // Add student
    public void addStudent(Student student) {
        students.add(student);
        System.out.println("Student added successfully!");
    }

    // Display all students
    public void displayStudents() {

        if (students.isEmpty()) {
            System.out.println("No students found.");
            return;
        }

        System.out.println("\n----- Student List -----");

        for (Student student : students) {
            System.out.println(student);
        }
    }

    // Search student by ID
    public void searchById(int id) {

        students.stream()
                .filter(student -> student.getId() == id)
                .findFirst()
                .ifPresentOrElse(
                        student -> System.out.println(student),
                        () -> System.out.println("Student not found.")
                );
    }

    // Search student by name
    public void searchByName(String name) {

        boolean found = students.stream()
                .filter(student ->
                        student.getName().equalsIgnoreCase(name))
                .peek(System.out::println)
                .findAny()
                .isPresent();

        if (!found) {
            System.out.println("Student not found.");
        }
    }

    // Edit student
    public void editStudent(int id, String name, String course, String email) {

        for (Student student : students) {

            if (student.getId() == id) {

                student.setName(name);
                student.setCourse(course);
                student.setEmail(email);

                System.out.println("Student updated successfully!");
                return;
            }
        }

        System.out.println("Student not found.");
    }

    // Delete student
    public void deleteStudent(int id) {

        boolean removed = students.removeIf(student -> student.getId() == id);

        if (removed) {
            System.out.println("Student deleted successfully!");
        } else {
            System.out.println("Student not found.");
        }
    }
}
