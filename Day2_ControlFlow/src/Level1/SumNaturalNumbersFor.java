import java.util.Scanner;

public class SumNaturalNumbersFor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n <= 0) {
            System.out.println("Enter a natural number");
            return;
        }
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        int formulaResult = n * (n + 1) / 2;
        System.out.println("Sum using for loop: " + sum);
        System.out.println("Sum using formula: " + formulaResult);
        System.out.println("Both results are equal? " + (sum == formulaResult));
    }
}
