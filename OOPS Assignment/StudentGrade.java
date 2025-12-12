// StudentGrade.java
public class StudentGrade {
    int id;
    String name;
    double marks;

    public StudentGrade(int id, String name, double marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    public String calculateGrade() {
        if (marks >= 90) return "A";
        if (marks >= 75) return "B";
        if (marks >= 50) return "C";
        return "Fail";
    }

    public void displayDetails() {
        System.out.println("ID: " + id + ", Name: " + name + ", Marks: " + marks + ", Grade: " + calculateGrade());
    }

    public static void main(String[] args) {
        StudentGrade s1 = new StudentGrade(1, "Alice", 92.5);
        StudentGrade s2 = new StudentGrade(2, "Bob", 78.0);
        StudentGrade s3 = new StudentGrade(3, "Charlie", 46.0);

        s1.displayDetails();
        s2.displayDetails();
        s3.displayDetails();
    }
}