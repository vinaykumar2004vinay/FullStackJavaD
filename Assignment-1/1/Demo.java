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
        Student obj1 = new Student(101, "Rahul", 10);
        Student obj2 = new Student(102, "Sonia", 20);
        Student obj3 = new Student(103, "Modi", 30);
        Student obj4 = new Student(104, "Amith", 40);
        Student obj5 = new Student(105, "Ram", 50);
        Student obj6 = new Student(106, "Raj", 60);
        Student obj7 = new Student(107, "Vinau", 70);
        Student obj8 = new Student(108, "Varun", 80);
        Student obj9 = new Student(109, "Manams",90);
        Student obj10= new Student(110, "Amar", 100);

        obj1.display();
        obj2.display();
        obj3.display();
        obj4.display();
        obj5.display();
        obj6.display();
        obj7.display();
        obj8.display();
        obj9.display();
        obj10.display();
    }
}