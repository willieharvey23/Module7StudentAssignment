// Student class models a real student object
class Student {
    // Properties for the student
    private String name;
    private int age;
    private String email;
    private String phoneNumber;
    private String stage;
    private String[] registeredCourses;

    // Constructor that accepts all properties as parameters
    public Student(String name, int age, String email, String phoneNumber, String stage, String[] registeredCourses) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.stage = stage;
        this.registeredCourses = registeredCourses;
    }

    // Method that prints all student information
    public void printMe() {
        System.out.println("Student Information");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Email: " + email);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Stage: " + stage);

        System.out.println("Registered Courses:");
        for (int i = 0; i < registeredCourses.length; i++) {
            System.out.println((i + 1) + ". " + registeredCourses[i]);
        }

        System.out.println();
    }
}

// Main class runs the program
public class Main {
    public static void main(String[] args) {
        // Courses for the first student
        String[] studentOneCourses = {
            "Object Oriented Programming",
            "Applied Calculus"
        };

        // Courses for the second student
        String[] studentTwoCourses = {
            "Java Programming",
            "Database Systems",
            "Web Development"
        };

        // Courses for the third student
        String[] studentThreeCourses = {
            "Computer Science Basics",
            "Networking",
            "Software Development",
            "Data Structures",
            "Cybersecurity",
            "Project Management"
        };

        // Creating three Student objects using the constructor
        Student studentOne = new Student(
            "Willie Harvey",
            24,
            "willie.harvey@email.com",
            "555-123-4567",
            "Junior",
            studentOneCourses
        );

        Student studentTwo = new Student(
            "Maria Johnson",
            21,
            "maria.johnson@email.com",
            "555-234-5678",
            "Sophomore",
            studentTwoCourses
        );

        Student studentThree = new Student(
            "James Carter",
            23,
            "james.carter@email.com",
            "555-345-6789",
            "Senior",
            studentThreeCourses
        );

        // Printing each student's information
        studentOne.printMe();
        studentTwo.printMe();
        studentThree.printMe();
    }
}