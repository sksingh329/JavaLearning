package oop.inheritance;

public class Student extends Person{
    private int semester;
    private float gpa;

    public Student(String name,int age,String address,int semester,float gpa){
        super(name,age,address);
        this.semester = semester;
        this.gpa = gpa;
    }

    public void studentDetails(){
        System.out.println("I study at "+semester+ " semester and my gpa is "+gpa);
    }
}
