// AnimalSoundDemo.java
public class AnimalSoundDemo {
    public static void main(String[] args) {
        Animal a1 = new Dog();
        Animal a2 = new Cat();
        Animal a3 = new Cow();

        makeItSound(a1);
        makeItSound(a2);
        makeItSound(a3);
    }

    static void makeItSound(Animal a) {
        a.makeSound();
    }
}

class Animal {
    public void makeSound() {
        System.out.println("Some generic sound");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Dog: Bark");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Cat: Meow");
    }
}

class Cow extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Cow: Moo");
    }
}