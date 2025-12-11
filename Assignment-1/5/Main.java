class Animal
{
    void Sound()
    {
        System.out.println("sound");
    }
}

class Dog extends Animal
{
    void Sound()
    {
        System.out.println("Dog - " + "Bark");
    }
}

class Cat extends Animal
{
    void Sound()
    {
        System.out.println("Cat - " + "Meow");
    }
}

class Cow extends Animal
{
    void Sound()
    {
        System.out.println("Cow - " + "Moo");
    }
}

public class Main
{
    public static void main(String[] args)
    {
        Animal obj1 = new Dog();
        Animal obj2 = new Cat();
        Animal obj3 = new Cow();

        obj1.Sound();
        obj2.Sound(); 
        obj3.Sound();
    }
}