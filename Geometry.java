/*4) Create a class "Geometry" with overloaded methods to calculate the area
of a square, rectangle, and circle. Use appropriate parameters for each
method. Write a java program to test the implementation.*/

import java.util.Scanner;

class Geometry {
    private double side;
    private double length;
    private double weidth;
    private float radius;

    public Geometry (double side) {
        this.side = side;
    }

    public Geometry (double length, double weidth) {
        this.length = length;
        this.weidth = weidth;
    }

    public Geometry (float radius) {
        this.radius = radius; 
   }

    public double getAreaOfSquare() {
        return this.side*side;
    }

    public double getAreaOfrectangle() {
        return this.length * this.weidth;
    }

    public float getAreaOfcircle() {
        return 3.14159f * (this.radius * this.radius);
    }

}

 class GeometryTest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the side of Square: ");
        double side = sc.nextDouble();

        Geometry Square = new Geometry(side);

        System.out.print("Enter the length of rectangle: ");
        double length = sc.nextDouble();
        System.out.print("Enter the weidth of rectangle: ");
        double weidth = sc.nextDouble();

        Geometry rectangle = new Geometry(length, weidth);

        System.out.print("Enter the radius of circle: ");
        float radius = sc.nextFloat();

        Geometry circle = new Geometry(radius);

        System.out.println("Area of Square : " +Square.getAreaOfSquare());
        System.out.println("Area of rectangle : " +rectangle.getAreaOfrectangle());
        System.out.println("Area of circle : " +circle.getAreaOfcircle());
    }
}