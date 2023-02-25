import java.util.Scanner;
import java.lang.Math;
public class AreaOfCTS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // area of circle = pi * r * r
        double r;
        System.out.print("enter radius of circle : ");
        r = sc.nextDouble();
        System.out.println("Area of circle = "+circle(r));

        // area of triangle = base * height
        double base , height;
        System.out.print("enter base of triangle : ");
        base = sc.nextDouble();
        System.out.print("enter height of triangle : ");
        height = sc.nextDouble();
        System.out.println("Area of triangle = "+triangle(base , height));

        // area of square = side * side 
        double side;
        System.out.print("enter side of square : ");
        side = sc.nextDouble();
        System.out.println("Area of triangle = "+square(side));
        sc.close();
    }
    // circle
    public static double circle(double a){
        double area = (Math.PI)*a*a;
        return area;
    }
    // triangle 
    public static double triangle(double b , double c){
        double area = b * c / 2;
        return area;
    }

    //square
    public static double square(double d) {
        double area = d * d;
        return area;
    }
}
