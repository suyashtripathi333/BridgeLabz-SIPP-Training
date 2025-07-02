package Day1_OOPS.Level2;

import java.util.Scanner;

public class PalindromeChecker {
    String text;

    void setText(String text) {
        this.text = text;
    }

    boolean isPalindrome() {
        int i = 0, j = text.length() - 1;
        while (i < j) {
            if (text.charAt(i) != text.charAt(j)) return false;
            i++; j--;
        }
        return true;
    }

    void displayResult() {
        System.out.println(text + (isPalindrome() ? " is a palindrome" : " is not a palindrome"));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PalindromeChecker p = new PalindromeChecker();
        p.setText(sc.next());
        p.displayResult();
    }
}

