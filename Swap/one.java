public class one
{
    public static void main(String[] args)
    {
        int a = 22;
        int b = 37;
        a = a + b;
        b = a - b; 
        a = a - b; 
        System.out.println("After swapping: a = " + a + ", b = " + b);
    }
}