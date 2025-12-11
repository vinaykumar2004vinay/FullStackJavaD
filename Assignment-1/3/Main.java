public class Main
{
    public static void main(String[] args)
    {
        Product obj1 = new Product(101, "Laptop", 100000.0);
        Product obj2 = new Product(102, "Headphones", 5000.0);

        obj1.displayProduct();
        obj2.displayProduct();
        System.out.println(); 

        obj1.Discount(10); 
        obj1.displayProduct();
        obj2.Discount(50);
        obj2.displayProduct();
    }
}