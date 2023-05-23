package oop.inheritance;

public class StudentAndEmployeeDemo {
    public static void main(String[] args) {
        Student student = new Student("XYZ",21,"India",7,8);
        student.introduce();
        student.studentDetails();
        Employee employee = new Employee("ABC",30,"India","Eng",6);
        employee.introduce();
        employee.employeeDetails();

        Person person = student;
        person.introduce();
        //person.studentDetails(); // Compile time error
    }
}
