// EmployeeManagerDemo.java
public class EmployeeManagerDemo {
    public static void main(String[] args) {
        Employee e = new Employee("Anita", 35000);
        Manager m = new Manager("Suresh", 50000, 15000);

        System.out.println(e.getName() + " Salary: " + e.calculateSalary());
        System.out.println(m.getName() + " Salary: " + m.calculateSalary());
    }
}

class Employee {
    private String name;
    private double basicSalary;

    public Employee(String name, double basicSalary) {
        this.name = name;
        this.basicSalary = basicSalary;
    }

    public double calculateSalary() {
        return basicSalary;
    }

    public String getName() {
        return name;
    }
}

class Manager extends Employee {
    private double bonus;

    public Manager(String name, double basicSalary, double bonus) {
        super(name, basicSalary);
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        return super.calculateSalary() + bonus;
    }
}