import java.util.Scanner;

public class Circle {
    public double radius;
    public void read_radius() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the radius of circle: ");
        radius = sc.nextDouble();
        if (!valid(radius)) {
            System.out.println("Invalid input. Radius set to 0.0");
            radius = 0.0;
        }
        sc.close();
    }

    public boolean valid(double r) {
        if(r >= 0 )
            return true;
        return false;
    }
    public double area(double r) {
        return Math.PI * (r * r);
    }

    public double circumference(double r) {
        return 2 * Math.PI * r;
    }
    
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.read_radius();
        double c = circle.circumference(circle.radius);
        double a = circle.area(circle.radius);
        System.out.println("The circumference of the circle is: " + c);
        System.out.println("The area of the circle is: " + a);

    }
}
