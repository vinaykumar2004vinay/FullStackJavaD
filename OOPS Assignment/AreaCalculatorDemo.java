// AreaCalculatorDemo.java
public class AreaCalculatorDemo {
    public static void main(String[] args) {
        AreaCalculator calc = new AreaCalculator();

        System.out.println("Square area (side=4): " + calc.area(4));
        System.out.println("Rectangle area (2x5): " + calc.area(2, 5));
        System.out.println("Circle area (r=3): " + calc.area(3.0));
    }
}

class AreaCalculator {
    public int area(int side) { // square
        return side * side;
    }

    public int area(int length, int width) { // rectangle
        return length * width;
    }

    public double area(double radius) { // circle
        return Math.PI * radius * radius;
    }
}