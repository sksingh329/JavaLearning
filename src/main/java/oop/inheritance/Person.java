package oop.inheritance;

public class Person {
    private String name;
    private int age;
    private String address;

    public Person(String name,int age,String address){
        this.name = name;
        this.age = age;
        this.address = address;
    }
    public void introduce(){
        System.out.println("My name is "+name+ ", I am "+age+" years old and my address is "+address);
    }
}
