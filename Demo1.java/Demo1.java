class Employees
{
    int eid;
    String ename;
    String loc;
    double esal;
}

public class Demo1
{
    public static void main(String[] args)
    {
        Employees obj = new Employees();
        obj.eid = 101;
        obj.ename = "Vinay";
        obj.loc = "Bengaluru";
        obj.esal = 45000.45;

        System.out.println("eid = " + obj.eid + "---" + "ename = " + obj.ename + "---" + "loc = " + obj.loc + "---" + "esal = " + obj.esal);
    }
}