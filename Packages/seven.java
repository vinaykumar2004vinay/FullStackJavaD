interface A
    {
        int add(int n1, int n2);
    }

interface B extends A
    {
        int sub(int n1, int n2);
    }

class C implements B
    {
        public int add(int n1, int n2)
        {
            return n1 + n2;
        }

        public int sub(int n1, int n2)
        {
            return n1 - n2;
        }
    }

public class seven
{
    public static void main(String[] args)
    {
        C obj = new C();
        int r1 = obj.add(5, 2);
        int r2 = obj.sub(10, 5);

        System.out.println(r1); 
        System.out.println(r2); 
    }
}