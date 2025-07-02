package Day1_OOPS.Level1;

import java.util.Scanner;

public class CircleAreaCircumference {
    double radius;

    void setRadius(double radius) {
        this.radius = radius;
    }

    double calculateArea() {
        return Math.PI * radius * radius;
    }

    double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CircleAreaCircumference circle = new CircleAreaCircumference();
        circle.setRadius(sc.nextDouble());
        System.out.println("Area: " + circle.calculateArea());
        System.out.println("Circumference: " + circle.calculateCircumference());
    }
}
