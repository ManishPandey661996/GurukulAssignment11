/*1) Create a class "Calculator" with overloaded methods for addition,
subtraction, multiplication, and division. Implement methods for both
integers and doubles. Write a java program to test the implementation.*/

import java.util.Scanner;
class Calculator{
   

    public Calculator(){
        
    }

    public int addition(int a , int b){
        return a + b ;
    }
    public double addition(double a , double b){
        return a + b ;
    }

    public int subtraction(int a , int b){
        return a - b;
    }
    public double subtraction(double a , double b){
        return a - b;
    }

    public int multiplication(int a , int b){
        return a * b;
    }
    public double multiplication(double a , double b){
        return a * b;
    }

    public int division(int a , int b){
        return a / b;
    }
     public double division(double a , double b){
        return a / b;
    }
}

class CalculatorTest{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a , b ;
        double c , d;
        System.out.println("Enter the values of operand 1  :");
        a = sc.nextInt();
        System.out.println("Enter the values of operand 2 :");
        b = sc.nextInt();

        Calculator c1 = new Calculator();
        System.out.println("addition : "+c1.addition(a , b));
        System.out.println("subtraction : "+c1.subtraction(a , b));
        System.out.println("multiplication : "+c1.multiplication(a , b));
        System.out.println("division : "+c1.division(a , b));

        System.out.println("Enter the value of operend 1 :");
        c = sc.nextDouble();
        System.out.println("Enter the value of operend 2 :");
        d = sc.nextDouble();

        System.out.println("addition : "+c1.addition(c , d));
        System.out.println("subtraction : "+c1.subtraction(c , d));
        System.out.println("multiplication : "+c1.multiplication(c , d));
        System.out.println("division : "+c1.division(c , d));





    }
}