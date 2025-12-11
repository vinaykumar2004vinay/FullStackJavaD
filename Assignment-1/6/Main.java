class AreaCalculator
{
    int area(int side)
    {
        return side * side;
    }
    int area(int length, int width)
    {
        return length * width;
    }
    double area(double radius)
    {
        return Math.PI * radius * radius;
    }
}

public class Main
{
    public static void main(String[] args) {
        AreaCalculator calc = new AreaCalculator();
        System.out.println("Square Area: " + calc.area(5));            
        System.out.println("Rectangle Area: " + calc.area(4, 6));      
        System.out.println("Circle Area: " + calc.area(4.0));           
    }
}