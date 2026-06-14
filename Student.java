// Student class models a real student object
public class Student {
    private final String name;
    private final DateOfBirth dateOfBirth;
    private final String email;
    private final String phoneNumber;
    private final String stage;
    private final String[] registeredCourses;

    // Static counter shared by all Student objects
    private static int studentCounter = 0;

    // Constructor that accepts all student properties
    public Student(String name, DateOfBirth dateOfBirth, String email, String phoneNumber, String stage, String[] registeredCourses) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.stage = stage;
        this.registeredCourses = registeredCourses;

        // Increase the counter each time a new student is created
        studentCounter++;
    }

    // Static method that returns the total number of students created
    public static int getStudentCounter() {
        return studentCounter;
    }

    // Static method that displays the total number of students created
    public static void displayStudentCounter() {
        System.out.println("Total Students Created: " + studentCounter);
    }

    // Method that prints all student information
    public void printMe() {
        System.out.println("Student Information");
        System.out.println("Name: " + name);
        System.out.println("Date of Birth: " + dateOfBirth.getFormattedDate());
        System.out.println("Email: " + email);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Stage: " + stage);
        System.out.println("Course Count: " + registeredCourses.length);
        System.out.println("Registered Courses:");

        for (String course : registeredCourses) {
            System.out.println("  " + course);
        }

        System.out.println();
    }
}