package Day1_OOPS.Level2;
import java.util.Scanner;

public class StudentReport {
    String name;
    int rollNumber;
    int marks;

    void setDetails(String name, int rollNumber, int marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    char calculateGrade() {
        if (marks >= 90) return 'A';
        if (marks >= 80) return 'B';
        if (marks >= 70) return 'C';
        if (marks >= 60) return 'D';
        return 'F';
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNumber);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + calculateGrade());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentReport s = new StudentReport();
        s.setDetails(sc.next(), sc.nextInt(), sc.nextInt());
        s.display();
    }
}
