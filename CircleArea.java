import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {
        
        double pi = 3.14159;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        double area = pi * radius * radius;

        System.out.println("The area of the circle is: " + area);
    }
}
