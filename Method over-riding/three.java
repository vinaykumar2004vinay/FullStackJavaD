class A
{
    public void show()
    {
        System.out.println("In A-Show");
    }
    public void config()
    {
        System.out.println("In A-Config");
    }
}

class B extends A
{

}

public class three
{
    public static void main(String[] args)
    {
        B obj = new B();
        obj.show();
        obj.config();
    }
}