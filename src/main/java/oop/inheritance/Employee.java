package oop.inheritance;

public class Employee extends Person{
    private String department;
    private float yearOfExperience;

    public Employee(String name,int age,String address,String department,float yearOfExperience){
        super(name,age,address);
        this.department = department;
        this.yearOfExperience = yearOfExperience;
    }

    public void employeeDetails(){
        System.out.println("I work at "+department+ " department and having "+yearOfExperience+" years of experience");
    }
}
