package Day2_Constructors.Level2;

public class Course {
    String courseName;
    int duration;
    double fee;
    static String instituteName = "SkillHub";

    Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    void displayCourseDetails() {
        System.out.println(courseName + " " + duration + " " + fee + " " + instituteName);
    }

    static void updateInstituteName(String name) {
        instituteName = name;
    }

    public static void main(String[] args) {
        Course c1 = new Course("Java", 12, 4999.0);
        c1.displayCourseDetails();
        Course.updateInstituteName("TechVerse");
        Course c2 = new Course("Python", 10, 3999.0);
        c2.displayCourseDetails();
    }
}
