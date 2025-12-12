// StudentStaticDemo.java
public class StudentStaticDemo {
    public static void main(String[] args) {
        StudentStatic.schoolName = "St. Xavier High School";

        StudentStatic s1 = new StudentStatic(1, "Meera", 85);
        StudentStatic s2 = new StudentStatic(2, "Rohan", 72);
        StudentStatic s3 = new StudentStatic(3, "Asha", 65);

        s1.display();
        s2.display();

        // change schoolName
        StudentStatic.schoolName = "Green Valley School";
        s3.display(); // will show updated school name
    }
}

class StudentStatic {
    int id;
    String name;
    double marks;
    static String schoolName;

    public StudentStatic(int id, String name, double marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    public void display() {
        System.out.printf("ID:%d Name:%s Marks:%.1f School:%s%n", id, name, marks, schoolName);
    }
}