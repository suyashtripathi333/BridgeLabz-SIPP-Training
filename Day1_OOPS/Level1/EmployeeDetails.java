package Day1_OOPS.Level1;

import java.util.Scanner;

public class EmployeeDetails {
    String name;
    int id;
    double salary;

    void setDetails(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Salary: " + salary);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EmployeeDetails emp = new EmployeeDetails();
        emp.setDetails(sc.next(), sc.nextInt(), sc.nextDouble());
        emp.displayDetails();
    }
}

