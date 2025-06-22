// Program 5: Double Operations with Operator Precedence
import java.util.Scanner;

public class DoubleOpt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input values a, b, c as double
        System.out.print("Enter double a: ");
        double a = sc.nextDouble();
        
        System.out.print("Enter double b: ");
        double b = sc.nextDouble();
        
        System.out.print("Enter double c: ");
        double c = sc.nextDouble();
        
        // Compute expressions
        double result1 = a + b * c;
        double result2 = a * b + c;
        double result3 = c + a / b;
        double result4 = a % b + c;
        
        // Print results
        System.out.println("The results of Double Operations are: ");
        System.out.println("a + b * c = " + result1);
        System.out.println("a * b + c = " + result2);
        System.out.println("c + a / b = " + result3);
        System.out.println("a % b + c = " + result4);
        
        sc.close();
    }
}
