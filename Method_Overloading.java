import java.util.Scanner;

class Shape {
    void area(double radius) {
        double result = Math.PI * radius * radius;
        System.out.printf("Area of Circle: %.2f\n", result);
    }

    void area(int length, int breadth) {
        int result = length * breadth;
        System.out.println("Area of Rectangle: " + result);
    }
}

public class shapeMain {   // ✅ Rename main class
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Shape shape = new Shape();

        System.out.println("---Area Calculator---");

        System.out.print("Enter radius of circle: ");
        double r = sc.nextDouble();
        shape.area(r);

        System.out.print("Enter length and breadth of Rectangle: ");
        int l = sc.nextInt();
        int b = sc.nextInt();
        shape.area(l, b);

        System.out.print("Enter side of Square: ");
        float s = sc.nextFloat();
        shape.area(s);   // calls double method

        sc.close();
    }
}
