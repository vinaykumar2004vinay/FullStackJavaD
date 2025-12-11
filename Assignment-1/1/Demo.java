class Student
{
    int id;
    String name;
    int marks;

    Student(int id, String name, int marks)
    {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    void display()
    {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + calculateGrade());
        System.out.println("------------------------");
    }

    String calculateGrade()
    {
        if (marks >= 90)
            {
            return "A";
            }
        else if (marks >= 75)
            {
            return "B";
            }
        else if (marks >= 50)
            {
            return "C";
            }
        else
            {
            return "Fail";
        }
    }

    public static void main(String[] args)
    {
        Student obj1 = new Student(101, "Rahul", 92);
        Student obj2 = new Student(102, "Sonia", 76);
        Student obj3 = new Student(103, "Modi", 45);

        obj1.display();
        obj2.display();
        obj3.display();
    }
}