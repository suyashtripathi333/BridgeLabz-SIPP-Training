// Program 4: Integer Operations with Operator Precedence
import java.util.Scanner;

public class IntOperation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input values a, b, c
        System.out.print("Enter integer a: ");
        int a = sc.nextInt();
        
        System.out.print("Enter integer b: ");
        int b = sc.nextInt();
        
        System.out.print("Enter integer c: ");
        int c = sc.nextInt();
        
        // Compute expressions based on operator precedence
        int result1 = a + b * c;      // Multiplication before addition
        int result2 = a * b + c;      // Multiplication before addition
        int result3 = c + a / b;      // Division before addition
        int result4 = a % b + c;      // Modulus before addition
        
        // Print results
        System.out.println("The results of Int Operations are: ");
        System.out.println("a + b * c = " + result1);
        System.out.println("a * b + c = " + result2);
        System.out.println("c + a / b = " + result3);
        System.out.println("a % b + c = " + result4);
        
        sc.close();
    }
}
