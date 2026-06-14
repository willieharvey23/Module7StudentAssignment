// Main class starts the program
public class Main {
    public static void main(String[] args) {

        // Create DateOfBirth objects
        DateOfBirth dob1 = new DateOfBirth(3, 15, 2002);
        DateOfBirth dob2 = new DateOfBirth(7, 22, 2001);
        DateOfBirth dob3 = new DateOfBirth(11, 5, 2003);

        // Create course arrays with different course counts
        String[] courses1 = {"Object Oriented Programming", "Applied Calculus"};

        String[] courses2 = {"Object Oriented Programming", "English Composition", "Computer Science"};

        String[] courses3 = {"Object Oriented Programming", "Applied Calculus", "Database Systems", "Web Development"};

        // Create three Student objects
        Student student1 = new Student(
                "John Smith",
                dob1,
                "johnsmith@example.com",
                "555-111-2222",
                "Sophomore",
                courses1
        );

        Student student2 = new Student(
                "Maria Johnson",
                dob2,
                "mariajohnson@example.com",
                "555-333-4444",
                "Junior",
                courses2
        );

        Student student3 = new Student(
                "David Brown",
                dob3,
                "davidbrown@example.com",
                "555-555-6666",
                "Freshman",
                courses3
        );

        // Display full student information
        student1.printMe();
        student2.printMe();
        student3.printMe();

        // Display the total number of created students
        Student.displayStudentCounter();
    }
}