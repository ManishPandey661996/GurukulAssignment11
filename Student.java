/*2) Implement a class "Student" with instance variables (name, rollNumber)
and a parameterized constructor. Inside the constructor, use the "this"
keyword to differentiate between instance variables and constructor
parameters. Write a java program to print the instance variable values.*/

import java.util.Scanner;
class Student{
    private int rollNumber;
    private String name;

    public Student(int rollNumber , String name){
        this.rollNumber = rollNumber;
        this.name = name;
    }

    public void print(){
        System.out.println("Student name : "+ this.name);
        System.out.println("Student roll number : "+ this.rollNumber);
    }
}

class StudentTest{
    public static void main(String[] args){
        int rollno ;
        String name;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name : ");
        name = sc.nextLine();
        System.out.println(" Enter the value of rollNo : ");
        rollno = sc.nextInt();
        

        Student s1 = new Student(rollno , name );
        s1.print();
    }

}