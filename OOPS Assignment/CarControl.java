// CarControl.java
public class CarControl {
    public static void main(String[] args) {
        Car car = new Car();
        car.accelerate(50);
        car.accelerate(30);
        car.brake(60);
        car.brake(50); // should not go below 0
        System.out.println("Final speed: " + car.getSpeed());
    }
}

class Car {
    private int speed = 0;

    public void accelerate(int value) {
        if (value > 0) {
            speed += value;
            System.out.println("Accelerated by " + value + ". Speed: " + speed);
        } else {
            System.out.println("Acceleration value must be positive.");
        }
    }

    public void brake(int value) {
        if (value <= 0) {
            System.out.println("Brake value must be positive.");
            return;
        }
        speed -= value;
        if (speed < 0) speed = 0;
        System.out.println("Applied brake " + value + ". Speed: " + speed);
    }

    public int getSpeed() {
        return speed;
    }
}