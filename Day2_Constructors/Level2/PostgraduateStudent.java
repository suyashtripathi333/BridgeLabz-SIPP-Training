package Day2_Constructors.Level2;

public class PostgraduateStudent extends Student {
    String specialization;

    public PostgraduateStudent(int rollNumber, String name, double CGPA, String specialization) {
        super(rollNumber, name, CGPA);
        this.specialization = specialization;
    }

    public void display() {
        System.out.println(rollNumber);
        System.out.println(name);
        System.out.println(getCGPA());
        System.out.println(specialization);
    }

    public static void main(String[] args) {
        PostgraduateStudent pg = new PostgraduateStudent(101, "Rohan", 8.6, "AI");
        pg.display();
        pg.setCGPA(9.0);
        System.out.println("Updated CGPA: " + pg.getCGPA());
    }
}
