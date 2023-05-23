package oop.methods;

class Student {
    private int id;
    private String name;
    private String course;
    private double fee;

    // First constructor with no parameters
    public Student() {
        // default values
        id = 0;
        name = "Unknown";
        course = "Unknown";
        fee = 0.0;
    }

    // Second constructor with one int and one string parameter
    public Student(int i, String n) {
        id = i;
        name = n;
        course = "Unknown";
        fee = 0.0;
    }

    // Third constructor with three parameters
    public Student(int i, String n, String c, double f) {
        id = i;
        name = n;
        course = c;
        fee = f;
    }

    public void display() {
        System.out.println("ID: " + id + " Name: " + name + " Course: " + course + " Fee: " + fee);
    }
}
public class StudentDemo {
    public static void main(String[] args) {
        // Creating objects using the first constructor
        Student s1 = new Student();
        s1.display(); // ID: 0 Name: Unknown Course: Unknown Fee: 0.0

        // Creating objects using the second constructor
        Student s2 = new Student(101, "John Doe");
        s2.display(); // ID: 101 Name: John Doe Course: Unknown Fee: 0.0

        // Creating objects using the third constructor
        Student s3 = new Student(102, "Jane Smith", "Computer Science", 15000.0);
        s3.display(); // ID: 102 Name: Jane Smith Course: Computer Science Fee: 15000.0
    }
}

