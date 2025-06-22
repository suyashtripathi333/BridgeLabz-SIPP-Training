import java.util.Scanner;

public class SumNaturalNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n <= 0) {
            System.out.println("Enter a natural number");
            return;
        }
        int sum = 0, i = 1;
        while (i <= n) {
            sum += i;
            i++;
        }
        int formulaResult = n * (n + 1) / 2;
        System.out.println("Sum using while loop: " + sum);
        System.out.println("Sum using formula: " + formulaResult);
        System.out.println("Both results are equal? " + (sum == formulaResult));
    }
}
