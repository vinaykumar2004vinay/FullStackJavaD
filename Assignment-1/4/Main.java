class Employee
{
    String name;
    double Salary;

    Employee(String name, double Salary)
    {
        this.name = name;
        this.Salary = Salary;
    }
}

class Manager extends Employee
{
    double bonus;

    Manager(String name, double Salary, double bonus)
    {
        super(name, Salary); 
        this.bonus = bonus;
    }

    double calculateSalary()
    {
        return Salary + bonus;
    }
}

public class Main
{
    public static void main(String[] args)
    {
        Manager obj = new Manager("Rahul", 50000, 5000);
        System.out.println("Manager Salary: " + obj.calculateSalary());
    }
}