// Program 3: Find Quotient and Remainder
import java.util.Scanner;

public class DivisionCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input two numbers
        System.out.print("Enter first number: ");
        int number1 = sc.nextInt();
        
        System.out.print("Enter second number: ");
        int number2 = sc.nextInt();
        
        // Calculate quotient and remainder
        int quotient = number1 / number2;
        int remainder = number1 % number2;
        
        System.out.println("The Quotient is " + quotient + 
                           " and Remainder is " + remainder + 
                           " of two numbers " + number1 + " and " + number2);
        sc.close();
    }
}

