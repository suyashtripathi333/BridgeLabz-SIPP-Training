
import java.util.Scanner;

public class ElectionBooth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c1 = 0, c2 = 0, c3 = 0;
        while (true) {
            System.out.print("Enter age or -1 to exit: ");
            int age = sc.nextInt();
            if (age == -1) break;

            if (age >= 18) {
                System.out.print("Vote for Candidate 1, 2, or 3: ");
                int vote = sc.nextInt();
                if (vote == 1) c1++;
                else if (vote == 2) c2++;
                else if (vote == 3) c3++;
                else System.out.println("Invalid vote.");
            } else {
                System.out.println("Not eligible to vote.");
            }
        }

        System.out.println("Votes:");
        System.out.println("Candidate 1: " + c1);
        System.out.println("Candidate 2: " + c2);
        System.out.println("Candidate 3: " + c3);
    }
}

