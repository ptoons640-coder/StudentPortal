public class Student {

    private int id;
    private String name;
    private String course;
    private String email;

    // Constructor
    public Student(int id, String name, String course, String email) {
        this.id = id;
        this.name = name;
        this.course = course;
        this.email = email;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCourse() {
        return course;
    }

    public String getEmail() {
        return email;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Display student information
    @Override
    public String toString() {
        return "ID: " + id +
               " | Name: " + name +
               " | Course: " + course +
               " | Email: " + email;
    }
}