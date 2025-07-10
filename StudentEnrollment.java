

interface Graded {
    void assignGrade(String grade);
}

class Course {
    String courseName;
    String courseCode;

    Course(String courseName, String courseCode) {
        this.courseName = courseName;
        this.courseCode = courseCode;
    }
}

class Faculty {
    String facultyName;
    int age;

    Faculty(String facultyName, int age) {
        this.facultyName = facultyName;
        this.age = age;
    }
}

class Student implements Graded {
    String name;
    int age;
    int rollNumber;
    String emailId;
    Course enrolledCourse;
    Faculty faculty;
    private double gpa = 0.0;
    private int totalPoints = 0;
    private int totalCourses = 0;

    Student(String name, int age, int rollNumber, String emailId, Course course, Faculty faculty) {
        this.name = name;
        this.age = age;
        this.rollNumber = rollNumber;
        this.emailId = emailId;
        this.enrolledCourse = course;
        this.faculty = faculty;
    }

    public void assignGrade(String grade) {
        int points = 0;
        if (grade.equals("A")) points = 10;
        else if (grade.equals("B")) points = 8;
        else if (grade.equals("C")) points = 6;
        else if (grade.equals("D")) points = 4;
        else points = 0;

        totalPoints = totalPoints + points;
        totalCourses = totalCourses + 1;
        gpa = (double) totalPoints / totalCourses;
    }

    public double getGPA() {
        return gpa;
    }

    public void viewTranscript() {
        System.out.println("Student: " + name);
        System.out.println("Course: " + enrolledCourse.courseName);
        System.out.println("Faculty: " + faculty.facultyName);
        System.out.println("GPA: " + gpa);
    }
}

class Undergrad extends Student {
    Undergrad(String name, int age, int rollNumber, String emailId, Course course, Faculty faculty) {
        super(name, age, rollNumber, emailId, course, faculty);
    }
}

class Postgrad extends Student {
    Postgrad(String name, int age, int rollNumber, String emailId, Course course, Faculty faculty) {
        super(name, age, rollNumber, emailId, course, faculty);
    }
}

public class StudentEnrollment {
    public static void main(String[] args) {
        Course course1 = new Course("Data Structures", "CS101");
        Faculty faculty1 = new Faculty("Dr. Suresh", 45);
        Undergrad s1 = new Undergrad("Suyash", 21, 158, "suyash@example.com", course1, faculty1);
        s1.assignGrade("A");
        s1.assignGrade("B");
        s1.viewTranscript();
    }
}
