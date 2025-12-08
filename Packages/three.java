class Calc
{
    public int add(int n1,int n2)
    {
        return n1+n2;
    }
    public int sub(int n1,int n2)
    {
        return n1-n2;
    }
}

class AdvCalc extends Calc
{
    public int mul(int n1,int n2)
    {
        return n1*n2;
    }
    public int div(int n1,int n2)
    {
        return n1/n2;
    }
}

public class three
{
    public static void main(String[] args)
    {
        AdvCalc obj = new AdvCalc();
        int r1 = obj.add(5,3);
        int r2 = obj.sub(3,1);
        int r3 = obj.mul(2,3);
        int r4 = obj.div(10,2);

        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
        System.out.println(r4);
    }
}